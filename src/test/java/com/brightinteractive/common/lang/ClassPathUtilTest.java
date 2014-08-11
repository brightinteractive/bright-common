package com.brightinteractive.common.lang;

/*
 * Copyright 2014 Bright Interactive, All Rights Reserved.
 */

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

/**
 * @author Bright Interactive
 */
public class ClassPathUtilTest
{
	@Test
	public void testGetDirClassWasLoadedFromReturnsDirContainingClassFile()
	{
		File classesDir = ClassLoadingUtil.getDirClassWasLoadedFrom(ClassPathUtilTest.class);
		File thisClassFile = new File(
			classesDir,
			"com" + File.separator + "brightinteractive" + File.separator + "common" + File.separator + "lang" + File.separator + "ClassPathUtilTest.class");
		assertTrue(thisClassFile.exists());
	}
}
