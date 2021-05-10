package at.itkollegimst.hofer.pos1makro.test2.druckerei.domain.model.aggregates;

import at.itkollegimst.hofer.pos1makro.test2.shareddomain.events.BuchGedrucktEvent;
import at.itkollegimst.hofer.pos1makro.test2.shareddomain.events.BuchGedrucktEventData;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.*;

@Entity()
@Table(name = "bestell_id")
public class BestellId extends AbstractAggregateRoot<BestellId> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bestellId;

    public BestellId(){

    }
    public BestellId(String bestellId) {
        this.bestellId = bestellId;
        addDomainEvent(new BuchGedrucktEvent(new BuchGedrucktEventData(bestellId)));
    }

    private void addDomainEvent(Object event) {
        registerEvent(event);
    }

    public void setBestellId(String bestellId) {
        this.bestellId = bestellId;
    }

    public String getBestellId() {
        return this.bestellId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
