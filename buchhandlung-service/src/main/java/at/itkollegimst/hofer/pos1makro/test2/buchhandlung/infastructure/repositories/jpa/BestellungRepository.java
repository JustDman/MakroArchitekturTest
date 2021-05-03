package at.itkollegimst.hofer.pos1makro.test2.buchhandlung.infastructure.repositories.jpa;

import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.aggregates.Bestellung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BestellungRepository extends JpaRepository<Bestellung, Long> {
}
