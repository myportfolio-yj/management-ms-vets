package org.vet.management.application.port.in.Address;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/address")
public interface IGetAddresses {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  Response getAddresses();
}
