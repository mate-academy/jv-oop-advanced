package core.basesyntax;

public class Circle extends RandomFigure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (radius * 2) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Loading a Circle \n" + "Area - " + getArea() + "\n"
                + "Color - " + color + "\n" + "Radius - " + radius);
    }
}
