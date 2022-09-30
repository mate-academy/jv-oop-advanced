package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public Figure drawState() {
        System.out.println("Name = " + getName() + " Area = " + area()
                + " Radius = " + radius + " Color = " + getColor());
        return null;
    }
}
