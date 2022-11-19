package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String drawFigure(Circle circle) {
        return "Figure: " + circle.getName() + ", area: " + circle.getArea()
                + " sq.units, radius: " + circle.getRadius() + " units, color: "
                + circle.getColor();
    }

}
