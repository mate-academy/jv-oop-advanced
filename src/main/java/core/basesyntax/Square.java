package core.basesyntax;

public class Square extends Figure {
    private final double side;

    private String color() {
        return getColor();
    }

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(side,2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + area()
                + " units, side: " + side + " units, color: "
                + color());
    }
}
