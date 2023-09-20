package org.vet.management.domain.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.vet.management.application.port.out.IAddressRepository;
import org.vet.management.domain.model.Address;

import java.util.List;

@ApplicationScoped
public class AddressService {
  @Inject
  IAddressRepository addressRepository;
  public List<Address> getAllAddress() {
    return addressRepository.getAllAddresses();
  }

  public Address getAddressById(String id) {
    return addressRepository.getAddressById(id);
  }

  public Address createAddress(Address address) {
    return addressRepository.createAddress(address);
  }

  public Address updateAddress(String id, Address address) {
    return addressRepository.updateAddress(id, address);
  }

  public Address deleteAddress(String id) {
    return addressRepository.deleteAddress(id);
  }
}
