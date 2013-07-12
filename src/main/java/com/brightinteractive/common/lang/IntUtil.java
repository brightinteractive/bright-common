package com.brightinteractive.common.lang;

/*
 * Copyright 2013 Bright Interactive, All Rights Reserved.
 */

public class IntUtil
{
	public static int tryToConvertLongToInt(long l)
	{
		if (l > Integer.MAX_VALUE ||
			l < Integer.MIN_VALUE)
		{
			throw new IllegalArgumentException("Value is too large to fit in an int: " + l);
		}
		else
		{
			return (int) l;
		}
	}
}
