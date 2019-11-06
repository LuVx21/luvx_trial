/*
 * This file is generated by jOOQ.
 */
package org.luvx.daos;


import org.jooq.generated.tables.User;
import org.jooq.generated.tables.records.UserRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserDao extends DAOImpl<UserRecord, org.luvx.pojos.User, Long> {

    /**
     * Create a new UserDao without any configuration
     */
    public UserDao() {
        super(User.USER, org.luvx.pojos.User.class);
    }

    /**
     * Create a new UserDao with an attached configuration
     */
    public UserDao(Configuration configuration) {
        super(User.USER, org.luvx.pojos.User.class, configuration);
    }

    @Override
    public Long getId(org.luvx.pojos.User object) {
        return object.getUserId();
    }

    /**
     * Fetch records that have <code>user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.luvx.pojos.User> fetchRangeOfUserId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(User.USER.USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<org.luvx.pojos.User> fetchByUserId(Long... values) {
        return fetch(User.USER.USER_ID, values);
    }

    /**
     * Fetch a unique record that has <code>user_id = value</code>
     */
    public org.luvx.pojos.User fetchOneByUserId(Long value) {
        return fetchOne(User.USER.USER_ID, value);
    }

    /**
     * Fetch records that have <code>age BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.luvx.pojos.User> fetchRangeOfAge(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(User.USER.AGE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>age IN (values)</code>
     */
    public List<org.luvx.pojos.User> fetchByAge(Integer... values) {
        return fetch(User.USER.AGE, values);
    }

    /**
     * Fetch records that have <code>password BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.luvx.pojos.User> fetchRangeOfPassword(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.PASSWORD, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<org.luvx.pojos.User> fetchByPassword(String... values) {
        return fetch(User.USER.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>user_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.luvx.pojos.User> fetchRangeOfUserName(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.USER_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_name IN (values)</code>
     */
    public List<org.luvx.pojos.User> fetchByUserName(String... values) {
        return fetch(User.USER.USER_NAME, values);
    }
}
