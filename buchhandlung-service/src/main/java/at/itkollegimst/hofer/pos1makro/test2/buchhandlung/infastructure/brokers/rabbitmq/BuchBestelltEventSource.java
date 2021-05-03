package at.itkollegimst.hofer.pos1makro.test2.buchhandlung.infastructure.brokers.rabbitmq;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface BuchBestelltEventSource {

    @Output("buchBestelltChannel")
    MessageChannel buchBestellung();
}
