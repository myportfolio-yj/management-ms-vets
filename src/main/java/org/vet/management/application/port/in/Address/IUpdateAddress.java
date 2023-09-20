package org.vet.management.application.port.in.Address;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.vet.management.domain.model.Address;

@Path("/address")
public interface IUpdateAddress {
  @PUT
  @Path("/{idAddress}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  Response putAddress(@PathParam("idAddress") String idAddress, Address address);
}
