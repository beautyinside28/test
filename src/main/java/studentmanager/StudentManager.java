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
public class StudentManager {

    /**
     * TASK 1.1 - Change this data structure to fit a better one.
     */
    private ArrayList<String> students;

    /**
     * TASK 1.2 - Constructs a new instance of the StudentManager class.
     * Initializes the students list as an Array. Change this as well.
     */
    public StudentManager() {
        students = new ArrayList<String>();
    }

    /**
     * TASK 1.3 - Get a copy of all student elements to check which data
     * structure is used. Change this return value as well to fit your change
     * from above.
     *
     * @return The data structure as a copy will be returned.
     */
    public ArrayList<String> getStudents() {
        return this.students;
    }

    /**
     * TASK 2 - This method counts the total amount of elements in the data
     * structure. It returns -1 if this method has not been changed.
     *
     * @return the number of students currently in the list
     */
    public int countStudents() {
        // Make your change here. Hence, you got to change the return value!
        if (this.students.isEmpty()) {
            return -1;
        }
        return this.students.size();
    }

    /**
     * TASK 3 - This method appends the provided name to the end of the student
     * list. It checks whether the name is empty or Null before adding a new
     * student. It must interact with the data structure.
     *
     * @param studentName the name of the student to add
     */

    public void addStudent(String studentName) {
        if (studentName == null || studentName.trim().isEmpty()) {
            System.out.println("Invalid student name. Cannot be null or empty.");
            return;
        }
        boolean added = this.students.add(studentName); // Add the student to the set
        if (added) {
            System.out.println("Student added successfully: " + studentName);
        } else {
            System.out.println("Student already exists: " + studentName);
        }
    }
}
