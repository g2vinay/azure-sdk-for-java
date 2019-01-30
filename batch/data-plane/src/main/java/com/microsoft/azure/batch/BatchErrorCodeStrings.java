/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch;

/**
 * Error code strings returned from the Batch service.
 */
public final class BatchErrorCodeStrings {
    // Batch Service

    /**
     * The specified account is disabled.
     */
    public static final String ACCOUNT_IS_DISABLED = "ACCOUNT_IS_DISABLED";

     /**
      *  The account has reached its quota of active jobs and job schedules.
      */
    public static final String ACTIVE_JOB_AND_SCHEDULE_QUOTA_REACHED = "ACTIVE_JOB_AND_SCHEDULE_QUOTA_REACHED";

     /**
      * The specified application does not exist.
      */
    public static final String APPLICATION_NOT_FOUND = "APPLICATION_NOT_FOUND";

     /**
      * An automatic scaling formula has a syntax error.
      */
    public static final String AUTO_SCALING_FORMULA_SYNTAX_ERROR = "AUTO_SCALING_FORMULA_SYNTAX_ERROR";

     /**
      * An automatic scaling formula is too long. The maximum length is 8192 characters.
      */
    public static final String AUTO_SCALE_FORMULA_TOO_LONG = "AUTO_SCALE_FORMULA_TOO_LONG";

     /**
      * Enable AutoScale requests for the same pool must be separated by at least 30 seconds.
      */
    public static final String TOO_MANY_ENABLE_AUTO_SCALE_REQUESTS = "TOO_MANY_ENABLE_AUTO_SCALE_REQUESTS";

     /**
      * A certificate operation was attempted which is not permitted when the certificate is in the process of being deleted.
      */
    public static final String CERTIFICATE_BEING_DELETED = "CERTIFICATE_BEING_DELETED";

     /**
      * The certificate you are attempting to add already exists.
      */
    public static final String CERTIFICATE_EXISTS = "CERTIFICATE_EXISTS";

     /**
      * The certificate on which an operation was attempted is not present in the Batch account.
      */
    public static final String CERTIFICATE_NOT_FOUND = "CERTIFICATE_NOT_FOUND";

     /**
      * A certificate operation was attempted which is not permitted when the certificate is active.
      */
    public static final String CERTIFICATE_STATE_ACTIVE = "CERTIFICATE_STATE_ACTIVE";

     /**
      * A certificate could not be deleted because it is still in use.
      */
    public static final String CERTIFICATE_DELETE_FAILED = "CERTIFICATE_DELETE_FAILED";

     /**
      * A node file requested from a task or compute node was not found.
      */
    public static final String FILE_NOT_FOUND = "FILE_NOT_FOUND";

     /**
      * One or more application package references could not be satisfied. This occurs if the application
      * ID or version does not exist or is not active, or if the reference did not specify a version and
      * there is no default version configured.
      */
    public static final String INVALID_APPLICATION_PACKAGE_REFERENCES = "INVALID_APPLICATION_PACKAGE_REFERENCES";

     /**
      * A pool specification specifies one or more invalid certificates (for example, certificates that are
      * not present in the Batch account).
      */
    public static final String INVALID_CERTIFICATE_REFERENCES = "INVALID_CERTIFICATE_REFERENCES";

     /**
      * A value in a job or task constraint is out of range.
      */
    public static final String INVALID_CONSTRAINT_VALUE = "INVALID_CONSTRAINT_VALUE";

     /**
      * There is a conflict between the REST API being used and the account.
      */
    public static final String INVALID_REST_APIFOR_ACCOUNT_SETTING = "INVALID_REST_APIFOR_ACCOUNT_SETTING";

     /**
      * A job operation was attempted which is not permitted when the job is in the process of being deleted.
      */
    public static final String JOB_BEING_DELETED = "JOB_BEING_DELETED";

     /**
      * A job operation was attempted which is not permitted when the job is in the process of being terminated.
      */
    public static final String JOB_BEING_TERMINATED = "JOB_BEING_TERMINATED";

     /**
      * A job operation was attempted which is not permitted when the job has been completed.
      */
    public static final String JOB_COMPLETED = "JOB_COMPLETED";

