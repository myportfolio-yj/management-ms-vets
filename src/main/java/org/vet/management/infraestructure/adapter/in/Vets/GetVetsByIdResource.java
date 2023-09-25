package org.vet.management.infraestructure.adapter.in.Vets;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.Vets.IGetVetsById;
import org.vet.management.domain.service.VetsService;

public class GetVetsByIdResource implements IGetVetsById {
  @Inject
  VetsService vetsService;
  @Override
  public Response getVetsById(String idVets) {
    return Response.ok(vetsService.getVetsById(idVets)).build();
  }
}
