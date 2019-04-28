package com.wulianshuntong.helloes;

import java.util.Optional;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CarrierRepository extends ElasticsearchRepository<Carrier, String> {

  public Optional<Carrier> findById(String id);
  
}
