package org.vet.management.infraestructure.adapter.out;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.bson.types.ObjectId;
import org.vet.management.application.port.out.IAddressRepository;
import org.vet.management.application.port.out.IVetsRepository;
import org.vet.management.domain.model.Address;
import org.vet.management.domain.model.AddressEntity;
import org.vet.management.domain.model.Vets;
import org.vet.management.domain.model.VetsEntity;

import java.util.List;
import java.util.Objects;
@ApplicationScoped
public class AddressRepository implements PanacheMongoRepository<AddressEntity>, IAddressRepository {
  @Override
  public List<Address> getAllAddresses() {
    return listAll().stream().map(p -> {
      Address address = new Address();
      address.setId(p.id.toString());
      address.setAddress(p.address);
      address.setCity(p.city);
      address.setState(p.state);
      address.setCountry(p.country);
      return address;
    }).toList();
  }

  @Override
  public Address getAddressById(String id) {
    AddressEntity addressEntity = findById(new ObjectId(id));
    if (Objects.isNull(addressEntity)){
      return new Address();
    }
    Address address = new Address();
    address.setId(addressEntity.id.toString());
    address.setAddress(addressEntity.address);
    address.setCity(addressEntity.city);
    address.setState(addressEntity.state);
    address.setCountry(addressEntity.country);
    return address;
  }

  @Override
  public Address createAddress(Address address) {
    AddressEntity addressEntity = new AddressEntity();
    addressEntity.setAddress(address.address);
    addressEntity.setCity(address.city);
    addressEntity.setState(address.state);
    addressEntity.setCountry(address.country);
    addressEntity.persist();
    Address address2 = new Address();
    address2.setId(addressEntity.id.toString());
    address2.setAddress(addressEntity.address);
    address2.setCity(addressEntity.city);
    address2.setState(addressEntity.state);
    address2.setCountry(addressEntity.country);
    return address2;
  }

  @Override
  public Address updateAddress(String id, Address address) {
    AddressEntity addressEntity = findById(new ObjectId(id));
    addressEntity.setAddress(address.address);
    addressEntity.setCity(address.city);
    addressEntity.setState(address.state);
    addressEntity.setCountry(address.country);
    update(addressEntity);
    AddressEntity addressEntity2 = findById(new ObjectId(id));
    if (Objects.isNull(addressEntity2)){
      return new Address();
    }
    Address address2 = new Address();
    address2.setId(addressEntity.id.toString());
    address2.setAddress(addressEntity.address);
    address2.setCity(addressEntity.city);
    address2.setState(addressEntity.state);
    address2.setCountry(addressEntity.country);
    return address2;
  }

  @Override
  public Address deleteAddress(String id) {
    AddressEntity addressEntity = findById(new ObjectId(id));
    delete(addressEntity);
    Address address = new Address();
    address.setId(addressEntity.id.toString());
    address.setAddress(addressEntity.address);
    address.setCity(addressEntity.city);
    address.setState(addressEntity.state);
    address.setCountry(addressEntity.country);
    return address;
  }
}
