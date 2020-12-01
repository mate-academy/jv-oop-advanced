package core.basesyntax;

import java.util.Random;

public class Rectangle extends Shape {

    private Random rand;
    private int length;
    private int width;


    public Rectangle (String name, String color){
        super(name,color);
        rand = new Random();
        this.length = rand.nextInt(15);
        this.width = rand.nextInt(15);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return (length + width) * 2;
    }

    @Override
    public void draw() {}

    public String info() {
        return null;
    }

}
