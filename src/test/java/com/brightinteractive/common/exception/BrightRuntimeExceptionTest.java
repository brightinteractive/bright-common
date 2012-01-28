/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

package com.brightinteractive.common.exception;

import org.junit.Test;

/**
 * @author Bright Interactive
 */
public class BrightRuntimeExceptionTest extends StandardThrowableConstructorsTest
{
    public BrightRuntimeExceptionTest()
    {
        super(BrightRuntimeException.class);
    }

    @Test(expected=BrightRuntimeException.class)
    public void testCanBeThrownWithoutThrowsDeclaration()
    {
        throw new BrightRuntimeException();
    }
}
