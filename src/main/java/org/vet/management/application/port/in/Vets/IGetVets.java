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
   * Este método debe retornar una veterinaria según el ID que le debe llegar como parámetro.
   *
   * @param idVets Identificador de la veterinaria.
   * @return Una veterinaria.
   */
  @GET
  @Path("/{idVets}")
  @Produces(MediaType.APPLICATION_JSON)
  Response getVetsById(@PathParam("idVets") String idVets);
}
