package core.basesyntax;

public class Rectangle extends Figure implements Drawable {
    private double firstSide;
    private double secondSide;
    private Color color;

    public Rectangle(double firstSide, double secondSide, Color color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.color = color;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + ", first side: " + firstSide + ", second side: " + secondSide + ", color: " + color.name());
    }
}
