package com.ddlab.rnd.one2one.bidirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface One2OneBidirectionalRepo extends JpaRepository<Post1, Long> {

}
