package studentmanager;

/**
 * DO NOT MAKE ANY CHANGES IN THIS CLASS!
 *
 * @author Andreas R. Schneider
 */
public class StudentManagerApp
{

    static StudentManager studentManager = new StudentManager();

    public static void main(String[] args)
    {
        // Your solution will be tested here!
        testTaskOne();
        System.out.println("");
        testTaskTwo();
        System.out.println("");
        testTaskThree();
    }

    /**
     * Test Method for Task 1. You do not have to make any changes on this
     * method!
     */
    public static void testTaskOne()
    {
        // Retrieve the class type of the object returned by getStudents()
        String dsClass = studentManager.getStudents().getClass().toString();

        // Enhance readability by identifying specific class types
        switch (dsClass)
        {
            case "class [Ljava.lang.String;":
                dsClass = "Array of Strings";
                break;
            case "class [Lcom.example.Student;":
                dsClass = "Array of Student Objects";
                break;
            case "class java.util.ArrayList":
                dsClass = "ArrayList";
                break;
            case "class java.util.LinkedList":
                dsClass = "LinkedList";
                break;
            case "class java.util.HashSet":
                dsClass = "HashSet";
                break;
            default:
                dsClass = "Unknown or Unsupported Type";
                break;
        }

        // Drawing the interface
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║                 CHECK TASK ONE                   ║");
        System.out.println("╠══════════════════════════════════════════════════╣");
        System.out.printf("║ Class Name: %-37s║%n", dsClass);
        if (dsClass.contains("ArrayList") || dsClass.contains("LinkedList"))
        {
            System.out.println("║ Status    : Correct Implementation               ║");
        } else
        {
            System.out.println("║ Status    : Incorrect Implementation             ║");
        }
        System.out.println("╚══════════════════════════════════════════════════╝");
    }

    /**
     * Test Method for Task 2. You do not have to make any changes on this
     * method!
     */
    public static void testTaskTwo()
    {
        int result = studentManager.countStudents();

        // Drawing the interface
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║                 CHECK TASK TWO                   ║");
        System.out.println("╠══════════════════════════════════════════════════╣");

        if (result == -1)
        {
            System.out.println("║ Status: Not successfully solved yet!             ║");
        } else
        {
            System.out.printf("║ The number of students in the list: %-11d║%n", result);
            System.out.println("║ Status: Task 2 successfully completed!           ║");
        }

        System.out.println("╚══════════════════════════════════════════════════╝");
    }

    /**
     * Test Method for Task 3. You do not have to make any changes on this
     * method!
     */
    public static void testTaskThree()
    {
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║                 CHECK TASK THREE                 ║");
        System.out.println("╠══════════════════════════════════════════════════╣");

        try
        {
            // Valid input test
            String validName = "Alice Johnson";
            studentManager.addStudent(validName);
            System.out.printf("║ Added student: %-34s║%n", validName);
            System.out.println("║ Status: Successfully added valid student!        ║");

            // Invalid input test: Empty string
            String emptyName = "";
            studentManager.addStudent(emptyName);
            System.out.println("║ Status: Error! Empty input should have failed!   ║");
        } catch (IllegalArgumentException e)
        {
            System.out.println("║ Status: Properly handled invalid input!          ║");
            System.out.printf("║ Error Message: %-34s║%n", e.getMessage());
        }

        try
        {
            // Invalid input test: Null value
            String nullName = null;
            studentManager.addStudent(nullName);
            System.out.println("║ Status: Error! Null input should have failed!    ║");
        } catch (IllegalArgumentException e)
        {
            System.out.println("║ Status: Properly handled null input!             ║");
            System.out.printf("║ Error Message: %-34s║%n", e.getMessage());
        }

        System.out.println("╚══════════════════════════════════════════════════╝");
    }
}
