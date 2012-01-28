/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

package com.brightinteractive.common.exception;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * Tests that a subclass of Throwable has the standard Throwable constructors and has implemented them correctly.
 *
 * @author Bright Interactive
 */
public abstract class StandardThrowableConstructorsTest
{
    private final Class<? extends Throwable> classToTest;

    protected StandardThrowableConstructorsTest(Class<? extends Throwable> classToTest)
    {
        this.classToTest = classToTest;
    }

    @Test
    public void testNoArgConstructor() throws IllegalAccessException, InstantiationException
    {
        //noinspection ThrowableResultOfMethodCallIgnored
        classToTest.newInstance();
    }

    @Test
    public void testMessageConstructor() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException
    {
        String message = "Something went wrong";

        Constructor<? extends Throwable> constructor = classToTest.getConstructor(String.class);

        @SuppressWarnings("ThrowableResultOfMethodCallIgnored")
        Throwable t = constructor.newInstance(message);

        assertSame(message, t.getMessage());
    }

    @Test
    public void testCauseConstructor() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException
    {
        Throwable cause = new Throwable();

        Constructor<? extends Throwable> constructor = classToTest.getConstructor(Throwable.class);

        @SuppressWarnings("ThrowableResultOfMethodCallIgnored")
        Throwable t = constructor.newInstance(cause);

        assertSame(cause, t.getCause());
    }

    @Test
    public void testMessageAndCauseConstructor() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException
    {
        String message = "Something threw a Throwable";
        Throwable cause = new Throwable();

        Constructor<? extends Throwable> constructor = classToTest.getConstructor(String.class, Throwable.class);

        @SuppressWarnings("ThrowableResultOfMethodCallIgnored")
        Throwable t = constructor.newInstance(message, cause);

        assertSame(message, t.getMessage());
        assertSame(cause, t.getCause());
    }
}
