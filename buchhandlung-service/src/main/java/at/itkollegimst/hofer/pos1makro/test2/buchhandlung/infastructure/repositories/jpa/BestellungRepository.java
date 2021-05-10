package at.itkollegimst.hofer.pos1makro.test2.buchhandlung.infastructure.repositories.jpa;

import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.aggregates.BestellId;
import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.aggregates.Bestellung;
import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.valueobjects.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BestellungRepository extends JpaRepository<Bestellung, Long> {

    @Modifying
    @Query("update Bestellung set status = :status where bestellid = :bestellId")
    void updateStatus(@Param("status") Status status, @Param("bestellId") BestellId bestellId);

    List<Bestellung> findAll();
}
