package main.java.com.company.project.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
@Component
public class JdbcConfig {

    @Value("${jdbc.driver}")//spring4.3后可自己识别
    private String jdbcDriver;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String jdbcUserName;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean(name="dataSource")
    public DataSource createDataSource(){

        DruidDataSource druidDataSource = new DruidDataSource();

        druidDataSource.setDriverClassName(jdbcDriver);
        druidDataSource.setUsername(jdbcUserName);
        druidDataSource.setPassword(jdbcPassword);
        druidDataSource.setUrl(jdbcUrl);

        //配置初始化大小、最小、最大
        druidDataSource.setInitialSize(5);
        druidDataSource.setMinIdle(5);
        druidDataSource.setMaxActive(100);

        // 配置获取连接等待超时的时间
        druidDataSource.setMaxWait(60000);
        //配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
        druidDataSource.setTimeBetweenEvictionRunsMillis(60000);
        //配置一个连接在池中最小生存的时间，单位是毫秒
        druidDataSource.setMinEvictableIdleTimeMillis(300000);

        druidDataSource.setValidationQuery("select 'x'");
        druidDataSource.setTestWhileIdle(true);
        druidDataSource.setTestOnBorrow(false);
        druidDataSource.setTestOnReturn(false);

        return  druidDataSource;
    }
}
