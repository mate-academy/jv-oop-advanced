package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(String color, int firstBase, int secondBase, int height) {
        super("trapezoid",color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public int getFirstBase() {
        return firstBase;
    }

    public void setSecondBase(int firstBase) {
        this.firstBase = firstBase;
    }

    public int getSecondBase() {
        return secondBase;
    }

    public void secondBase(int secondBase) {
        this.secondBase = secondBase;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + getName()
                + ", area: "
                + getArea() + " sq. units , firstBase length: "
                + getFirstBase() + " units, secondBase length: "
                + getSecondBase() + " units, height length: "
                + getHeight() + " units, color: "
                + getColor());
    }
}
