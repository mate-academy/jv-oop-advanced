package core.basesyntax.figures;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: "
                + "square, area: " +  (double) ((long) (getArea() * 10)) / 10 + " sq. units,"
                + " side: " + side + " units,"
                + " color: "  + getColor()
        );
    }
}
