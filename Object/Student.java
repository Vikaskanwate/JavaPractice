public class Student {

    private String name;
    private int[] marks;
    private int count;

    public Student(String name, int size) {
        this.name = name;
        this.marks = new int[size];
        this.count = 0;
    }

    // TODO 1: Add Marks
    // Add only if count < array size
    public void addMark(int mark) {

    }

    // TODO 2: Average
    public double getAverage() {
        return 0;
    }

    // TODO 3: Grade
    // >= 90 → A
    // >= 75 → B
    // >= 50 → C
    // else → Fail
    public String getGrade() {
        return "";
    }

    // TODO 4: Highest Marks
    public int getHighest() {
        return 0;
    }

    // TODO 5: Summary
    public String getSummary() {
        return "";
    }
}