package fr.iut.montreuil.lpcsid.controller;

import fr.iut.montreuil.lpcsid.service.UserService;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by juliana on 24/06/15.
 */
@RestController
@RequestMapping("api/delete")
public class DeleteController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeleteController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private Mapper mapper;



}
