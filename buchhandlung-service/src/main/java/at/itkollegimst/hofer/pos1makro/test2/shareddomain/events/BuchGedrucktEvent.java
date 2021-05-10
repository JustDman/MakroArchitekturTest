package at.itkollegimst.hofer.pos1makro.test2.shareddomain.events;

public class BuchGedrucktEvent {

    private BuchGedrucktEventData eventData;

    public BuchGedrucktEvent() {

    }
    public BuchGedrucktEvent(BuchGedrucktEventData eventData) {
        this.eventData = eventData;
    }

    public BuchGedrucktEventData getEventData() {
        return eventData;
    }

    public void setEventData(BuchGedrucktEventData eventData) {
        this.eventData = eventData;
    }
}
