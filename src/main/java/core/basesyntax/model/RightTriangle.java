package core.basesyntax.model;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getBase() {
        return firstLeg;
    }

    public void setBase(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getHeight() {
        return secondLeg;
    }

    public void setHeight(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area: " + getArea() + " units"
                + ", height: " + secondLeg + " units"
                + ", base: " + firstLeg + " units"
                + ", color: " + getColor());
    }
}
