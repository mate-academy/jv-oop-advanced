package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public void drawInfo() {
        System.out.print("Figure: square, area: ");
        System.out.printf("%.1f", getArea());
        System.out.println(" sq.units, side: " + side + " units, color: " + getColor());
    }
}
