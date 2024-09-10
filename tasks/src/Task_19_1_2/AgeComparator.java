package Task_19_1_2;

import java.util.Comparator;

/*
Сортировка по возрасту
*/

public class AgeComparator implements Comparator<Student> {

    public int compare(Student Student1, Student Student2){
        return (Student2.getAge() - Student1.getAge());
    }
}