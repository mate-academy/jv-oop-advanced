package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Square" + "color: " + getColor()
                + " side " + String.format("%.2f", side)
                + " area: " + String.format("%.2f", getArea()) + '}');
    }
}
