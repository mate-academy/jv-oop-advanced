package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getS() {
        return 3.14 * Math.pow(this.radius, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Коло { радіус = " + this.radius + ", площа = "
                            + getS() + ", колір - " + getColor() + " }");
    }
}
