package at.itkollegimst.hofer.pos1makro.test2.shareddomain.events;

public class BuchBestelltEvent {

    private BuchBestelltEventData eventData;

    public BuchBestelltEvent() {

    }
    public BuchBestelltEvent(BuchBestelltEventData eventData) {
        this.eventData = eventData;
    }

    public BuchBestelltEventData getEventData() {
        return eventData;
    }

    public void setEventData(BuchBestelltEventData eventData) {
        this.eventData = eventData;
    }
}
