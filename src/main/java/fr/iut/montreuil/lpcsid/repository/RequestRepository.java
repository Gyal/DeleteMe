package fr.iut.montreuil.lpcsid.repository;

import fr.iut.montreuil.lpcsid.entity.RequestEntity;
import fr.iut.montreuil.lpcsid.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by NIIRO on 30/06/2015.
 */

@RepositoryRestResource
public interface RequestRepository extends JpaRepository<RequestEntity, Long> {
    public List<RequestEntity> findByuserEntity(UserEntity userEntity);

}