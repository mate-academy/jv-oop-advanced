package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double calculateArea() {
        return side * side;
    }

    @Override
    public void drawable() {
        System.out.println("Figure: Square, side " + getSide() + " units, area: "
                + calculateArea() + "sq. units, color " + getColor());
    }
}
