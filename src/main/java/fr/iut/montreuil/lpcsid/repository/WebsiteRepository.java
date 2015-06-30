package fr.iut.montreuil.lpcsid.repository;

import fr.iut.montreuil.lpcsid.entity.WebsiteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by NIIRO on 30/06/2015.
 */
@RepositoryRestResource
public interface WebsiteRepository extends JpaRepository<WebsiteEntity, Long> {

}
