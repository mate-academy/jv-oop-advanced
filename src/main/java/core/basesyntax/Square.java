package core.basesyntax;

public class Square extends Figure {
    private final int firstLeg;
    private final int secondLeg;
    private final int thirdLeg;
    private final int fourthLeg;

    public Square(int[] legs) {
        firstLeg = legs[0];
        secondLeg = legs[0];
        thirdLeg = legs[0];
        fourthLeg = legs[0];
        setColor(new ColorSupplier().getRandomColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setName(String name) {
        super.setName("square");
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq.units, side: " + firstLeg + " units," + " side: " + secondLeg + " units," + " side: " + thirdLeg + " units," + " side: " + fourthLeg + " units, " + "color: " + getColor());
    }
}