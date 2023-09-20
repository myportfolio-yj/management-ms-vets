package org.vet.management.application.port.in.Address;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/address")
public interface IGetAddressById {

  @GET
  @Path("/{idAddress}")
  @Produces(MediaType.APPLICATION_JSON)
  Response getAddressById(@PathParam("idAddress") String idAddress);
}
