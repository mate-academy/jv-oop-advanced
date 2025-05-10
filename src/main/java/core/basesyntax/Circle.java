package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.setColor(color);
        this.setFigure("circle");
    }

    @Override
    public double countArea() {
        return Math.ceil(Math.PI * this.radius * this.radius * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: " + this.getFigure()
                + ", area: " + this.countArea()
                + " sq.units, radius: " + this.radius
                + " units, color: " + this.getColor());
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
