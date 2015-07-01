package fr.iut.montreuil.lpcsid.service;

import fr.iut.montreuil.lpcsid.entity.RequestEntity;
import fr.iut.montreuil.lpcsid.entity.UserEntity;
import fr.iut.montreuil.lpcsid.repository.RequestRepository;
import fr.iut.montreuil.lpcsid.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Mélina on 01/07/2015.
 */
@Service
@Component
@Transactional
public class RequestService {


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RequestRepository requestRepository;


    //Récupération des demandes d'un utilisateur
    public List<RequestEntity> getRequestUser(Long userId) {
        UserEntity user = userRepository.findOne(userId);
        List<RequestEntity> accounts = requestRepository.findByuserEntity(user);
        return accounts;
    }

}
