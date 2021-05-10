package at.itkollegimst.hofer.pos1makro.test2.druckerei.infastructure.repositories.jpa;

import at.itkollegimst.hofer.pos1makro.test2.druckerei.domain.model.aggregates.BestellId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DruckRepository extends JpaRepository<BestellId, Long> {
}
