package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + String.format("%.2f", getArea())
                + " sq. units, side: " + side
                + " units, color: " + super.getColor().toLowerCase());
    }

    @Override
    public Double getArea() {
        return (double) side * side;
    }
}
