package com.ddlab.rnd.one2many.bidirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiDirPostRepo extends JpaRepository<BiDirPost, Long> {

}