     /**
      * A job operation was attempted which is not permitted when the job is not active.
      */
    public static final String JOB_NOT_ACTIVE = "JOB_NOT_ACTIVE";

     /**
      * The specified job exists.
      */
    public static final String JOB_EXISTS = "JOB_EXISTS";

     /**
      * A Job Preparation task was not run on a compute node.
      */
    public static final String JOB_PREPARATION_TASK_NOT_RUN_ON_NODE = "JOB_PREPARATION_TASK_NOT_RUN_ON_NODE";

     /**
      * The specified job does not have a Job Preparation task.
      */
    public static final String JOB_PREPARATION_TASK_NOT_SPECIFIED = "JOB_PREPARATION_TASK_NOT_SPECIFIED";

     /**
      * A Job Release task was not run on a compute node.
      */
    public static final String JOB_RELEASE_TASK_NOT_RUN_ON_NODE = "JOB_RELEASE_TASK_NOT_RUN_ON_NODE";

     /**
      * The specified job does not have a Job Release task.
      */
    public static final String JOB_RELEASE_TASK_NOT_SPECIFIED = "JOB_RELEASE_TASK_NOT_SPECIFIED";

     /**
      * The job on which an operation was attempted is not present in the Batch account.
      */
    public static final String JOB_NOT_FOUND = "JOB_NOT_FOUND";

     /**
      * An I/O error occurred while trying to access a resource within the Batch account.
      */
    public static final String IOERROR = "IOERROR";

     /**
      * The specified operation is not valid for the current state of the resource.
      */
    public static final String OPERATION_INVALID_FOR_CURRENT_STATE = "OPERATION_INVALID_FOR_CURRENT_STATE";

     /**
      * The specified Azure Guest OS version is disabled.
      */
    public static final String OSVERSION_DISABLED = "OSVERSION_DISABLED";

     /**
      * The specified Azure Guest OS version is expired.
      */
    public static final String OSVERSION_EXPIRED = "OSVERSION_EXPIRED";

     /**
      * The specified Azure Guest OS version was not found.
      */
    public static final String OSVERSION_NOT_FOUND = "OSVERSION_NOT_FOUND";

     /**
      * A job priority was specified which was outside the permitted range of -1000 to 1000.
      */
    public static final String OUT_OF_RANGE_PRIORITY = "OUT_OF_RANGE_PRIORITY";

     /**
      * A file path was not found on a compute node.
      */
    public static final String PATH_NOT_FOUND = "PATH_NOT_FOUND";

     /**
      * A pool operation was attempted which is not permitted when the pool is in the process of being deleted.
      */
    public static final String POOL_BEING_DELETED = "POOL_BEING_DELETED";

     /**
      * A pool operation was attempted which is not permitted when the pool is in the process of being resized.
      */
    public static final String POOL_BEING_RESIZED = "POOL_BEING_RESIZED";

     /**
      * A pool operation was attempted which is not permitted when the pool is in the process of being created.
      */
    public static final String POOL_BEING_CREATED = "POOL_BEING_CREATED";

     /**
      * The pool you are attempting to add already exists.
      */
    public static final String POOL_EXISTS = "POOL_EXISTS";

     /**
      * The specified pool is not eligible for an operating system version upgrade.
      */
    public static final String POOL_NOT_ELIGIBLE_FOR_OSVERSION_UPGRADE = "POOL_NOT_ELIGIBLE_FOR_OSVERSION_UPGRADE";

     /**
      * The pool on which an operation was attempted is not present in the Batch account.
      */
    public static final String POOL_NOT_FOUND = "POOL_NOT_FOUND";

     /**
      * The account has reached its quota of pools.
      */
    public static final String POOL_QUOTA_REACHED = "POOL_QUOTA_REACHED";

     /**
      * The pool is already on the operating system version to which it was asked to upgrade.
      */
    public static final String POOL_VERSION_EQUALS_UPGRADE_VERSION = "POOL_VERSION_EQUALS_UPGRADE_VERSION";

     /**
      * A requested storage account was not found.
      */
    public static final String STORAGE_ACCOUNT_NOT_FOUND = "STORAGE_ACCOUNT_NOT_FOUND";

     /**
      * A task operation was attempted which is not permitted when the task has been completed.
      */
    public static final String TASK_COMPLETED = "TASK_COMPLETED";

