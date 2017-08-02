package org.zhubao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.context.annotation.Profile;

@Profile("three")
@Path("/")
public interface HelloResource {

    @GET
    @Path("three")
    Response three();
}
