package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int foundationA;
    private int foundationB;

    public IsoscelesTrapezoid(String color, int height, int foundationA, int foundationB) {
        super(color);
        this.height = height;
        this.foundationA = foundationA;
        this.foundationB = foundationB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int rib) {
        this.height = height;
    }

    public double getFoundationA() {
        return foundationA;
    }

    public void setFoundationA(int foundationA) {
        this.foundationA = foundationA;
    }

    public double getFoundationB() {
        return foundationB;
    }

    public void setFoundationB(int foundationB) {
        this.foundationB = foundationB;
    }

    @Override
    public double getArea() {
        return height * ((foundationA + foundationB) * 0.5);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + " square: "
                + getArea() + " sq. units, color " + getColor()
                + " height " + height
                + " foundationA " + foundationA
                + " foundationB " + foundationB);
    }
}