     /**
      * A task was specified as depending on other tasks, but the job did not specify that it would use task dependencies.
      */
    public static final String TASK_DEPENDENCIES_NOT_SPECIFIED_ON_JOB = "TASK_DEPENDENCIES_NOT_SPECIFIED_ON_JOB";

     /**
      * A task was specified as depending on other tasks, but the list of dependencies was too long to be stored.
      */
    public static final String TASK_DEPENDENCY_LIST_TOO_LONG = "TASK_DEPENDENCY_LIST_TOO_LONG";

     /**
      * A task was specified as depending on other tasks, but the list of task ID ranges was too long to be stored.
      */
    public static final String TASK_DEPENDENCY_RANGES_TOO_LONG = "TASK_DEPENDENCY_RANGES_TOO_LONG";

     /**
      * The node files for a task are not available, for example because the retention period has expired.
      */
    public static final String TASK_FILES_UNAVAILABLE = "TASK_FILES_UNAVAILABLE";

     /**
      * The files of the specified task are cleaned up.
      */
    public static final String TASK_FILES_CLEANEDUP = "TASK_FILES_CLEANEDUP";

     /**
      * The task you are attempting to add already exists.
      */
    public static final String TASK_EXISTS = "TASK_EXISTS";

     /**
      * The task ID is the same as that of the Job Preparation task.
      */
    public static final String TASK_ID_SAME_AS_JOB_PREPARATION_TASK = "TASK_ID_SAME_AS_JOB_PREPARATION_TASK";

     /**
      * The task ID is the same as that of the Job Release task.
      */
    public static final String TASK_ID_SAME_AS_JOB_RELEASE_TASK = "TASK_ID_SAME_AS_JOB_RELEASE_TASK";

     /**
      * The task on which an operation was attempted is not present in the job.
      */
    public static final String TASK_NOT_FOUND = "TASK_NOT_FOUND";

     /**
      * A compute node operation was attempted which is not permitted when the node is in the process of being created.
      */
    public static final String NODE_BEING_CREATED = "NODE_BEING_CREATED";

     /**
      * A compute node operation was attempted which is not permitted when the node is in the process of being started.
      */
    public static final String NODE_BEING_STARTED = "NODE_BEING_STARTED";

     /**
      * A compute node operation was attempted which is not permitted when the node is in the process of being rebooted.
      */
    public static final String NODE_BEING_REBOOTED = "NODE_BEING_REBOOTED";

     /**
      * A compute node operation was attempted which is not permitted when the node is in the process of being reimaged.
      */
    public static final String NODE_BEING_REIMAGED = "NODE_BEING_REIMAGED";

     /**
      * The node counts do not match.
      */
    public static final String NODE_COUNTS_MISMATCH = "NODE_COUNTS_MISMATCH";

     /**
      * The compute node on which an operation was attempted is not present in the given pool.
      */
    public static final String NODE_NOT_FOUND = "NODE_NOT_FOUND";

     /**
      * A compute node operation was attempted which is not permitted when the node is unusable.
      */
    public static final String NODE_STATE_UNUSABLE = "NODE_STATE_UNUSABLE";

     /**
      * The compute node user account you are attempting to add already exists.
      */
    public static final String NODE_USER_EXISTS = "NODE_USER_EXISTS";

     /**
      * The compute node user account on which an operation was attempted does not exist.
      */
    public static final String NODE_USER_NOT_FOUND = "NODE_USER_NOT_FOUND";

     /**
      * The specified compute node is already in the target scheduling state.
      */
    public static final String NODE_ALREADY_IN_TARGET_SCHEDULING_STATE = "NODE_ALREADY_IN_TARGET_SCHEDULING_STATE";

     /**
      * The pool is already upgrading to a different operating system version.
      */
    public static final String UPGRADE_POOL_VERSION_CONFLICT = "UPGRADE_POOL_VERSION_CONFLICT";

     /**
      * A requested job or task constraint is not supported.
      */
    public static final String UNSUPPORTED_CONSTRAINT = "UNSUPPORTED_CONSTRAINT";

     /**
      * The specified version of the Batch REST API is not supported.
      */
    public static final String UNSUPPORTED_REQUEST_VERSION = "UNSUPPORTED_REQUEST_VERSION";

