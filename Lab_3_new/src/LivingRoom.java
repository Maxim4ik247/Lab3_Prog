import java.util.ArrayList;
import java.util.List;

public class LivingRoom {
    private List<Character> visitors;
    public LivingRoom() {
        visitors = new ArrayList<Character>();
    }
    public void addVisitor(Character visitor) {
        if (visitors.contains(visitor)) {return;}
        visitors.add(visitor);
        System.out.println( visitor + " in living room");
    }
    public void removeVisitor(Character visitor) {
        visitors.remove(visitor);
    }
}
