package core.basesyntax;

public class Rectangle extends Figure {
    private double longSide;
    private double shortSide;

    public Rectangle(String color, double longSide, double shortSide) {
        super(color);
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    @Override
    public double area() {
        return longSide * shortSide;
    }

    @Override
    public void print() {
        System.out.println("Rectangle color: " + getColor()
                          + " first side " + longSide
                          + " second side " + shortSide
                          + " area " + area());
    }
}
