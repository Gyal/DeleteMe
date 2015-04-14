package fr.iut.montreuil.lpcsid.repository;

import fr.iut.montreuil.lpcsid.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Mélina on 18/02/2015.
 */
@RepositoryRestResource
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
