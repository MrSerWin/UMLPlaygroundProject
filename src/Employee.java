import java.util.HashSet;
import java.util.Set;

/**
 * Created by andrewm on 11/07/17.
 */
public class Employee {
    public Person getPerson() {
        return person;
    }

    private final Person person = new Person();
    private String position;
    private IdCard iCard;
    private Set<Room> room = new HashSet();
    private Set<PastPosition> pastPosition = new HashSet();

    public Workgroup getWorkgroup() {
        return workgroup;
    }

    public void setWorkgroup(Workgroup workgroup) {
        this.workgroup = workgroup;
    }

    private Workgroup workgroup;

    public Employee(String name, String surname, String position){
        person.name = name;
        person.surname = surname;
        this.position = position;
    }
    public void setPosition(String newPosition){
        position = newPosition;
    }
    public String getPosition(){
        return position;
    }
    public void setIdCard(IdCard c){
        iCard = c;
    }
    public IdCard getIdCard(){
        return iCard;
    }

    public void setRoom(Room newRoom){
        room.add(newRoom);
    }
    public Set getRoom(){
        return room;
    }
    public void deleteRoom(Room r){
        room.remove(r);
    }



    public void setPastPosition(PastPosition p){
        pastPosition.add(p);
    }
    public Set getPastPosition(){
        return pastPosition;
    }
    public void deletePastPosition(PastPosition p){
        pastPosition.remove(p);
    }


}
