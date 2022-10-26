package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units, firstSide: " + firstSide + " secondSide: " + secondSide
                + " units, color: " + colorSupplier.getRandomColor().toLowerCase());
    }

    @Override

    public String getName() {
        return "rectangle";
    }
}
