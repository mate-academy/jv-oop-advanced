package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Circle, " + "area: " + this.getArea() + " sq. units, radius: "
                            + this.radius + " units, color: " + super.getColor().name());
    }
}
