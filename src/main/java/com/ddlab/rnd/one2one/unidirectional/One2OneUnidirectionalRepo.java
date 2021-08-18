package com.ddlab.rnd.one2one.unidirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface One2OneUnidirectionalRepo extends JpaRepository<Student, Long> {

}
