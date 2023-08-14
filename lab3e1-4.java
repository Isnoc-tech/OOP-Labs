class Student {
    private String name;
    private int rollNumber;
    private String address;
    
    // Constructor to initialize all variables
    public Student(String name, int rollNumber, String address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
    }
    
    // Accessor methods (getters)
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
    
    // Mutator methods (setters)
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    
    // Method to get details
    public String getDetails() {
        return "I am a Student.\nMy name is " + name + ".\nI am from " + address + ".\nMy dit no is DIT/" + rollNumber + ".";
    }
}

class Test {
    public static void main(String[] args) {
        // Create objects using the constructor
        Student student1 = new Student("Udaya", 10, "Malabe");
        
        // Call getDetails() method
        System.out.println(student1.getDetails());
    }
}
