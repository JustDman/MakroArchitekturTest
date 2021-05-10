package at.itkollegimst.hofer.pos1makro.test2.shareddomain.events;

public class BuchGedrucktEventData {

    private String bestellid;

    public BuchGedrucktEventData() {

    }

    public BuchGedrucktEventData(String bestellid){
        this.bestellid = bestellid;
    }

    public String getId() {
        return bestellid;
    }

    public void setId(String bestellid) {
        this.bestellid = bestellid;
    }
}
