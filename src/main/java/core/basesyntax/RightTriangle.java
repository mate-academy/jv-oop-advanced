package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int thirdLeg;

    public RightTriangle(int[] legs) {
        firstLeg = legs[0];
        secondLeg = legs[1];
        thirdLeg = legs[2];
        setArea(getArea());
        setColor(new ColorSupplier().getRandomColor());
        setName("rightTriangle");
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units, side: " + firstLeg + " units," + " side: " + secondLeg
                + " units," + " side: " + thirdLeg + " units," + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * (firstLeg * thirdLeg);
    }
}
