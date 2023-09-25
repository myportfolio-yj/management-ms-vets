package org.vet.management.infraestructure.adapter.in.Address;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.Address.IDeleteAddress;
import org.vet.management.domain.service.AddressService;

public class DeleteAddressResource implements IDeleteAddress {
  @Inject
  AddressService addressService;
  @Override
  public Response deleteAddress(String idAddress) {
    return Response.ok(addressService.deleteAddress(idAddress)).build();
  }
}
