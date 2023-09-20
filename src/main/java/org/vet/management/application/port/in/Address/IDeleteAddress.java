package org.vet.management.application.port.in.Address;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/address")
public interface IDeleteAddress {
  @DELETE
  @Path("/{idAddress}")
  @Produces(MediaType.APPLICATION_JSON)
  Response deleteAddress(@PathParam("idAddress") String idAddress);
}
