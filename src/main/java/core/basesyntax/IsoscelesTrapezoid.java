package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int side;

    public IsoscelesTrapezoid(int firstBase, int secondBase, int side, String color) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.side = side;
    }

    @Override
    public double getArea() {
        double x = (double) Math.abs(secondBase - firstBase) / 2;
        double h = Math.sqrt(Math.pow(side, 2) - Math.pow(x, 2));
        return (firstBase + secondBase) * h / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, first base: " + firstBase + " units, second base: " + secondBase
                + " units, side: " + side + " units, color: " + getColor());
    }
}
