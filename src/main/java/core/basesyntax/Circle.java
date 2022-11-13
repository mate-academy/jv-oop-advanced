package core.basesyntax;

public class Circle extends ColorFigure implements FigureInfo, Figure {//s = PI*r*r;
    private double radius;
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + getArea() + "sq.units, " + "radius: " + radius + "color: " + color);
    }
}
