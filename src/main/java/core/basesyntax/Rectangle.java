package core.basesyntax;

public class Rectangle extends Figure {
    private double side1;
    private double side2;

    public Rectangle(String color, double side1, double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double obtaining() {
        return side1 * side2;
    }

    @Override
    public void print() {
        System.out.println("Figure: Rectangle , area: " + obtaining()
                + " sq. units,  firstLeg: " + side1
                + " units, secondLeg: " + side2
                + " units, color: " + getColor());
    }
}
