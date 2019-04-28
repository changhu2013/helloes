package com.wulianshuntong.helloes;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("carrierService")
public class CarrierServiceImpl implements CarrierService {

  @Autowired
  @Qualifier("carrierRepository")
  private CarrierRepository carrierRepository;

  public void save(Carrier carrier) {
    carrierRepository.save(carrier);
  }

  public Carrier findCarrierById(String id) {

    Optional<Carrier> c = carrierRepository.findById(id);

    return c.get();
  }

}
