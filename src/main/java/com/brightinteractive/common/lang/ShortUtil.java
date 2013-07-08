package com.brightinteractive.common.lang;

/*
 * Copyright 2013 Bright Interactive, All Rights Reserved.
 */

/**
 * Utilities to do with short integers.
 */
public class ShortUtil
{
	public static short tryToConvertIntToShort(int i)
	{
		if (i > Short.MAX_VALUE ||
			i < Short.MIN_VALUE)
		{
			throw new IllegalArgumentException("Value is too large to fit in a short: " + i);
		}
		else
		{
			return (short) i;
		}
	}
}
