package core.basesyntax;

import java.util.Random;

public class Circle  extends Shape {

    Random rand;
    private StringBuilder sb = new StringBuilder();
    private double roundness; // Окружность

    public Circle(String name, String color){
        super(name, color);
        rand = new Random();
        this.roundness = rand.nextInt(20);
    }

    @Override
    public double calculateArea() {
        return radius() * Math.PI;
    }

    @Override
    public double perimeter() {
        return radius() * 2 * Math.PI;
    }

    @Override
    public void draw() {
    }

    @Override
    public String info() {
        return sb.append("Shape: ").append(super.getName()+ ", ").append("area: " + this.calculateArea() + " sq.units")
                .append("radius: " + this.radius() + " units ")
                .append("color: " + super.getColor()).toString();
    }

    public double radius(){
        return roundness / (2 * Math.PI);
    }
}
