package org.zhubao;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Component;

@Component
public class HelloResourceImpl implements HelloResource {

    @Override
    public Response three() {
        return Response.status(Status.OK).entity("three").build();
    }

}
