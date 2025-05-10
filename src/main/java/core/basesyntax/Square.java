package core.basesyntax;

public class Square extends Figure {
    public static final double MAX_SIDE = 100;
    private double side;

    public Square() {
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + calculateArea()
                + ", side: " + side
                + ", color: " + color);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side > 0 && side < MAX_SIDE) {
            this.side = side;
        } else {
            throw new RuntimeException("Side may be more than 0!");
        }
    }
}
