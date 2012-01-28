/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

package com.brightinteractive.common.exception;

/**
 * @author Bright Interactive
 */
public class BrightException extends Exception
{
    public BrightException()
    {
        // nothing to do
    }

    public BrightException(String message)
    {
        super(message);
    }

    public BrightException(Throwable cause)
    {
        super(cause);
    }

    public BrightException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
