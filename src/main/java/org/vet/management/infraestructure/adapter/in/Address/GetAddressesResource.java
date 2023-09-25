package org.vet.management.infraestructure.adapter.in.Address;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.Address.IGetAddresses;
import org.vet.management.domain.service.AddressService;

public class GetAddressesResource implements IGetAddresses {
  @Inject
  AddressService addressService;
  @Override
  public Response getAddresses() {
    return Response.ok(addressService.getAllAddress()).build();
  }
}
