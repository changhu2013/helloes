package com.wulianshuntong.helloes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CarrierService {

  @Autowired
  @Qualifier("carrierRepository")
  private CarrierRepository carrierRepository;
    
  public void save(Carrier carrier) {   
    carrierRepository.save(carrier);
  }
  
}
