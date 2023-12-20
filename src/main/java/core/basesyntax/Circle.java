package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.setFigureName(FigureName.Circle);
    }

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.setFigureName(FigureName.Circle);
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return ((int)(Math.PI * radius * radius) * 100) / 100;
    }

    @Override
    public String draw() {
        return "Figure: " + this.getFigureName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "radius: " + radius + ", "
                + "color: " + this.getColor();
    }
}
