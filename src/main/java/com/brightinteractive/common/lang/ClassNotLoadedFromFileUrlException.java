package com.brightinteractive.common.lang;

/*
 * Copyright 2014 Bright Interactive, All Rights Reserved.
 */

import java.net.URL;

/**
 * Thrown when a class was not loaded from a file: URL
 *
 * @author Bright Interactive
 */
public class ClassNotLoadedFromFileUrlException extends RuntimeException
{
	public ClassNotLoadedFromFileUrlException(URL codeLocation)
	{
		super("Couldn't auto detect classes directory because code not loaded from a file: URL " +
			  "(instead, it was loaded from URL: " + codeLocation + "). ");
	}
}
