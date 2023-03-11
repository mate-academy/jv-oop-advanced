package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int thirdLeg;
    private int fourthLeg;

    public IsoscelesTrapezoid(int[] legs) {
        firstLeg = legs[0];
        secondLeg = legs[1];
        thirdLeg = legs[2];
        fourthLeg = legs[3];
        setColor(new ColorSupplier().getRandomColor());
        setName("isoscelesTrapezoid");
        setArea(getArea());
    }

    @Override
    public double getArea() {
        double height = Math.sqrt(Math.pow(firstLeg, 2) - Math.pow((secondLeg + fourthLeg), 2) / 4.0);
        return ((fourthLeg + secondLeg) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq.units, side: " + firstLeg + " units," + " side: " + secondLeg + " units," + " side: " + thirdLeg + " units," + " side: " + fourthLeg + " units, " + "color: " + getColor());

    }
}
