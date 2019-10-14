package com.jana.jpademo.controller;

import com.jana.jpademo.model.PublicationType;
import com.jana.jpademo.service.PublicationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jana on 10/15/2019.
 */
@RestController
@RequestMapping("/getPublicationType")
public class PublicationTypeController {

    @Autowired
    PublicationTypeService service;

    @PostMapping
    public void saveOrUpdatePublicationType(@RequestBody PublicationType publicationType) {
        service.saveOrUpdate(publicationType);
    }
}
