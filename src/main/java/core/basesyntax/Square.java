package core.basesyntax;

public class Square extends Figure implements Calculable, Drawable {
    private int side;
    private double area;

    public Square(String color, int side) {
        super(color);
        this.side = side;
        this.area = areaCalculation();
    }

    @Override
    public double areaCalculation() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + this.area + " sq.units, side: "
                + this.side + " units, color: " + getColor());
    }
}
