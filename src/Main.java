public class Main {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = new Student[5];
        students[0] = new Student(123, "John",4);
        students[1] = new Student(456, "Alice",3);
        students[2] = new Student(789, "Bob",1);
        students[3] = new Student(234, "Emily",2);
        students[4] = new Student(567, "David",2);

        // Sort the array by ID number using insertion sort
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }

            students[j + 1] = key;
        }

        // Print the sorted array
        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", Name: " + student.getName() + ", GPA: " + student.getGPA());
        }
    }
}
