package sample.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("sample")
public class SampleResource {
    
    @GET
    public String method() {
        return "sample resource";
    }
}
