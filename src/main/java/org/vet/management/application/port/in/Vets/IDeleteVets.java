package org.vet.management.application.port.in.Vets;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/vets")
public interface IDeleteVets {
  /**
   * Este método elimina una veterinaria buscándola por su ID.
   *
   * @param idVets Cadena con el identificador de la veterinaria en DB.
   * @return El objeto eliminado.
   */
  @DELETE
  @Path("/{idVets}")
  @Produces(MediaType.APPLICATION_JSON)
  Response deleteVets(@PathParam("idVets") String idVets);
}
