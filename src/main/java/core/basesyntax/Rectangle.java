package core.basesyntax;

public class Rectangle extends Figure {
    private static final String name = "rectangle";
    private int firstLeg;
    private int secondLeg;
    private double area;

    public Rectangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return new ColorSupplier().getRandomColor();
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units, side: " + firstLeg + " units," + " side: " + secondLeg
                + " units," + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }
}
