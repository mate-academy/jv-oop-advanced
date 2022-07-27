package core.basesyntax;

public class Square extends Figure implements Calculable, Printable {
    private int side;
    private double area;

    public Square(String color, int side) {
        super(color);
        this.side = side;
        area = areaCalculation();
    }

    @Override
    public double areaCalculation() {
        return side * side;
    }

    @Override
    public void print() {
        System.out.println("Figure: square, area: " + this.area + " sq.units, side: "
                + this.side + " units, color: " + getColor());
    }
}
