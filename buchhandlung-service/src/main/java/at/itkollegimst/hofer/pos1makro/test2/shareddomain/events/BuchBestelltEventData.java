package at.itkollegimst.hofer.pos1makro.test2.shareddomain.events;

public class BuchBestelltEventData {

    private Long id;
    public BuchBestelltEventData() {

    }

    public BuchBestelltEventData(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
