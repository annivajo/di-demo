package guru.springframework.didemo.config;

import guru.springframework.didemo.examplebean.FakeDataSource;
import guru.springframework.didemo.examplebean.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource("classpath:datasource.properties")
/*@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
}
)*/
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${guru.user}")
    String user;
    @Value("${guru.password}")
    String password;
    @Value("${guru.url}")
    String url;

    @Value("${jms.user}")
    String jmsuser;
    @Value("${jms.password}")
    String jmspassword;
    @Value("${jms.url}")
    String jmsurl;


   /* @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        return configurer;
    }*/

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        //fakeDataSource.setUser(env.getProperty("GURU_USER"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsuser);
        fakeJmsBroker.setPassword(jmspassword);
        fakeJmsBroker.setUrl(jmsurl);

        return fakeJmsBroker;
    }
}
