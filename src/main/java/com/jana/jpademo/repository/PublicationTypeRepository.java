package com.jana.jpademo.repository;

import com.jana.jpademo.model.PublicationType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Jana on 10/14/2019.
 */
public interface PublicationTypeRepository extends JpaRepository<PublicationType, Long> {
}
