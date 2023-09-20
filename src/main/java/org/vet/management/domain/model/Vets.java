package org.vet.management.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Vets {
  public String id;
  public String corporateName;
  public String idAddress;
  public String openingTime;
  public String closingTime;
  public String businessDays;
}
