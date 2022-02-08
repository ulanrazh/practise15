package peaksoft;

public class Mentors extends Instructor {
    private String room;
    private int number;

    public Mentors(String name, String groupName, String room, int number) {
        super(name, groupName);
        this.room = room;
        this.number = number;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Mentors{" +
                "room='" + room + '\'' +
                ", number=" + number +
                '}';
    }
}
