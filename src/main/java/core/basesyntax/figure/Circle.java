package core.basesyntax.figure;

public class Circle extends Figure {
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
        this.figureName = FigureName.Circle;
    }

    public Circle (double radius, Color color) {
        this.radius = radius;
        this.figureName = FigureName.Circle;
        super.color = color;
    }

    @Override
    public double getArea() {
        return ((int)(Math.PI * radius * radius) * 100)/100;

    }

    @Override
    public String draw() {
        return "Figure: " + figureName + ", "
                + "area: " + getArea() + " sq. units, "
                + "radius: " + radius + ", "
                + "color: " + color;
    }
}
