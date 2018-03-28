package eci.cosw.climapp.repositories;

import eci.cosw.climapp.models.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Laura Ramos
 */
@Repository
public interface PublicationRepository extends JpaRepository <Publication, Integer>{

    @Query(value ="SELECT @@IDENTITY FROM Publication", nativeQuery = true)
    public int PublicationIdLast();
}
