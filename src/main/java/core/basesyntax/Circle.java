package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getS() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Circle { radius = " + this.radius + ", square = "
                            + getS() + ", color - " + getColor() + " }");
    }
}
