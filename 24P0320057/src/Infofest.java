
// This is a Infofest class which extends Schedule class and implements event interface
//event have Event id ,name and location
public class Infofest extends Schedule implements Event {
    public String eventName;
    public String eventLocation;
    public int e_id;

    public Infofest(int e_id,String eNameI, String eLocationI) {
        this.e_id=e_id;
        this.eventName=eNameI;
        this.eventLocation=eLocationI;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public Infofest() {
    }

    @Override
    public void display() {
        System.out.println("Infofest is schedule on : 12th december 2024 to 14th december 2024.");
        System.out.println("Event1 between 2.30pm to 4.30pm");
        System.out.println("Event2 between 4.30pm to 5.30pm");
        System.out.println("Day2 between 10.30am to 11.30am\n");
    }

    @Override
    public String addEvent() {
        return eventName;
    }

    @Override
    public String addLocation() {
        return eventLocation;
    }

    @Override
    public void displayEvent() {
        System.out.println("Hackafest\nEvent Id : "+e_id+"\nEvent name : "+this.eventName+"Event Location :"+this.eventLocation);
    }
}
