package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(Color color, int firstBase, int secondBase, int height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, firstBase: " + firstBase + " units,"
                + " secondBase: " + secondBase + " units,"
                + " height: " + height + " units,"
                + " color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return ((firstBase + secondBase) / 2.0) * height;
    }
}
