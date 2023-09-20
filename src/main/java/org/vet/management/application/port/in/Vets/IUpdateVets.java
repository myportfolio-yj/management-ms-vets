package org.vet.management.application.port.in.Vets;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.vet.management.domain.model.Vets;

@Path("/vets")
public interface IUpdateVets {
  /**
   * Este método busca una veterinaria por ID y la actualiza
   * con la información del objeto Vets.
   *
   * @param idVets Cadena con el identificador de la veterinaria en DB.
   * @param vets Objeto con los datos para actualizar el registro.
   * @return El objeto actualizado.
   */
  @PUT
  @Path("/{idVets}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  Response putUser(@PathParam("idVets") String idVets, Vets vets);
}
