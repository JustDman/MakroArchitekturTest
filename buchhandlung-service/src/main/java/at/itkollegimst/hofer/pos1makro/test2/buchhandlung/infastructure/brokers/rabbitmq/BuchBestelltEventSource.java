package at.itkollegimst.hofer.pos1makro.test2.buchhandlung.infastructure.brokers.rabbitmq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface BuchBestelltEventSource {

    String GEDRUCKT = "buchGedrucktChannel";

    @Input(GEDRUCKT)
    SubscribableChannel buchDrucken();

    @Output("buchBestelltChannel")
    MessageChannel buchBestellung();
}
