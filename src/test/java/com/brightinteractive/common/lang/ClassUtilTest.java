/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

package com.brightinteractive.common.lang;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Bright Interactive
 */
public class ClassUtilTest
{
    private static final String CLASS_NAME = ClassUtil.currentClassName();

    @Test
    public void testCurrentClassName()
    {
        assertEquals("com.brightinteractive.common.lang.ClassUtilTest", ClassUtil.currentClassName());
    }

    @Test
    public void testCurrentClassNameInConstant()
    {
        assertEquals("com.brightinteractive.common.lang.ClassUtilTest", CLASS_NAME);
    }

    @Test
    public void testCurrentUnqualifiedClassName()
    {
        assertEquals("ClassUtilTest", ClassUtil.currentUnqualifiedClassName());
    }
}
