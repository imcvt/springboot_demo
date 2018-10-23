package com.imc.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author luoly
 * @date 2018/10/22 20:59
 * @description
 */

@Repository
public interface TbAreaRepository extends CrudRepository<TbArea, Integer>{
}
