/**
 *
 */
package com.redhat.lightblue.springdata.repository.support;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.core.EntityInformation;
import org.springframework.util.Assert;

import com.redhat.lightblue.client.LightblueClient;
import com.redhat.lightblue.springdata.repository.LightblueRepository;

/**
 * @author bvulaj
 *
 */
public class LightblueRepositoryImpl<T, ID extends Serializable> implements LightblueRepository<T, ID> {

    private final LightblueClient lbClient;
    private final EntityInformation<T, ID> entityInfo;

    public LightblueRepositoryImpl(EntityInformation<T, ID> entityInfo, LightblueClient lbClient) {
        Assert.notNull(entityInfo, "EntityInformation must not be null!");
        Assert.notNull(lbClient, "LightblueClient must not be null!");

        this.entityInfo = entityInfo;
        this.lbClient = lbClient;
    }

    public Iterable<T> findAll(Sort sort) {
        return null;
    }

    public Page<T> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    public <S extends T> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    public <S extends T> Iterable<S> save(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    public T findOne(ID id) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean exists(ID id) {
        // TODO Auto-generated method stub
        return false;
    }

    public Iterable<T> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    public Iterable<T> findAll(Iterable<ID> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    public void delete(ID id) {
        // TODO Auto-generated method stub

    }

    public void delete(T entity) {
        // TODO Auto-generated method stub

    }

    public void delete(Iterable<? extends T> entities) {
        // TODO Auto-generated method stub

    }

    public void deleteAll() {
        // TODO Auto-generated method stub

    }

}
