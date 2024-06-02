package Module6;

import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {
    public static void selectionSort(ArrayList<Student> list, Comparator<Student> comparator) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            Student temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(5, "Alice", "123 Street A"));
        students.add(new Student(2, "Bob", "456 Street B"));
        students.add(new Student(9, "Charlie", "789 Street C"));
        students.add(new Student(1, "David", "321 Street D"));
        students.add(new Student(3, "Eve", "654 Street E"));
        students.add(new Student(7, "Frank", "987 Street F"));
        students.add(new Student(6, "Grace", "147 Street G"));
        students.add(new Student(4, "Heidi", "258 Street H"));
        students.add(new Student(8, "Ivan", "369 Street I"));
        students.add(new Student(10, "Judy", "741 Street J"));

        System.out.println("Unsorted List:");
        for (Student student : students) {
            System.out.println(student);
        }

        selectionSort(students, new NameComparator());

        System.out.println("\nSorted by Name:");
        for (Student student : students) {
            System.out.println(student);
        }

        selectionSort(students, new RollNoComparator());

        System.out.println("\nSorted by Roll Number:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}