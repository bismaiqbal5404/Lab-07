
package group.lab_07_ex_01;


class Faculty extends Staff {
    private Course[] courses;

    public Faculty(String name, int id, Course[] courses) {
        super(name, id); 
        this.courses = courses;
    }

  
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Courses assigned:");
        for (Course course : courses) {
            course.displayInfo();
        }
    }
}


