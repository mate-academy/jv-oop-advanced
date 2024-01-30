package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
        setArea(calculateArea());
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName()
                + ", color: " + getColor() + ", area: "
                + getArea() + " sq. units, side: " + side + " units");
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
