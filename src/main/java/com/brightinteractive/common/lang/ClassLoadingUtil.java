package com.brightinteractive.common.lang;

/*
 * Copyright 2014 Bright Interactive, All Rights Reserved.
 */

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * @author Bright Interactive
 */
public class ClassLoadingUtil
{
	/**
	 * @throws ClassNotLoadedFromFileUrlException if clazz was not loaded from a file: URL
	 * @return the directory that clazz was loaded from
	 */
	public static File getDirClassWasLoadedFrom(Class<?> clazz)
	{
		URL codeLocation = clazz.getProtectionDomain().getCodeSource().getLocation();
		if (!"file".equals(codeLocation.getProtocol()))
		{
			throw new ClassNotLoadedFromFileUrlException(codeLocation);
		}

		return new File(urlToUri(codeLocation));
	}

	private static URI urlToUri(URL url)
	{
		try
		{
			return url.toURI();
		}
		catch (URISyntaxException e)
		{
			throw new RuntimeException(e);
		}
	}
}
