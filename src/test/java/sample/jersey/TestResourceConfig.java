package sample.jersey;

import org.glassfish.jersey.server.ResourceConfig;

public class TestResourceConfig extends ResourceConfig {
    
    public TestResourceConfig() {
        register(SampleResource.class);
    }
}
