package at.itkollegimst.hofer.pos1makro.test2.druckerei.interfaces.events;

import at.itkollegimst.hofer.pos1makro.test2.druckerei.application.internal.commandservices.BuchDruckCommandService;
import at.itkollegimst.hofer.pos1makro.test2.druckerei.infastructure.brokers.rabbitmq.BuchBestelltBinding;
import at.itkollegimst.hofer.pos1makro.test2.shareddomain.events.BuchBestelltEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(BuchBestelltBinding.class)
public class BuchBestelltEventHandler {

    @Autowired
    private BuchDruckCommandService buchDruckCommandService;

    @StreamListener(target = BuchBestelltBinding.BESTELLT)
    public void receiveEvent(BuchBestelltEvent buchBestelltEvent) {
        buchDruckCommandService.druckeBuch(buchBestelltEvent.getEventData().getId());

    }

}
