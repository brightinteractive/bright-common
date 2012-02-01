/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

package com.brightinteractive.common.service;

import java.util.Arrays;
import java.util.List;

import com.brightinteractive.common.dao.GenericDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author Bright Interactive
 */
@RunWith(MockitoJUnitRunner.class)
public class GenericManagerImplTest
{
    @Mock
    private GenericDao<String, Integer> mockDao;
    // declare it as the interface so that this test class can make sure that methods are in the interface, not just
    // the implementation class
    private GenericManager<String, Integer> managerToTest;

    @Before
    public void setUp()
    {
        GenericManagerImpl<String, Integer> managerToTestAsImpl = new GenericManagerImpl<String, Integer>();
        managerToTestAsImpl.setDao(mockDao);
        managerToTest = managerToTestAsImpl;
    }
    
    @Test
    public void testGetAll()
    {
        List<String> data = Arrays.asList("Hello", "world", "!");
        when(mockDao.findAll()).thenReturn(data);

        List<String> result = managerToTest.getAll();
        verify(mockDao).findAll();
        assertEquals(data, result);
    }
}
