/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

package com.brightinteractive.common.exception;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * @author Bright Interactive
 */
public class BrightExceptionTest extends StandardThrowableConstructorsTest
{
    public BrightExceptionTest()
    {
        super(BrightException.class);
    }

    @Test
    public void testIsCheckedException()
    {
        Exception e = new BrightException();

        //noinspection ConstantConditions
        assertFalse(e instanceof RuntimeException);
    }
}
