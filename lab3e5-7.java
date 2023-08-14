class Person {
    private String name;
    private String address;
    
    // Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    // Method to show details
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

class Student extends Person {
    private String studentId;
    
    // Constructor
    public Student(String name, String address, String studentId) {
        super(name, address);
        this.studentId = studentId;
    }
    
    // Method to show details
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Student ID: " + studentId);
    }
}

class PartTimeStudent extends Student {
    private int workingHours;
    
    // Constructor
    public PartTimeStudent(String name, String address, String studentId, int workingHours) {
        super(name, address, studentId);
        this.workingHours = workingHours;
    }
    
    // Method to show details
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Working Hours: " + workingHours);
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        // Create an object of PartTimeStudent class
        PartTimeStudent partTimeStudent = new PartTimeStudent("Alice Johnson", "789 Oak St", "56789", 20);
        
        // Call showDetails() method
        partTimeStudent.showDetails();
    }
}
