package core.basesyntax;

public class RightTriangle extends Figure {
    private double longerLeg;
    private double shorterLeg;

    public RightTriangle(Color color, double longerLeg, double shorterLeg) {
        super(color);
        this.longerLeg = longerLeg;
        this.shorterLeg = shorterLeg;
    }

    @Override
    public double getArea() {
        return longerLeg * shorterLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle");
        System.out.println("Area: " + getArea() + " sq. units");
        System.out.println("LongerLeg: " + longerLeg + " units");
        System.out.println("ShorterLeg: " + shorterLeg + " units");
        System.out.println("Color: " + color);
        System.out.println(" ");
    }
}
