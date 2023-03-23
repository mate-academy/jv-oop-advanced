package core.basesyntax;

public class RightTriangle extends Figure {
    private static final String name = "rightTriangle";
    private int firstLeg;
    private double area;

    public RightTriangle(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    @Override
    public String getColor() {
        return new ColorSupplier().getRandomColor();
    }

    public String getName() {
        return name;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units, side: " + firstLeg + " units," + " side: " + firstLeg
                + " units," + " side: " + firstLeg + " units," + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * (firstLeg * firstLeg);
    }
}
