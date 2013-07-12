package com.brightinteractive.common.lang;

/*
 * Copyright 2013 Bright Interactive, All Rights Reserved.
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class ShortUtilTest
{
	@Test
	public void testConvertIntThatFits()
	{
		short result = ShortUtil.tryToConvertIntToShort(-42);
		assertEquals(-42, result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConvertIntUnderflow()
	{
		ShortUtil.tryToConvertIntToShort(((int) Short.MIN_VALUE) - 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConvertIntOverflow()
	{
		ShortUtil.tryToConvertIntToShort(((int) Short.MAX_VALUE) + 1);
	}

	@Test
	public void testConvertLongThatFits()
	{
		short result = ShortUtil.tryToConvertLongToShort(-42);
		assertEquals(-42, result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConvertLongUnderflow()
	{
		ShortUtil.tryToConvertLongToShort(((long) Short.MIN_VALUE) - 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConvertLongOverflow()
	{
		ShortUtil.tryToConvertLongToShort(((long) Short.MAX_VALUE) + 1);
	}
}
