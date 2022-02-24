package day_3_classes_objects.shapes;

public class rectangle extends Shape_type implements Shape {
    int side1;
    int side2;

    rectangle(int side1,int side2,String name){
        super(name);
        this.side1 = side1;
        this.side2 = side2;


    }

    @Override
    public double getArea() {
        return side1*side2 ;
    }
    @Override
    public String toString() {
        return super.name+"'s area is "+getArea();
    }
}
