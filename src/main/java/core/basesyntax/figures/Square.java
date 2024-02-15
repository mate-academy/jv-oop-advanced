package core.basesyntax.figures;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area:" + area() + "sq. units, side: "
                           + side + " units, color: " + color);
    }

    @Override
    public double area() {
        return side * side;
    }
}
