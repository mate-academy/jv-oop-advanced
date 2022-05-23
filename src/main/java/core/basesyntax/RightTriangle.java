package core.basesyntax;

public class RightTriangle extends Figure {
    public static final int NUMBER_THREE = 3;
    public static final int NUMBER_FOUR = 4;
    private int side;

    public RightTriangle(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {

        return Math.sqrt(NUMBER_THREE) / NUMBER_FOUR * side * side;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rightTriangle, area: " + getArea()
                        + " sq.units, " + "side: " + side
                        + " units, color: " + super.getColor());
    }
}
