package org.vet.management.application.port.out;

import org.vet.management.domain.model.Vets;

import java.util.List;

public interface IVetsRepository {
  List<Vets> getAllVets();
  Vets getVetsById(String id);
  Vets createVets(Vets vets);
  Vets updateVets(String id, Vets vets);
  Vets deleteVets(String id);
}
