package at.itkollegimst.hofer.pos1makro.test2.buchhandlung.application.internal.commandservices;

import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.aggregates.BestellId;
import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.valueobjects.Status;
import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.infastructure.repositories.jpa.BestellungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BuchGedrucktCommandService {

    @Autowired
    private BestellungRepository bestellungRepository;

    @Transactional
    public void buchWurdeGedruckt(String bestellId) {
        bestellungRepository.updateStatus(Status.ABHOLBEREIT, new BestellId(bestellId));
    }
}
