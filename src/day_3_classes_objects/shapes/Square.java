package day_3_classes_objects.shapes;

public class Square extends Shape_type implements Shape {
    int side;

    Square(int side,String name){
        super(name);
        this.side = side;


    }

    @Override
    public double getArea() {
        return side*side ;
    }

    @Override
    public String toString() {
        return super.name+"'s area is "+getArea();
    }




}
