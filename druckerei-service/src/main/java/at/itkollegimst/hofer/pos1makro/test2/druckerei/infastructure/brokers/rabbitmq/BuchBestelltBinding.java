package at.itkollegimst.hofer.pos1makro.test2.druckerei.infastructure.brokers.rabbitmq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface BuchBestelltBinding {

    String BESTELLT = "buchBestelltChannel";

    @Input(BESTELLT)
    SubscribableChannel buchBestellung();

    @Output("buchGedrucktChannel")
    MessageChannel buchDrucken();
}
