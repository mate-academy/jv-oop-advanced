package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super.setColor(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle was drawn");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "circle, area: " + this.getArea() + " sq. units, radius: "
                + this.radius + " units, color: " + super.getColor();
    }
}
