package com.imc.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author luoly
 * @date 2018/10/23 11:46
 * @description
 */
@Repository
public interface SupplierRepository extends CrudRepository<Supplier, Long>{

}
