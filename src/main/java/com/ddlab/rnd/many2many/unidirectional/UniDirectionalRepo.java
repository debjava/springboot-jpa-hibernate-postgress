package com.ddlab.rnd.many2many.unidirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniDirectionalRepo extends JpaRepository< Book, Long> {

}
