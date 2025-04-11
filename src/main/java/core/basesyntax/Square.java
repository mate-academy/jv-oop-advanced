package core.basesyntax;

public class Square extends Figure {
    private double side;
    private String color;

    public Square(String color, double side) {
        super(color);
        getSide();
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + getSide()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }

    public String getColor() {
        return color;
    }
}
