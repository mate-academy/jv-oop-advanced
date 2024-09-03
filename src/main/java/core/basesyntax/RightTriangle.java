package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;
    private final int hypotenuse;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.hypotenuse = (int) (Math.sqrt(Math.pow(firstLeg,2))
                               + Math.sqrt(Math.pow(secondLeg,2)));
    }

    @Override
    public double area() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle" + " area: " + area() + " sq. units"
                            + " firsLeg: " + firstLeg + " units" + " second leg: " + secondLeg
                            + " units" + " hypotenuse: " + hypotenuse
                            + " units" + " color: " + color);
    }
}
