package com.brightinteractive.common.lang;

/*
 * Copyright 2013 Bright Interactive, All Rights Reserved.
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class IntUtilTest
{
	@Test
	public void testConvertLongThatFits()
	{
		int result = IntUtil.tryToConvertLongToInt(-68000);
		assertEquals(-68000, result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConvertLongUnderflow()
	{
		IntUtil.tryToConvertLongToInt(((long) Integer.MIN_VALUE) - 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConvertLongOverflow()
	{
		IntUtil.tryToConvertLongToInt(((long) Integer.MAX_VALUE) + 1);
	}
}
