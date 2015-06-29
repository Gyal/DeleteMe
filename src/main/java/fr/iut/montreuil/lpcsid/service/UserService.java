package fr.iut.montreuil.lpcsid.service;

import fr.iut.montreuil.lpcsid.dto.UserDto;
import fr.iut.montreuil.lpcsid.entity.UserEntity;
import fr.iut.montreuil.lpcsid.repository.UserRepository;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

import static org.hibernate.validator.internal.util.CollectionHelper.newArrayList;

@Service
@Transactional
public class UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private Mapper mapper;

    @Autowired
    private UserRepository userRepository;

    @Inject
    public UserService(final UserRepository userRepository) {this.userRepository = userRepository;}

    public UserEntity saveUser(final UserEntity userEntity) {
        LOGGER.info("User save {}", userEntity);
        return userRepository.save(userEntity);
    }

    public void deleteUser(Long id){
        userRepository.delete(id);}


    // GET / : Récupération de la liste des  users
    public Iterable<UserDto> findAll() {
        final Iterable<UserEntity> userEntities = userRepository.findAll();
        Iterable<UserDto> userDtos = newArrayList();
        mapper.map(userEntities, userDtos);
        LOGGER.info("List users is {}", userDtos);
        return userDtos;

    }

    // GET / : Récupération d'un user par son ID
    public UserDto getUserById(long id) {
        UserEntity user = userRepository.findOne(id);
        UserDto userDto = mapper.map(user, UserDto.class);
        LOGGER.info("user is {}, return.", userDto);
        return userDto;
    }
}