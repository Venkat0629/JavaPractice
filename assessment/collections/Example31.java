package assessment.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int ageComparison = Integer.compare(s2.getAge(), s1.getAge());


        if (ageComparison == 0) {
            return Double.compare(s1.getHeight(), s2.getHeight());
        }

        return ageComparison;
    }

}


public class Example31 {
    public static void main(String[] args) {

        Set<Student> treeSet = new TreeSet<>(new StudentComparator());

        treeSet.add(new Student("Alice", 30, 165.0));
        treeSet.add(new Student("Bob", 25, 175.5));
        treeSet.add(new Student("Charlie", 30, 160.0));
        treeSet.add(new Student("David", 20, 180.0));
        treeSet.add(new Student("Eve", 25, 170.0));

        for (Student person : treeSet) {
            System.out.println(person);
        }
    }
}


