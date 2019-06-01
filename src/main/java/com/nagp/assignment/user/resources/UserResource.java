package com.nagp.assignment.user.resources;

import com.nagp.assignment.user.api.CreateUserDto;
import com.nagp.assignment.user.api.UserDto;
import com.nagp.assignment.user.core.UserHandler;
import io.dropwizard.jersey.caching.CacheControl;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
public class UserResource {

    private UserHandler userHandler;

    public UserResource(final UserHandler userHandler) {
        this.userHandler = userHandler;
    }

    @POST
    @Path("/user")
    @Consumes(MediaType.APPLICATION_JSON)
    @CacheControl(noCache = true)
    public void createUser(@Valid final CreateUserDto userDto){
        userHandler.createUser(userDto);
    }

    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    @CacheControl(noCache = true)
    public List<UserDto> getAllUsers(){
        return userHandler.getAllUsers();
    }
}
