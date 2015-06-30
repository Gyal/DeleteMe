package fr.iut.montreuil.lpcsid.repository;

import fr.iut.montreuil.lpcsid.entity.BillEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by NIIRO on 30/06/2015.
 */

@RepositoryRestResource
public interface BillRepository extends JpaRepository<BillEntity, Long> {

}
