package org.vet.management.infraestructure.adapter.in.Vets;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.Vets.ICreateVets;
import org.vet.management.domain.model.Vets;
import org.vet.management.domain.service.VetsService;

public class CreateVetsResource implements ICreateVets {
  @Inject
  VetsService vetsService;
  @Override
  public Response postVets(Vets vets) {
    return Response.ok(vetsService.createVets(vets)).build();
  }
}
