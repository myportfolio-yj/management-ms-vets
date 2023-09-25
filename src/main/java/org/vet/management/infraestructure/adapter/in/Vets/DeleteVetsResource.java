package org.vet.management.infraestructure.adapter.in.Vets;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.Vets.IDeleteVets;
import org.vet.management.domain.service.VetsService;

public class DeleteVetsResource implements IDeleteVets {
  @Inject
  VetsService vetsService;
  @Override
  public Response deleteVets(String idVets) {
    return Response.ok(vetsService.deleteVets(idVets)).build();
  }
}
