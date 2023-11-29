public class Student {
    private int iDNumber;
    private String name;
    private int GPA;

    public Student(int iDNumber, String name, int GPA) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.GPA = GPA;
    }

    public int getGPA(){
        return  GPA;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }
}

