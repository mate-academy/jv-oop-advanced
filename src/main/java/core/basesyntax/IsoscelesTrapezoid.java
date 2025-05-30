package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {

    private int firstLeg;
    private int secondLeg;
    private int height;

    public IsoscelesTrapezoid(Color color, int firstLeg, int secondLeg, int height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + ((firstLeg + secondLeg) / 2) * height
                + " sq. units, legs: " + firstLeg + " units, " + secondLeg
                + " units, height " + height + " units, color: " + color);

    }
}
