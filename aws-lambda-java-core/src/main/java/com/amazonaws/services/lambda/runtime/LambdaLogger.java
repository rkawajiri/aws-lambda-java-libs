/* Copyright 2015 Amazon.com, Inc. or its affiliates. All Rights Reserved. */

package com.amazonaws.services.lambda.runtime;

/**
 * A low level Lambda runtime logger
 *
 */
public interface LambdaLogger {

    /**
    * Logs a string to AWS CloudWatch Logs
    * 
    *
    * Logging will not be done:
    * <ul>
    * <li>
    * If the container is not configured to log to CloudWatch.
    * </li>
    * <li>
    * If the role provided to the function does not have sufficient permissions.
    * </li>
    * </ul>
    *
    * 
    * @param string A string containing the event to log.
    */
    public void log(String string);
}

