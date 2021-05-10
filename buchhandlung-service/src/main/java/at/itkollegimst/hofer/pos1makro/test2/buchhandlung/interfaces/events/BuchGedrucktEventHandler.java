package at.itkollegimst.hofer.pos1makro.test2.buchhandlung.interfaces.events;

import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.application.internal.commandservices.BuchGedrucktCommandService;
import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.infastructure.brokers.rabbitmq.BuchBestelltEventSource;
import at.itkollegimst.hofer.pos1makro.test2.shareddomain.events.BuchGedrucktEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(BuchBestelltEventSource.class)
public class BuchGedrucktEventHandler {

    @Autowired
    private BuchGedrucktCommandService commandService;

    @StreamListener(target = BuchBestelltEventSource.GEDRUCKT)
    public void receiveEvent(BuchGedrucktEvent buchGedrucktEvent) {
        commandService.buchWurdeGedruckt(buchGedrucktEvent.getEventData().getId());
    }
}
