package at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.commands;

import at.itkollegimst.hofer.pos1makro.test2.buchhandlung.domain.model.valueobjects.Status;

public class BuchBestelltCommand {

    private Status status;
    private String bestellid;

    public BuchBestelltCommand() {
        setStatus(Status.OTHER);
    }

    public BuchBestelltCommand(Status status) {
        setStatus(status);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getBestellid() {
        return bestellid;
    }

    public void setBestellid(String bestellid) {
        this.bestellid = bestellid;
    }
}

