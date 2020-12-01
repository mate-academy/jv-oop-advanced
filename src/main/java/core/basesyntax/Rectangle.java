package core.basesyntax;

import java.util.Random;

public class Rectangle extends Shape {

    private Random rand;
    private StringBuilder sb = new StringBuilder();
    private int length;
    private int width;


    public Rectangle (String name) {
        super(name);
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
    public void draw() {
        System.out.println("****************" +
                           "*" +          "*" +
                           "*" +          "*" +
                           "*" +          "*" +
                           "***************");
    }

    public String info() {
        return sb.append("Shape: ").append(super.getName()+ ", ").append("area: " + this.calculateArea() + " sq.units ")
                .append("diagonal: " + this.getDiagonal() + " units ")
                .append("color: " + super.getColor()).toString();
    }

    public double getDiagonal() {
        return (int)(Math.sqrt((width * width) + (length * length)));
    }

}
