package org.batch.collections.sorting.list.comparator;

import java.util.Comparator;

public class StudentRollNumberComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getRollno() - student2.getRollno(); //asc order
    }
}
