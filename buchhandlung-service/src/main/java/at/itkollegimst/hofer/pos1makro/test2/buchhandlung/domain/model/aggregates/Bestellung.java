package at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.aggregates;

import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.valueobjects.Status;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.*;

@Entity
public class Bestellung extends AbstractAggregateRoot<Bestellung> {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Status status;

    public Bestellung() {

    }

    public Long getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
