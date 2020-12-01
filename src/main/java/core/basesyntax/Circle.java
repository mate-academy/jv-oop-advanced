package core.basesyntax;

public class Circle extends Figure implements HasDiagonal, Drawing {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void infoAboutFigure() {
        System.out.printf("Shape: circle, area: %.3f sq. units, radius: %s units,"
                + " diagonal: %s units, color: %s", getArea(), radius, getDiagonal(), getColor());
        System.out.println();
    }

    @Override
    public void drawFigure() {
        System.out.println(" You draw " + getColor() + " circle!");
    }

    @Override
    public double getDiagonal() {
        return radius * 2;
    }
}
