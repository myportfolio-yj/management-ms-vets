package org.vet.management.application.port.in.Vets;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/vets")
public interface IGetVets {
  /**
   * Este método debe retornar todas las veterinarias que están activos
   *
   * @return Una lista de veterinarias.
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  Response getVets();
}
