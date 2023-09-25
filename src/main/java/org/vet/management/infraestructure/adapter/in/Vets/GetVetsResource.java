package org.vet.management.infraestructure.adapter.in.Vets;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.Vets.IGetVets;
import org.vet.management.domain.service.VetsService;

public class GetVetsResource implements IGetVets {
  @Inject
  VetsService vetsService;
  @Override
  public Response getVets() {
    return Response.ok(vetsService.getAllVets()).build();
  }
}
