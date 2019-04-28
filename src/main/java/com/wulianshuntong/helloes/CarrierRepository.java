package com.wulianshuntong.helloes;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CarrierRepository extends ElasticsearchRepository<Carrier, String> {

  
}
