package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLength;
    private int secondLength;
    private int thirdLength;

    public IsoscelesTrapezoid(int firstLength, int secondLength, int thirdLength, String color) {
        this.firstLength = firstLength;
        this.secondLength = secondLength;
        this.thirdLength = thirdLength;
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return (double) (((firstLength + secondLength) / 2)
                * (Math.sqrt(Math.pow((double) thirdLength, 2))
                - (Math.pow(((double) firstLength - secondLength) / 2, 2))));
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: IsoscelesTrapezoid, area: " + getArea()
                        + "sq.units, firstLeg: " + firstLength
                        + " units, secondLeg: " + secondLength
                        + " units, thirdLeg: " + thirdLength
                        + " units, color: " + super.getColor()
        );
    }
}
