import java.util.HashSet;
import java.util.Set;

public class GroupsSet {

    public static void main(String[] args) {

        Set<String> groupA = new HashSet<>();
        Set<String> groupB = new HashSet<>();

        // Add students to group A
        groupA.add("Ali");
        groupA.add("Sara");
        groupA.add("Yassine");
        groupA.add("Imane");

        // Add students to group B
        groupB.add("Sara");
        groupB.add("Hassan");
        groupB.add("Imane");
        groupB.add("Noura");

        System.out.println("Group A: " + groupA);
        System.out.println("Group B: " + groupB);

        // Intersection
        Set<String> intersection = new HashSet<>(groupA);
        intersection.retainAll(groupB);
        System.out.println("\nIntersection (A ∩ B): " + intersection);

        // Union
        Set<String> union = new HashSet<>(groupA);
        union.addAll(groupB);
        System.out.println("Union (A ∪ B): " + union);
    }
}
