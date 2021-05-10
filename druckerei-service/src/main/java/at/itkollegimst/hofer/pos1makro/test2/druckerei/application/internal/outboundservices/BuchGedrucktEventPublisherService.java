package at.itkollegimst.hofer.pos1makro.test2.druckerei.application.internal.outboundservices;

import at.itkollegimst.hofer.pos1makro.test2.druckerei.infastructure.brokers.rabbitmq.BuchBestelltBinding;
import at.itkollegimst.hofer.pos1makro.test2.shareddomain.events.BuchGedrucktEvent;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
@EnableBinding(BuchBestelltBinding.class)
public class BuchGedrucktEventPublisherService {

    private BuchBestelltBinding eventSource;

    public BuchGedrucktEventPublisherService(BuchBestelltBinding eventSource) {
        this.eventSource = eventSource;
    }

    @TransactionalEventListener
    public void handleBuchGedrucktEvent(BuchGedrucktEvent event) {
        eventSource.buchDrucken().send(MessageBuilder.withPayload(event).build());
    }


}
