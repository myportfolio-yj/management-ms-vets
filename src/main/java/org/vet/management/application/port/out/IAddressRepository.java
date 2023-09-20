package org.vet.management.application.port.out;

import org.vet.management.domain.model.Address;
import org.vet.management.domain.model.AddressEntity;

import java.util.List;

public interface IAddressRepository {
  List<AddressEntity> getAllAddresses();
  AddressEntity getAddressById(String id);
  AddressEntity createAddress(Address address);
  AddressEntity updateAddress(String id, Address address);
  AddressEntity deleteAddress(String id);
}
