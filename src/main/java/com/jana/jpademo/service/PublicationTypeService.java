package com.jana.jpademo.service;

import com.jana.jpademo.model.PublicationType;
import com.jana.jpademo.repository.PublicationTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Jana on 10/14/2019.
 */
@Service
public class PublicationTypeService {

    @Autowired
    PublicationTypeRepository repository;

    public void saveOrUpdate(PublicationType publicationType) {
        repository.save(publicationType);
    }

    public Optional<PublicationType> getPublicationTypeById(Long id) {
        return repository.findById(id);
    }

    public List<PublicationType> getAllPublicationType() {
        return repository.findAll();
    }

    public void deletePublicationType(Long id) {
        repository.deleteById(id);
    }
}