     /**
      * A job schedule operation was attempted which is not permitted when the schedule is in the process of being deleted.
      */
    public static final String JOB_SCHEDULE_BEING_DELETED = "JOB_SCHEDULE_BEING_DELETED";

     /**
      * A job schedule operation was attempted which is not permitted when the schedule is in the process of being terminated.
      */
    public static final String JOB_SCHEDULE_BEING_TERMINATED = "JOB_SCHEDULE_BEING_TERMINATED";

    /**
     * A job schedule operation was attempted which is not permitted when the schedule has completed.
     */
    public static final String JOB_SCHEDULE_COMPLETED = "JOB_SCHEDULE_COMPLETED";

    /**
     * A job schedule operation was attempted which is not permitted when the schedule is disabled.
     */
    public static final String JOB_SCHEDULE_DISABLED = "JOB_SCHEDULE_DISABLED";

    /**
     * The job schedule you are attempting to add already exists in the Batch account.
     */
    public static final String JOB_SCHEDULE_EXISTS = "JOB_SCHEDULE_EXISTS";

    /**
     * The job schedule on which an operation was attempted does not exist.
     */
    public static final String JOB_SCHEDULE_NOT_FOUND = "JOB_SCHEDULE_NOT_FOUND";

    /**
     * The specified job is disabled.
     */
    public static final String JOB_DISABLED = "JOB_DISABLED";

    /**
     * A job with the specified job schedule ID exists. Job and job schedule cannot have the same ID.
     */
    public static final String JOB_WITH_SAME_ID_EXISTS = "JOB_WITH_SAME_ID_EXISTS";

    /**
     * A job schedule with the specified job ID exists. Job and job schedule cannot have the same ID.
     */
    public static final String JOB_SCHEDULE_WITH_SAME_ID_EXISTS = "JOB_SCHEDULE_WITH_SAME_ID_EXISTS";

    // General

    /**
     * The Batch service failed to authenticate the request.
     */
    public static final String AUTHENTICATION_FAILED = "AUTHENTICATION_FAILED";

    /**
     * A read operation included a HTTP conditional header, and the condition was not met.
     */
    public static final String CONDITION_NOT_MET = "CONDITION_NOT_MET";

    /**
     * An add or update request specified a metadata item whose key is an empty string.
     */
    public static final String EMPTY_METADATA_KEY = "EMPTY_METADATA_KEY";

    /**
     * The host information was missing from the HTTP request.
     */
    public static final String HOST_INFORMATION_NOT_PRESENT = "HOST_INFORMATION_NOT_PRESENT";

    /**
     * The account being accessed does not have sufficient permissions to execute this operation.
     */
    public static final String INSUFFICIENT_ACCOUNT_PERMISSIONS = "INSUFFICIENT_ACCOUNT_PERMISSIONS";

    /**
     * An internal error occurred in the Batch service.
     */
    public static final String INTERNAL_ERROR = "INTERNAL_ERROR";

    /**
     * The authentication credentials were not provided in the correct format.
     */
    public static final String INVALID_AUTHENTICATION_INFO = "INVALID_AUTHENTICATION_INFO";

    /**
     * The specified auto-scale settings are not valid.
     */
    public static final String INVALID_AUTO_SCALING_SETTINGS = "INVALID_AUTO_SCALING_SETTINGS";

    /**
     * The value of one of the HTTP headers was in an incorrect format.
     */
    public static final String INVALID_HEADER_VALUE = "INVALID_HEADER_VALUE";

    /**
     * The Batch service did not recognize the HTTP verb used for the request.
     */
    public static final String INVALID_HTTP_VERB = "INVALID_HTTP_VERB";

    /**
     * One of the request inputs is not valid.
     */
    public static final String INVALID_INPUT = "INVALID_INPUT";

    /**
     * An add or update request specified a metadata item which contains characters that are not permitted.
     */
    public static final String INVALID_METADATA = "INVALID_METADATA";

    /**
     * The value of a property in the HTTP request body is invalid.
     */
    public static final String INVALID_PROPERTY_VALUE = "INVALID_PROPERTY_VALUE";

