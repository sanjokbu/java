package Task_19_1_3;

import Task_19_1_2.Student;

import java.util.Comparator;

/*
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor> {
    public int compare(JavaRushMentor mentor1, JavaRushMentor mentor2) {
        return mentor1.getName().length() - mentor2.getName().length();
    }
}
