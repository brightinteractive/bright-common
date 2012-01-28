/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

package com.brightinteractive.common.exception;

/**
 * An unchecked exception thrown by Bright Interactive code.
 *
 * @author Bright Interactive
 */
public class BrightRuntimeException extends RuntimeException
{
    public BrightRuntimeException()
    {
        // nothing to do
    }

    public BrightRuntimeException(String message)
    {
        super(message);
    }

    public BrightRuntimeException(Throwable cause)
    {
        super(cause);
    }

    public BrightRuntimeException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
