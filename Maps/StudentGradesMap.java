import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradesMap {

    public static void main(String[] args) {

        HashMap<String, Double> gradesMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== STUDENT GRADES MAP MENU =====");
            System.out.println("1. Insert student grade");
            System.out.println("2. Increase a student's grade");
            System.out.println("3. Delete a student's grade");
            System.out.println("4. Display map size");
            System.out.println("5. Display average, max and min grades");
            System.out.println("6. Check if there is a grade equal to 20");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter grade: ");
                    double grade = sc.nextDouble();

                    gradesMap.put(name, grade);
                    System.out.println("Grade inserted.");
                    displayMap(gradesMap);
                    break;

                case 2:
                    System.out.print("Enter student name: ");
                    String nameToIncrease = sc.nextLine();

                    if (gradesMap.containsKey(nameToIncrease)) {
                        System.out.print("Enter value to increase: ");
                        double inc = sc.nextDouble();

                        double newGrade = gradesMap.get(nameToIncrease) + inc;
                        gradesMap.put(nameToIncrease, newGrade);

                        System.out.println("Grade updated.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    displayMap(gradesMap);
                    break;

                case 3:
                    System.out.print("Enter student name to delete: ");
                    String nameToDelete = sc.nextLine();

                    gradesMap.remove(nameToDelete);
                    System.out.println("Grade deleted (if existed).");
                    displayMap(gradesMap);
                    break;

                case 4:
                    System.out.println("Map size: " + gradesMap.size());
                    displayMap(gradesMap);
                    break;

                case 5:
                    if (gradesMap.isEmpty()) {
                        System.out.println("Map is empty.");
                    } else {
                        double sum = 0;
                        double max = Double.MIN_VALUE;
                        double min = Double.MAX_VALUE;

                        for (double g : gradesMap.values()) {
                            sum += g;
                            if (g > max) max = g;
                            if (g < min) min = g;
                        }

                        double avg = sum / gradesMap.size();

                        System.out.println("Average: " + avg);
                        System.out.println("Max: " + max);
                        System.out.println("Min: " + min);
                    }
                    displayMap(gradesMap);
                    break;

                case 6:
                    boolean has20 = gradesMap.containsValue(20.0);
                    if (has20) {
                        System.out.println("There is a grade equal to 20.");
                    } else {
                        System.out.println("There is no grade equal to 20.");
                    }
                    displayMap(gradesMap);
                    break;

                case 0:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }

    // Display map using forEach + lambda
    public static void displayMap(HashMap<String, Double> map) {
        System.out.println("\n--- Student Grades List ---");
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
