package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        this.type = "Right Triangle";
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("\n=================\ntype: "
                + this.type
                + "\ncolor: "
                + this.color
                + "\nfirstLeg: "
                + this.firstLeg
                + "\nsecondLeg: "
                + this.secondLeg
                + "\narea: "
                + this.getArea());
    }
}
