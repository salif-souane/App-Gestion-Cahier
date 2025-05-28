package com.uasz.demo.Repository.Cahier;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.uasz.demo.Model.Cahier.Cahier;

public interface CahierRepository extends JpaRepository<Cahier, Long> {
   Page<Cahier> findBynomContains(String keyword, Pageable pageable);

}
