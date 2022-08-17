package com.revature.utils;

import java.util.Comparator;
import com.revature.models.Student;

/**
 * Unlike Comparable, Comparator is external to the element type we are
 * comparing. It’s a separate class. We create multiple separate classes (that
 * implement Comparator) to compare by different members.
 * 
 * Collections class has a second sort() method and it takes Comparator. The
 * sort() method invokes the compare() to sort objects.
 */
public class MathSorter implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        // TODO Auto-generated method stub
        return s1.getMathGrade() - s2.getMathGrade();
    }
}
