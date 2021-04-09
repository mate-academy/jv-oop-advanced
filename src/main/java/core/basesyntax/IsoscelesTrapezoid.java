package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstLeg;
    private final int secondLeg;
    private final int height;

    public IsoscelesTrapezoid(String figureProperty, String color, int firstLeg,
                              int secondLeg, int height) {
        super(figureProperty, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + getArea() + " square units, firstLeg: " + getFirstLeg()
                + " units, secondLeg: " + getSecondLeg() + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (firstLeg + secondLeg) * height / 2.0;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public int getHeight() {
        return height;
    }
}
