/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

package com.brightinteractive.common.lang;

/**
 * Utility methods to do with Java classes.
 *
 * @author Bright Interactive
 */
public class ClassUtil
{
    private static final String FULL_CLASS_NAME = "com.brightinteractive.common.lang.ClassUtil";

    private static final String COULDNT_DETERMINE_CLASS_NAME = "<couldn't determine class name>";

    /**
     * <p>Returns the fully-qualified class name of the method that called ClassUtil. May be slow, expensive, so only
     * use this method in static initialisers. Use Object.getClass().getName() elsewhere.</p>
     *
     * <p>Returns "&lt;couldn't determine class name&gt;" if the class could not be determined.</p>
     */
    public static String currentClassName()
    {
        String className = currentClassNameOrNull();
        return className == null ?
               COULDNT_DETERMINE_CLASS_NAME :
               className;
    }

    /**
     * <p>Returns the fully-qualified class name of the method that called ClassUtil. May be slow, expensive, so only
     * use this method in static initialisers. Use Object.getClass().getName() elsewhere.</p>
     *
     * <p>Returns null if the class could not be determined.</p>
     */
    public static String currentClassNameOrNull()
    {
        return classNameOrNull(0);
    }

    public static String classNameOrNull(int a_framesToAscend)
    {
        final String METHOD_NAME = "classNameOrNull";

        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        if (trace.length == 0)
        {
            return null;
        }

        // Find the stack frame of this method (i.e. classNameOrNull()).
        int stackFrameIndex = 0;
        while (!(trace[stackFrameIndex].getClassName().equals(FULL_CLASS_NAME) &&
                 trace[stackFrameIndex].getMethodName().equals(METHOD_NAME)))
        {
            stackFrameIndex++;
            if (stackFrameIndex >= trace.length)
            {
                return null;
            }
        }

        // Find the stack frame of the first method that isn't in this class
        // (or the a_framesToAscend+1th method if a_framesToAscend is non-zero)
        while (trace[stackFrameIndex].getClassName().equals(FULL_CLASS_NAME))
        {
            stackFrameIndex++;
            stackFrameIndex += a_framesToAscend;
            if (stackFrameIndex >= trace.length)
            {
                return null;
            }
        }

        return trace[stackFrameIndex].getClassName();
    }

    public static String currentUnqualifiedClassName()
    {
        String className = currentUnqualifiedClassNameOrNull();
        return className == null ?
               COULDNT_DETERMINE_CLASS_NAME :
               className;
    }

    /**
     * <p>Returns the unqualified class name of the method that called ClassUtil. May be slow, expensive, so only use
     * this method in static initialisers. Use Object.getClass().getName() elsewhere.</p>
     *
     * <p>Returns null if the class could not be determined.</p>
     */
    public static String currentUnqualifiedClassNameOrNull()
    {
        String className = currentClassNameOrNull();
        if (className == null)
        {
            return null;
        }

        int lastIndexOfDot;
        if ((lastIndexOfDot = className.lastIndexOf(".")) != -1)
        {
            className = className.substring(lastIndexOfDot + 1);
        }

        return className;
    }
}
