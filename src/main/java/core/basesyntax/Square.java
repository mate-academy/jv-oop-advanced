package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area:" + this.area() + "sq. units, side: "
                           + this.side + " units, color: " + this.color);
    }

    @Override
    public double area() {
        return side * side;
    }
}
