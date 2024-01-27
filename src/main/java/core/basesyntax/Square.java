package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("This is " + super.getColor().toLowerCase() + " square "
                + "with side of " + side + " and area of " + getArea());
    }
}
