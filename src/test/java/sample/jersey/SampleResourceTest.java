package sample.jersey;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Rule;
import org.junit.Test;

public class SampleResourceTest {
    
    @Rule
    public JerseyTestRule rule = new JerseyTestRule(new TestResourceConfig());
    
    @Test
    public void test() {
        String response = rule.getJerseyTest().target("sample").request().get(String.class);
        assertThat(response, is("sample resource"));
    }
}