    /**
     * The HTTP request body is not syntactically valid.
     */
    public static final String INVALID_REQUEST_BODY = "INVALID_REQUEST_BODY";

    /**
     * The HTTP request URI contained invalid value for one of the query parameters.
     */
    public static final String INVALID_QUERY_PARAMETER_VALUE = "INVALID_QUERY_PARAMETER_VALUE";

    /**
     * The specified byte range is invalid for the given resource.
     */
    public static final String INVALID_RANGE = "INVALID_RANGE";

    /**
     * The HTTP request URI was invalid.
     */
    public static final String INVALID_URI = "INVALID_URI";

    /**
     * The size of the metadata exceeds the maximum permitted.
     */
    public static final String METADATA_TOO_LARGE = "METADATA_TOO_LARGE";

    /**
     * The HTTP Content-Length header was not specified.
     */
    public static final String MISSING_CONTENT_LENGTH_HEADER = "MISSING_CONTENT_LENGTH_HEADER";

    /**
     * A required HTTP header was not specified.
     */
    public static final String MISSING_REQUIRED_HEADER = "MISSING_REQUIRED_HEADER";

    /**
     * A required property was not specified in the HTTP request body.
     */
    public static final String MISSING_REQUIRED_PROPERTY = "MISSING_REQUIRED_PROPERTY";

    /**
     * A required query parameter was not specified in the URL.
     */
    public static final String MISSING_REQUIRED_QUERY_PARAMETER = "MISSING_REQUIRED_QUERY_PARAMETER";

    /**
     * Multiple condition headers are not supported.
     */
    public static final String MULTIPLE_CONDITION_HEADERS_NOT_SUPPORTED = "MULTIPLE_CONDITION_HEADERS_NOT_SUPPORTED";

    /**
     * The operation is not implemented.
     */
    public static final String NOT_IMPLEMENTED = "NOT_IMPLEMENTED";

    /**
     * One of the request inputs is out of range.
     */
    public static final String OUT_OF_RANGE_INPUT = "OUT_OF_RANGE_INPUT";

    /**
     * A query parameter in the request URL is out of range.
     */
    public static final String OUT_OF_RANGE_QUERY_PARAMETER_VALUE = "OUT_OF_RANGE_QUERY_PARAMETER_VALUE";

    /**
     * The operation could not be completed within the permitted time.
     */
    public static final String OPERATION_TIMED_OUT = "OPERATION_TIMED_OUT";

    /**
     * The size of the HTTP request body exceeds the maximum permitted.
     */
    public static final String REQUEST_BODY_TOO_LARGE = "REQUEST_BODY_TOO_LARGE";

    /**
     * The Batch service could not parse the request URL.
     */
    public static final String REQUEST_URL_FAILED_TO_PARSE = "REQUEST_URL_FAILED_TO_PARSE";

    /**
     * The specified resource does not exist.
     */
    public static final String RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND";

    /**
     * The specified resource already exists.
     */
    public static final String RESOURCE_ALREADY_EXISTS = "RESOURCE_ALREADY_EXISTS";

    /**
     * The resource does not match the expected type.
     */
    public static final String RESOURCE_TYPE_MISMATCH = "RESOURCE_TYPE_MISMATCH";

    /**
     * The Batch service is currently unable to receive requests.
     */
    public static final String SERVER_BUSY = "SERVER_BUSY";

    /**
     * One of the HTTP headers specified in the request is not supported.
     */
    public static final String UNSUPPORTED_HEADER = "UNSUPPORTED_HEADER";

    /**
     * The resource does not support the specified HTTP verb.
     */
    public static final String UNSUPPORTED_HTTP_VERB = "UNSUPPORTED_HTTP_VERB";

    /**
     * The Batch service does not support the specified version of the HTTP protocol.
     */
    public static final String UNSUPPORTED_HTTP_VERSION = "UNSUPPORTED_HTTP_VERSION";

    /**
     * One of the properties specified in the HTTP request body is not supported.
     */
    public static final String UNSUPPORTED_PROPERTY = "UNSUPPORTED_PROPERTY";

    /**
     * One of the query parameters specified in the URL is not supported.
     */
    public static final String UNSUPPORTED_QUERY_PARAMETER = "UNSUPPORTED_QUERY_PARAMETER";
}

