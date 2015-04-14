package fr.iut.montreuil.lpcsid.service;

import fr.iut.montreuil.lpcsid.entity.UserEntity;
import fr.iut.montreuil.lpcsid.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;
    @Inject
    public UserService(final UserRepository userRepository) {this.userRepository = userRepository;}
    public UserEntity saveUser(final UserEntity userEntity) {return userRepository.save(userEntity);}
    public void deleteUser(Long id){
        userRepository.delete(id);}
    public Iterable<UserEntity> getAllUsers() {return userRepository.findAll();}
    public UserEntity getUserById(Long id) {return userRepository.findOne(id);}
}