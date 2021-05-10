package at.itkollegimst.hofer.pos1makro.test2.druckerei.application.internal.commandservices;

import at.itkollegimst.hofer.pos1makro.test2.druckerei.domain.model.aggregates.BestellId;
import at.itkollegimst.hofer.pos1makro.test2.druckerei.infastructure.repositories.jpa.DruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BuchDruckCommandService {

    @Autowired
    DruckRepository repository;

    @Transactional
    public void druckeBuch(String id) {
        BestellId bestellId = new BestellId(id);
        System.out.println(String.format("Buch mit der ID %s wird gedruckt", bestellId.getBestellId()));
        repository.save(bestellId);
    }
}
