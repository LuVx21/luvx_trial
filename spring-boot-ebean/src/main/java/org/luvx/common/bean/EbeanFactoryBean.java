package org.luvx.common.bean;

import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.config.ServerConfig;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import io.ebean.springsupport.txn.SpringAwareJdbcTransactionManager;

/**
 * Spring factory for creating the EbeanServer singleton.
 */
@Component
public class EbeanFactoryBean implements FactoryBean<EbeanServer> {

    @Autowired
    CurrentUserBean currentUser;

    //  @Autowired
    //  DataSource dataSource;

    @Override
    public EbeanServer getObject() throws Exception {
        ServerConfig config = new ServerConfig();
        config.setName("db");
        config.setCurrentUserProvider(currentUser);

        //    // set the spring's datasource and transaction manager.
        //    config.setDataSource(dataSource);
        //    config.setExternalTransactionManager(new SpringAwareJdbcTransactionManager());

        config.loadFromProperties();
        // config.loadTestProperties();

        //是否执行建表SQL
        config.setDdlRun(false);
        //是否跳过删表SQL
        config.setDdlCreateOnly(true);
        //是否生成建表SQL
        config.setDdlGenerate(true);

        return EbeanServerFactory.create(config);
    }

    @Override
    public Class<?> getObjectType() {
        return EbeanServer.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
