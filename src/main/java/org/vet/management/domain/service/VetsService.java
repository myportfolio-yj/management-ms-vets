package org.vet.management.domain.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.vet.management.application.port.out.IVetsRepository;
import org.vet.management.domain.model.Vets;

import java.util.List;

@ApplicationScoped
public class VetsService {
  @Inject
  IVetsRepository vetsRepository;
  public List<Vets> getAllVets() {
    return vetsRepository.getAllVets();
  }

  public Vets getVetsById(String id) {
    return vetsRepository.getVetsById(id);
  }

  public Vets createVets(Vets vets) {
    return vetsRepository.createVets(vets);
  }

  public Vets updateVets(String id, Vets vets) {
    return vetsRepository.updateVets(id, vets);
  }

  public Vets deleteVets(String id) {
    return vetsRepository.deleteVets(id);
  }
}
