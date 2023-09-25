package org.vet.management.infraestructure.adapter.in.Vets;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.Vets.IUpdateVets;
import org.vet.management.domain.model.Vets;
import org.vet.management.domain.service.VetsService;

public class UpdateVetsResource implements IUpdateVets {
  @Inject
  VetsService vetsService;
  @Override
  public Response putUser(String idVets, Vets vets) {
    return Response.ok(vetsService.updateVets(idVets,vets)).build();
  }
}
