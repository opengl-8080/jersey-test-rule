package sample.jersey;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.test.JerseyTest;
import org.junit.rules.ExternalResource;

public class JerseyTestRule extends ExternalResource {
    
    private JerseyTest jerseyTest;
    
    public JerseyTestRule(final Application config) {
        this.jerseyTest = new JerseyTest() {
            @Override
            protected Application configure() {
                return config;
            }
        };
    }
    
    @Override
    public void before() throws Throwable {
        this.jerseyTest.setUp();
    }
    
    @Override
    public void after() {
        try {
            this.jerseyTest.tearDown();
        } catch (Exception e) {
            throw new RuntimeException("failed to tear down JerseyTest.", e);
        }
    }
    
    public JerseyTest getJerseyTest() {
        return this.jerseyTest;
    }
}
