package org.vet.management.domain.model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.types.ObjectId;

@MongoEntity(collection="collect-address")
public class AddressEntity extends PanacheMongoEntity {
  public ObjectId id;
  public String address;
  public String city;
  public String state;
  public String country;
}
