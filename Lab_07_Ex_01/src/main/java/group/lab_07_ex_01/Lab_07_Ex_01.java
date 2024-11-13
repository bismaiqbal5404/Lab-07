

package group.lab_07_ex_01;


public class Lab_07_Ex_01 {

    public static void main(String[] args) {
      
        Staff staff1 = new Staff("Bisma", 101);
        Staff staff2 = new Staff("Mahnoor", 102);
        
        Course course1 = new Course("Object Oriented Programming", "CS201");
        Course course2 = new Course("Discrete Mathematics", "C101");
        Course course3 = new Course("Calculus", "CS103");
        
        Course[] fac1Courses = { course1, course2 };
        Course[] fac2Courses = { course3 };
        
        Faculty fac1 = new Faculty("Talat", 201, fac1Courses);
        Faculty fac2 = new Faculty("Hanan", 202, fac2Courses);
        
        System.out.println("Staff Members:");
        staff1.displayInfo();
        staff2.displayInfo();
        
        System.out.println("\nFaculty Members:");
        fac1.displayInfo();
        fac2.displayInfo();
    }
}
    
