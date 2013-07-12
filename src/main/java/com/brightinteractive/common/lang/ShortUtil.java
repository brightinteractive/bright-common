package com.brightinteractive.common.lang;

/*
 * Copyright 2013 Bright Interactive, All Rights Reserved.
 */

/**
 * Utilities to do with short integers.
 */
public class ShortUtil
{
	/**
	 * Convert an int to a short, throwing an exception (as opposed to wrapping silently) if it is out of range.
	 */
	public static short tryToConvertIntToShort(int i)
	{
		return tryToConvertLongToShort(i);
	}

	/**
	 * Convert a long to a short, throwing an exception (as opposed to wrapping silently) if it is out of range.
	 */
	public static short tryToConvertLongToShort(long l)
	{
		if (l > Short.MAX_VALUE ||
			l < Short.MIN_VALUE)
		{
			throw new IllegalArgumentException("Value is too large to fit in a short: " + l);
		}
		else
		{
			return (short) l;
		}
	}
}
