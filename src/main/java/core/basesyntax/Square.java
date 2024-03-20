package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.round(side * side * 1.0);
    }

    @Override
    public void draw() {
        String result = "Figure: square, area: " + this.getArea()
                + " sq. units, side: "
                + side + " units, color: " + getColor().toLowerCase() + "\n";
        System.out.printf(result);
    }
}
