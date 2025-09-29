package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final double firstLeg;
    private final double secondLeg;
    private final double height;

    public IsoscelesTrapezoid(String randomColor, double randomBaseA,
                              double randomBaseB, double randomHeight) {
        super(randomColor);
        this.firstLeg = randomBaseA;
        this.secondLeg = randomBaseB;
        this.height = randomHeight;
    }

    @Override
    public double getArea() {
        return (firstLeg + secondLeg) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
