package org.vet.management.domain.model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.types.ObjectId;

@MongoEntity(collection="collect-vets")
public class VetsEntity extends PanacheMongoEntity {
  public ObjectId id;
  public String corporateName;
  public String idAddress;
  public String openingTime;
  public String closingTime;
  public String businessDays;

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public String getCorporateName() {
    return corporateName;
  }

  public void setCorporateName(String corporateName) {
    this.corporateName = corporateName;
  }

  public String getIdAddress() {
    return idAddress;
  }

  public void setIdAddress(String idAddress) {
    this.idAddress = idAddress;
  }

  public String getOpeningTime() {
    return openingTime;
  }

  public void setOpeningTime(String openingTime) {
    this.openingTime = openingTime;
  }

  public String getClosingTime() {
    return closingTime;
  }

  public void setClosingTime(String closingTime) {
    this.closingTime = closingTime;
  }

  public String getBusinessDays() {
    return businessDays;
  }

  public void setBusinessDays(String businessDays) {
    this.businessDays = businessDays;
  }
}
