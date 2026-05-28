abstract class Shape{
    String name;
    public Shape(String name){
        this.name = name;
    }

    abstract double getArea();
    
    public String toString(){
        return "shape :" + name;
    }

    @Override
    public boolean equals(Object another){
        if(another instanceof Shape){
            Shape s1 = (Shape) another;
            return name.equals(s1.name);
        }else{
            return false;
        }
    }
}
class Triangle extends Shape{
    int sideA;
    int sideB;
    int sideC;
    public Triangle(int sideA,int sideB,int sideC,String name){
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    
    public double getArea(){
        
        int s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public boolean equals(Object another){
        if(another instanceof Triangle){
            Triangle tr = (Triangle) another;
            return name.equals(tr.name);
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "shape:" + this.name + " with sides:" + this.sideA +","+this.sideB +","+ sideC;
    }
}
public class Main {
    public static void main(String[] args) {
        // Create two triangles
        Triangle t1 = new Triangle(3, 4, 5, "TriangleOne");
        Triangle t2 = new Triangle(6, 8, 10, "TriangleTwo");
        Triangle t3 = new Triangle(3, 4, 5, "TriangleOne"); // same name as t1

        // Test toString()
        System.out.println(t1.toString());
        System.out.println(t2.toString());

        // Test getArea()
        System.out.println("Area of t1: " + t1.getArea());
        System.out.println("Area of t2: " + t2.getArea());

        // Test equals()
        System.out.println("t1 equals t2? " + t1.equals(t2));
        System.out.println("t1 equals t3? " + t1.equals(t3));

        // Test Shape reference
        Shape s = t1;
        System.out.println("Shape reference: " + s);
    }
}
