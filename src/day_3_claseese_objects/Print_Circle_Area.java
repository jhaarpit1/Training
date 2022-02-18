package day_3_claseese_objects;

import java.util.Scanner;

public class Print_Circle_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String color = sc.nextLine();
        int radius = sc.nextInt();
        input_cirlce inp = new input_cirlce();
        inp.input_cirlce(name,color,radius);
        System.out.println("Area of circle named "+inp.getName()+" of "+inp.getColor()
        +" color is of area "+radius*radius*3.14);
    }
}

/**method "input_circle" is taking input and returning .
 *
 */

    class input_cirlce {
    private String name;
    private String color;
    private int radius;

    void input_cirlce(String name, String color, int radius){
        this.name = name;
        this.color = color;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }
}
