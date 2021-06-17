package hu.angerz.framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:/application.properties")
@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = "gascapacities.backend")
public class AppConfig {

    @Autowired
    private Environment environment;
    //TODO

//    @Bean
//    public JpaTransactionManager transactionManager() {
////        JpaTransactionManager transactionManager = new JpaTransactionManager();
////        transactionManager.setEntityManagerFactory(entityManagerFactory(dataSource()).getObject() );
////        return transactionManager;
//        return new JpaTransactionManager();
//    }

//    @Bean
//    public JpaVendorAdapter jpaVendorAdapter() {
//        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
//        hibernateJpaVendorAdapter.setShowSql(true);
//        return hibernateJpaVendorAdapter;
//    }

//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter());
//        entityManagerFactoryBean.setDataSource(dataSource());
//        entityManagerFactoryBean.setPackagesToScan("gascapacities.backend");
//        return entityManagerFactoryBean;
//    }

//    @Bean
//    public DataSource dataSource() {
////        MysqlDataSource dataSource = new MysqlDataSource();
////        dataSource.setURL(environment.getProperty("jdbc.url"));
////        dataSource.setUser(environment.getProperty("jdbc.username"));
////        dataSource.setPassword(environment.getProperty("jdbc.password"));
//
//        DriverManagerDataSource dataSource = new DriverManagerDataSource(environment.getProperty("jdbc.url"), environment.getProperty("jdbc.username"), environment.getProperty("jdbc.password"));
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        return dataSource;
//    }

//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

//    @Bean
//    public DataSourceInitializer dataSourceInitializer(@Qualifier("dataSource") final DataSource dataSource) {
//        ResourceDatabasePopulator resourceDatabasePopulator = new ResourceDatabasePopulator();
//        resourceDatabasePopulator.addScript(new ClassPathResource("/data.sql"));
//        DataSourceInitializer dataSourceInitializer = new DataSourceInitializer();
//        dataSourceInitializer.setDataSource(dataSource);
//        dataSourceInitializer.setDatabasePopulator(resourceDatabasePopulator);
//        return dataSourceInitializer;
//    }


}
