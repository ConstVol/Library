/**
 * Created by Андрей on 08.09.2016.
 */
public class Shape {

    public static void main(String[] args) {

        Shape shape = new Shape();
        Square square = new Square();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();


        square.draw();
        circle.draw();
        triangle.draw();
    }


    public void draw(){


    }
}

class Square extends Shape{

    public void draw(){

        System.out.println("I'm a Square!");
    }
}

class Circle extends Shape{

    public void draw(){

        System.out.println("I'm a Circle!");
    }
}
class Triangle extends Shape{

    public void draw(){

        System.out.println("I'm a Triangle!");
    }
}