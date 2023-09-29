package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottomOne;
    private int bottomTwo;
    private int height;

    public IsoscelesTrapezoid(Color color, int bottomOne, int bottomTwo, int height) {
        super(color);
        this.bottomOne = bottomOne;
        this.bottomTwo = bottomTwo;
        this.height = height;
    }

    @Override
    public double findArea() {
        return (double) (bottomOne + bottomTwo) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println(("Figure: isoscelesTrapezoid, area: " + findArea()
                + " sq.units, bottom 1: " + bottomOne + " sq.units, bottom 2: "
                + bottomTwo + " sq.units, height: " + height
                + " units, color: " + getColor()));
    }
}
