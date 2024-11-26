import java.util.Date;
// This is a Hackafest class which extends Schedule class and implements event interface
//event have Event id ,name and location
public class Hackafest extends Schedule implements Event{
    public String eventName;
    public int e_id;

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String eventLocation;
    public Hackafest(int e_id,String eventName,String eventLocation) {
        this.e_id=e_id;
        this.eventName=eventName;
        this.eventLocation=eventLocation;
    }

    public Hackafest() {

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

    @Override
    public void display() {
        System.out.println("\nHackafest Schedule on : 12th and 13th december 2024.\n");
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
        System.out.println("\n\nInfofest\nEvent Id : "+e_id+"\nEvent name : "+this.eventName+"\nEvent Location :"+this.eventLocation);
    }
}
