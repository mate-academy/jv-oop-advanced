package core.basesyntax;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int thirdLeg;
    private int fourthLeg;

    public Rectangle(int[] legs) {
        firstLeg = legs[0];
        secondLeg = legs[1];
        thirdLeg = legs[2];
        fourthLeg = legs[3];
        setColor(new ColorSupplier().getRandomColor());
        setName("rectangle");
        setArea(getArea());
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units, side: " + firstLeg + " units," + " side: " + secondLeg
                + " units," + " side: " + thirdLeg + " units," + " side: " + fourthLeg
                + " units, " + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }
}
