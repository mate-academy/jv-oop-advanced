package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int lateralSide;
    private int height;

    public IsoscelesTrapezoid(String color, int firstBase, int secondBase, int lateralSide) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.lateralSide = lateralSide;
        this.height = (int) (Math.sqrt(Math.pow(lateralSide,2)-(Math.pow((firstBase- secondBase)/2,2))));
    }

    @Override
    public double calculateArea() {
        return 0.5 * (firstBase + secondBase) * height;
    }

    public void printProperties() {
        System.out.println("Figure: isosceles trapezoid," + " area: " + calculateArea() + " sq. units,"
                            + " firsBase: " + firstBase + " units," + " secondBase: " + secondBase
                            + " units," + " lateralSide: " + lateralSide + " units,"
                            + " height: " + height + " units," + " color: " + color);
    }
}
