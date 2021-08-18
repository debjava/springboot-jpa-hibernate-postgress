package com.ddlab.rnd.many2many.bidirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidirectionalRepo extends JpaRepository<Artist, Long> {

}
