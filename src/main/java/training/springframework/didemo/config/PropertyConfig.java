package training.springframework.didemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import training.springframework.didemo.examplebeans.FakeDataSource;
import training.springframework.didemo.examplebeans.FakeJmsBroker;

@Configuration
////@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
//@PropertySources({
//    @PropertySource("classpath:datasource.properties"),
//    @PropertySource("classpath:jms.properties")    
//})
public class PropertyConfig {
    
    @Value("${guru.username}")
    String user;
    
    @Value("${guru.password}")
    String password;
    
    @Value("${guru.dburl}")
    String url;

    @Value("${guru.jms.username}")
    String jmsUsername;

    @Value("${guru.jms.password}")
    String jmsPassword;

    @Value("${guru.jms.url}")
    String jsmUrl;
    
    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUsername);
        return fakeJmsBroker;
    }
    
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
}
