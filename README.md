
# BIS2141 Exam: Student Manager

#### **Duration:** 60 minutes  
#### **Maximum Points:** 60  
#### **Location:** Laboratory Room W2.2.12  
#### **Tools Allowed:**  
- **IDE:** NetBeans (mandatory) with Git and GitHub.
- **Handwritten Cheat Sheet:** One A4 sheet, front and back, or two single-sided A4 sheets.  
- **Prohibited Tools:** Use of AI-based tools (e.g., ChatGPT) or other external coding tools is not allowed.  

## **Objective**  
This exam tests your practical Java programming skills, including proficiency in data structures, method implementation, and Git version control workflows. The provided tasks require modifications to an existing codebase.  


## **Base Template**  
You will be provided with a pre-configured NetBeans project containing:  
1. **`StudentManager.java`**: A class for managing a collection of students.  
2. **`StudentManagerApp.java`**: A pre-written test class to verify the correctness of your changes. **You do not have to make any changes in this class!** 

You must complete the following tasks based on the provided codebase.


## **Tasks**

### **Task 1: Change of Data Structure** *(15 points)*  
- **Description**: Modify the internal data structure used for managing the student list from `Array` to a more suitable data structure.  
- **Instructions**:
  1. Change the line of code declaring the data structure.
  2. Update the constructor to initialise the new data structure.
  3. Modify the `getStudents` method to return the correct type of the updated data structure.
- **Evaluation**:
  - Correct replacement of the data structure (5 points).
  - Proper initialisation in the constructor (5 points).
  - Correct return type in `getStudents` (5 points).


### **Task 2: Modify `countStudents` Method** *(10 points)*  
- **Description**: Update the `countStudents` method to count the number of students correctly. Currently, the method returns `-1`.  
- **Instructions**:
  Replace the logic of `countStudents` to compute and return the correct count of students in the list.
- **Evaluation**: Correct implementation of the counting logic (10 points).


### **Task 3: Implement `addStudent` Method** *(15 points)*  
- **Description**: Implement a method that appends a student name to the list while handling invalid inputs.  
- **Instructions**:
  1. Update the `addStudent(String studentName)` method to:
     - Check if `studentName` is `null` or empty. If it is, do not add it to the list.
     - Append valid names to the list using the data structure.
  2. Ensure the method interacts with the new data structure.  
- **Evaluation**:
  - Correct validation of input (8 points).
  - Proper interaction with the data structure (7 points).


### **Task 4: Git Workflow** *(20 points)*  
- **Description**: Demonstrate proficiency with Git version control.  
- **Instructions**:
  1. Create a new branch named `feature/data-structure-update`.
  2. Commit all changes for Tasks 1–3 to this branch.
  3. Merge the branch into `main` and resolve any conflicts if needed.
  4. Push all changes to the provided GitHub repository.
- **Evaluation**:
  - Proper branch creation and commit structure (10 points).
  - Successful merge and push to the repository (10 points).


## **Submission Instructions**
1. Ensure all changes are committed and pushed to the GitHub repository.  
2. Verify that the project compiles and all tests pass.  
3. Include a clear commit history showing task progression.


## **Evaluation Criteria**
| Task                          | Points | Focus                                          |
|-------------------------------|--------|-----------------------------------------------|
| **Task 1: Change Data Structure** | 15     | Correct modification of the internal data structure. |
| **Task 2: Modify `countStudents`** | 10     | Accurate student count logic.                 |
| **Task 3: Implement `addStudent`**| 15     | Proper validation and interaction with data structure. |
| **Task 4: Git Workflow**       | 20     | Effective use of Git for version control.      |

**Total: 60 Points**

Good luck!
