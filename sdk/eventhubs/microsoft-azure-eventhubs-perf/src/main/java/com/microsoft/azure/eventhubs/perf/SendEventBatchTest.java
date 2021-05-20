// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.eventhubs.perf;

import com.azure.perf.test.core.TestDataCreationHelper;
import com.microsoft.azure.eventhubs.BatchOptions;
import com.microsoft.azure.eventhubs.EventData;
import com.microsoft.azure.eventhubs.EventDataBatch;
import com.microsoft.azure.eventhubs.EventHubException;
import com.microsoft.azure.eventhubs.perf.core.EventHubsPerfStressOptions;
import com.microsoft.azure.eventhubs.perf.core.ServiceTest;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;

/**
 * Runs the Send Events Batch Performance Test for EventHubs.
 */
public class SendEventBatchTest extends ServiceTest<EventHubsPerfStressOptions> {
    private final BatchOptions batchOptions;
    private EventDataBatch eventDataBatch;

    /**
     * Instantiates the instance of the Send Event Batch test.
     *
     * @param options the options bag to use for performance testing.
     * @throws Exception when an error occurs when creating event batch.
     */
    public SendEventBatchTest(EventHubsPerfStressOptions options) throws Exception {
        super(options);

        batchOptions = new BatchOptions();

        if (options.getBatchSize() != null) {
            batchOptions.maxMessageSize = options.getBatchSize();
        }

        if (options.getPartitionKey() != null) {
            batchOptions.partitionKey = options.getPartitionKey();
        }
    }

    @Override
    public Mono<Void> setupAsync() {
        return super.setupAsync()
            .then(Mono.fromCallable(() -> {
                eventDataBatch = eventHubClient.createBatch(batchOptions);
                EventData eventData =  EventData.create(TestDataCreationHelper
                    .generateRandomString(options.getMessageSize())
                    .getBytes(StandardCharsets.UTF_8));
                for (int i = 0; i < options.getEvents(); i++) {
                    if (!eventDataBatch.tryAdd(EventData.create(TestDataCreationHelper
                        .generateRandomString(options.getMessageSize())
                        .getBytes(StandardCharsets.UTF_8)))) {
                        throw new RuntimeException(String.format("Batch can only fit %d number of messages with "
                                + "batch size of %s ", i , options.getBatchSize() == null ?"default"
                                : options.getBatchSize().toString()));
                    }
                }
                return 1;
            }))
            .then();
    }

    // Perform the API call to be tested here
    @Override
    public void run() {
        try {
            eventHubClient.sendSync(eventDataBatch);
        } catch (EventHubException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Mono<Void> runAsync() {
        return Mono.fromFuture(eventHubClient.send(eventDataBatch));
    }
}
