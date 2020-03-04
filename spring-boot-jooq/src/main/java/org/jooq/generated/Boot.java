/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.generated.tables.User;
import org.jooq.impl.SchemaImpl;


/**
 * The schema <code>boot</code>.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Boot extends SchemaImpl {

    private static final long serialVersionUID = 1090237798;

    /**
     * The reference instance of <code>boot</code>
     */
    public static final Boot BOOT = new Boot();

    /**
     * The table <code>boot.user</code>.
     */
    public final User USER = org.jooq.generated.tables.User.USER;

    /**
     * No further instances allowed
     */
    private Boot() {
        super("boot", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            User.USER);
    }
}