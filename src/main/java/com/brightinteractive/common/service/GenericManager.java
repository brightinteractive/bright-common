/*
 * Copyright 2012 Bright Interactive, All Rights Reserved.
 */

package com.brightinteractive.common.service;

import java.io.Serializable;

/**
 * <p>This interface should be implemented by any classes wishing to provide object services.</p>
 *
 * <p>Classes implementing this interfaces should contain business logic only. Data access logic should be contained in
 * the DAO.</p>
 *
 * @author Kevin Bennett
 * @author Francis Devereux
 */
public interface GenericManager<T, ID extends Serializable>
{
    /**
     * Get the object specified by the given id.
     *
     * @param id the id of the object.
     * @return an object with the given id.
     */
    T get(ID id);

    /**
     * Save the given object to the data store.
     *
     * @return the saved object.
     */
    T save(T entity);

    /**
     * Delete the given object from the data store.
     *
     * @param object The object to delete.
     */
    void delete(T object);
}
