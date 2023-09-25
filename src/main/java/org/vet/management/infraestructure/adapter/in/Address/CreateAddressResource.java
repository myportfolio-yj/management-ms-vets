package org.vet.management.infraestructure.adapter.in.Address;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.Address.ICreateAddress;
import org.vet.management.domain.model.Address;
import org.vet.management.domain.service.AddressService;

public class CreateAddressResource implements ICreateAddress {
  @Inject
  AddressService addressService;
  @Override
  public Response postAddress(Address address) {
    return Response.ok(addressService.createAddress(address)).build();
  }
}
