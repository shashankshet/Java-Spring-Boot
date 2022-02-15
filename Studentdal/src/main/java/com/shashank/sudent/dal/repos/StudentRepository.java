package com.shashank.sudent.dal.repos;

import org.springframework.data.repository.CrudRepository;
import com.shashank.sudent.dal.Entities.*;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
