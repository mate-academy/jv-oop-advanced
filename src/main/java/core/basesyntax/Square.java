package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("square,"
                + " area: " + getArea()
                + " sq.units,"
                + " side: "
                + side + " sq.units, "
                + "color: " + getColor());
    }

}
