package com.wulianshuntong.helloes;

import org.springframework.stereotype.Service;

@Service
public interface CarrierService {

  public void save(Carrier carrier);
  
  public Carrier findCarrierById(String id);

}
