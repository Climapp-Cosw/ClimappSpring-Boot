package eci.cosw.climapp.repositories;

import eci.cosw.climapp.models.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Laura Ramos
 */
@Repository
public interface PublicationRepository extends JpaRepository <Publication, Integer>{
}
