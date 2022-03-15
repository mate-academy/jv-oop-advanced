package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstBase;
    private final int secondBase;
    private final int heigth;

    public IsoscelesTrapezoid(int firstBase, int secondBase, int heigth, String color) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.heigth = heigth;
    }

    public int getFirstBase() {
        return firstBase;
    }

    public int getSecondBase() {
        return secondBase;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    public double getArea() {
        return (((double) firstBase + (double) secondBase) / 2) * heigth;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + "sq.units , Base 1: " + getFirstBase()
                + " units Base 2: " + getSecondBase() + " units, color: " + getColor());
    }
}
