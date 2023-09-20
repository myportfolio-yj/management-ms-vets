package org.vet.management.infraestructure.adapter.out;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.bson.types.ObjectId;
import org.vet.management.application.port.out.IVetsRepository;
import org.vet.management.domain.model.Vets;
import org.vet.management.domain.model.VetsEntity;

import java.util.List;
import java.util.Objects;

public class VetsRepository implements PanacheMongoRepository<VetsEntity>, IVetsRepository {
  @Override
  public List<Vets> getAllVets() {
    return listAll().stream().map(p -> {
      Vets vets = new Vets();
      vets.setId(p.id.toString());
      vets.setCorporateName(p.corporateName);
      vets.setIdAddress(p.idAddress);
      vets.setOpeningTime(p.openingTime);
      vets.setClosingTime(p.closingTime);
      vets.setBusinessDays(p.businessDays);
      return vets;
    }).toList();
  }

  @Override
  public Vets getVetsById(String id) {
    VetsEntity vetsEntity = findById(new ObjectId(id));
    if (Objects.isNull(vetsEntity)){
      return new Vets();
    }
    Vets vets = new Vets();
    vets.setId(vetsEntity.id.toString());
    vets.setCorporateName(vetsEntity.corporateName);
    vets.setIdAddress(vetsEntity.idAddress);
    vets.setOpeningTime(vetsEntity.openingTime);
    vets.setClosingTime(vetsEntity.closingTime);
    vets.setBusinessDays(vetsEntity.businessDays);
    return vets;
  }

  @Override
  public Vets createVets(Vets vets) {
    VetsEntity vetsEntity = new VetsEntity();

    vetsEntity.setCorporateName(vets.corporateName);
    vetsEntity.setIdAddress(vets.idAddress);
    vetsEntity.setOpeningTime(vets.openingTime);
    vetsEntity.setClosingTime(vets.closingTime);
    vetsEntity.setBusinessDays(vets.businessDays);
    vetsEntity.persist();
    Vets vets2 = new Vets();
    vets2.setId(vetsEntity.id.toString());
    vets2.setCorporateName(vetsEntity.corporateName);
    vets2.setIdAddress(vetsEntity.idAddress);
    vets2.setOpeningTime(vetsEntity.openingTime);
    vets2.setClosingTime(vetsEntity.closingTime);
    vets2.setBusinessDays(vetsEntity.businessDays);
    return vets2;
  }

  @Override
  public Vets updateVets(String id, Vets vets) {
    VetsEntity vetsEntity = findById(new ObjectId(id));
    vetsEntity.setCorporateName(vets.corporateName);
    vetsEntity.setIdAddress(vets.idAddress);
    vetsEntity.setOpeningTime(vets.openingTime);
    vetsEntity.setClosingTime(vets.closingTime);
    vetsEntity.setBusinessDays(vets.businessDays);
    update(vetsEntity);
    VetsEntity vetsEntity2 = findById(new ObjectId(id));
    if (Objects.isNull(vetsEntity2)){
      return new Vets();
    }
    Vets vets2 = new Vets();
    vets2.setId(vetsEntity.id.toString());
    vets2.setCorporateName(vetsEntity.corporateName);
    vets2.setIdAddress(vetsEntity.idAddress);
    vets2.setOpeningTime(vetsEntity.openingTime);
    vets2.setClosingTime(vetsEntity.closingTime);
    vets2.setBusinessDays(vetsEntity.businessDays);
    return vets2;
  }

  @Override
  public Vets deleteVets(String id) {
    VetsEntity vetsEntity = findById(new ObjectId(id));
    delete(vetsEntity);
    Vets vets = new Vets();
    vets.setId(vetsEntity.id.toString());
    vets.setCorporateName(vetsEntity.corporateName);
    vets.setIdAddress(vetsEntity.idAddress);
    vets.setOpeningTime(vetsEntity.openingTime);
    vets.setClosingTime(vetsEntity.closingTime);
    vets.setBusinessDays(vetsEntity.businessDays);
    return vets;
  }
}
