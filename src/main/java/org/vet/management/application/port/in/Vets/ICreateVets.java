package org.vet.management.application.port.in.Vets;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.vet.management.domain.model.Vets;

@Path("/vets")
public interface ICreateVets {
  /**
   * Este método recibe un objeto tipo Vets con los datos
   * para guardar en BD una nueva veterinaria.
   *
   * @param vets Objeto que se va a guardar en la BD.
   * @return El objeto creado.
   */
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  Response postVets(Vets vets);
}
