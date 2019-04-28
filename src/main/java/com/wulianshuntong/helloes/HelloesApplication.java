package com.wulianshuntong.helloes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloesApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(HelloesApplication.class, args);
  }

  @Autowired
  private CarrierService carrierService;

  @Override
  public void run(String... args) throws Exception {

    int i = 100;
    
    while (i-- > 0) {
      Carrier carrier = new Carrier();
      carrier.setId("" + i);
      carrier.setName("名字 " + i);
      carrierService.save(carrier);
    } 
  }
}
