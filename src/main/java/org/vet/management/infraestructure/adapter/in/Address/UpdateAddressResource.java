package org.vet.management.infraestructure.adapter.in.Address;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.Address.IUpdateAddress;
import org.vet.management.domain.model.Address;
import org.vet.management.domain.service.AddressService;

public class UpdateAddressResource implements IUpdateAddress {
  @Inject
  AddressService addressService;
  @Override
  public Response putAddress(String idAddress, Address address) {
    return Response.ok(addressService.updateAddress(idAddress,address)).build();
  }
}
