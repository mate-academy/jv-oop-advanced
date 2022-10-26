package core.basesyntax;

public class RightTriangle extends Figure {
    private static final int DIVIDER = 2;
    private int firstLeg;
    private int secondLeg;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / DIVIDER;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units, firstLeg: " + firstLeg + " secondLeg: " + secondLeg
                + " units, color: " + colorSupplier.getRandomColor().toLowerCase());
    }

    @Override
    public String getName() {
        return "right triangle";
    }
}

