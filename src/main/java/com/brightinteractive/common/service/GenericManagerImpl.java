/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

package com.brightinteractive.common.service;

import java.io.Serializable;

import com.brightinteractive.common.dao.GenericDao;

/**
 * <p>This class provides generic object services,  i.e. basic saves, gets and deletes</p>
 * 
 * <p>To provide the service for specific entities subclass this class and specify T and ID, e.g.</p>
 *
 * <blockquote><pre>
 * &#064;Component
 * public class MyClassManagerImpl extends GenericManagerImpl&lt;MyClass, Long&gt; implements MyClassManager
 * </pre></blockquote>
 * 
 * @author Kevin Bennett
 * @author Francis Devereux
 */
public class GenericManagerImpl<T, ID extends Serializable> implements GenericManager<T, ID>
{
    private GenericDao<T, ID> dao;

    @Override
    public T save(T entity)
    {
        return dao.makePersistent(entity);
    }

    @Override
    public T get(ID id)
    {
        return dao.findById(id);
    }

    @Override
    public void delete(T object)
    {
        dao.makeTransient(object);
    }

    public GenericDao<T, ID> getDao()
    {
        return dao;
    }

    public void setDao(GenericDao<T, ID> dao)
    {
        this.dao = dao;
    }
}
