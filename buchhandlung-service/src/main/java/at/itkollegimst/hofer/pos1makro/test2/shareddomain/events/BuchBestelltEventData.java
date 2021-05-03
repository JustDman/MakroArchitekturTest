package at.itkollegimst.hofer.pos1makro.test2.shareddomain.events;

public class BuchBestelltEventData {

    private String bestellid;

    public BuchBestelltEventData() {

    }

    public BuchBestelltEventData(String bestellid){
        this.bestellid = bestellid;
    }

    public String getId() {
        return bestellid;
    }

    public void setId(String bestellid) {
        this.bestellid = bestellid;
    }
}
