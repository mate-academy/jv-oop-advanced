package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double areaOfFigure() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure-> " + getClass().getSimpleName()
                            + "\nArea of figure-> " + areaOfFigure()
                            + "\nColor-> " + getColor()
                            + "\nRadius-> " + getRadius());
    }
}
