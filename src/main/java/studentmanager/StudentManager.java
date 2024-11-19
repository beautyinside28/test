package studentmanager;

import java.util.*;

/**
 * A simple student management system that allows adding student names and
 * retrieving the list of students. This class ensures encapsulation by
 * providing controlled access to the student list.
 *
 * @author: PLACE YOUR NAME HERE
 *
 */
public class StudentManager
{

    /**
     * TASK 1.1 - Change this data structure to fit a better one.
     */
    private String[] students;

    /**
     * TASK 1.2 - Constructs a new instance of the StudentManager class.
     * Initializes the students list as an Array. Change this as well.
     */
    public StudentManager()
    {
        students = new String[0];
    }

    /**
     * TASK 1.3 - Get a copy of all student elements to check which data
     * structure is used. Change this return value as well to fit your change
     * from above.
     *
     * @return The data structure as a copy will be returned.
     */
    public String[] getStudents()
    {
        return students;
    }

    /**
     * TASK 2 - This method counts the total amount of elements in the data
     * structure. It returns -1 if this method has not been changed.
     *
     * @return the number of students currently in the list
     */
    public int countStudents()
    {
        // Make your change here. Hence, you got to change the return value!
        return -1;
    }

    /**
     * TASK 3 - This method appends the provided name to the end of the student
     * list. It checks whether the name is empty or Null before adding a new
     * student. It must interact with the data structure.
     *
     * @param studentName the name of the student to add
     */
    public void addStudent(String studentName)
    {
        // Make your change here
    }

}
