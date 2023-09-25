package org.vet.management.infraestructure.adapter.in.Address;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.Address.IGetAddressById;
import org.vet.management.domain.service.AddressService;

public class GetAddressByIdResource implements IGetAddressById {
  @Inject
  AddressService addressService;
  @Override
  public Response getAddressById(String idAddress) {
    return Response.ok(addressService.getAddressById(idAddress)).build();
  }
}
