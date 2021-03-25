package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        setColor(color);
        setFigureName("circle");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getFigureName() + ", area: " + getArea() + " sq. units"
                + ", radius: " + radius + " units, color: " + getColor();
    }

    @Override
    public Figure getRandomFigure() {
        return new Circle((int)(Math.random() * 100), ColorSupplier.randomColor());
    }
}
