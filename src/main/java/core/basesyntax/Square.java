package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (double) Math.round((side * side) * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + this.calculateArea()
                + " sq. units, side: "
                + this.side
                + " units, color : "
                + super.getColor());
    }
}
