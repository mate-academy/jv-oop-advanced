package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double highBase;
    private double lowBase;
    private double firstLeg;
    private double secondLeg;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(int highBase, int lowBase, int firstLeg, int secondLeg, Color color) {
        this.highBase = highBase;
        this.lowBase = lowBase;
        this.firstLeg = secondLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    public double getArea() {
        double height = Math.sqrt(firstLeg * firstLeg
                - Math.pow((secondLeg - highBase + lowBase) / 2, 2));
        return 0.5 * (highBase + lowBase) * height;
    }

    public void draw() {
        System.out.println("Figure: isoscelestrapezoid, " + "area: "
                + getArea() + " sq. units, highBase: "
                + highBase + " units, lowBase: " + lowBase + " units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + color);
    }
}
