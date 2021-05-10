package at.itkollegimst.hofer.pos1makro.test2.buchhandlung.application.internal.commandservices;

import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.aggregates.BestellId;
import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.aggregates.Bestellung;
import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.commands.BuchBestelltCommand;
import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.valueobjects.Status;
import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.infastructure.repositories.jpa.BestellungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Service
public class BuchBestelltCommandService {

    @Autowired
    private BestellungRepository repository;

    public BestellId bestellen(BuchBestelltCommand command) {

        String random = UUID.randomUUID().toString().toUpperCase();
        command.setBestellid(random);
        command.setStatus(Status.BESTELLT);
        Bestellung bestellung = new Bestellung(command);
        repository.save(bestellung);
        return new BestellId(random);
    }

    public List<Bestellung> listAll() {
        return repository.findAll();
    }
}
