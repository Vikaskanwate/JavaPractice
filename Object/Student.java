
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
        if(marks.length > count){
            marks[count] = mark;
            count++;
        }else{
            System.out.println("Array is full");
        }
    }

    // TODO 2: Average
    public double getAverage() {
        int sum = 0;
        for(int i = 0; i < count; i++){
            sum += marks[i];
        }
        return sum / marks.length;
    }

    // TODO 3: Grade
    // >= 90 → A
    // >= 75 → B
    // >= 50 → C
    // else → Fail
    public String getGrade() {  
        if(getAverage() >= 90){
            return "A";
        }
        if(getAverage() >= 75){
            return "B";
        }
        if(getAverage() >= 50){
            return "C";
        }
        return "Fail";
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