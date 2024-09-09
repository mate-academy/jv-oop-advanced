package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstBase;
    private final int secondBase;
    private final int lateralSide;
    private final double height;

    public IsoscelesTrapezoid(Color color, int firstBase, int secondBase, int lateralSide) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.lateralSide = lateralSide;
        this.height = (Math.sqrt(Math.pow(lateralSide, 2)
                        - (Math.pow((double) (firstBase - secondBase) / 2, 2))));
    }

    @Override
    public double calculateArea() {
        return 0.5 * (firstBase + secondBase) * height;
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid," + " area: " + calculateArea()
                            + " sq. units," + " firsBase: " + firstBase + " units,"
                            + " secondBase: " + secondBase + " units," + " lateralSide: "
                            + lateralSide + " units," + " height: " + height + " units,"
                            + " color: " + color);
    }
}
