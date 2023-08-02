package core.basesyntax;

public class RightTriangle extends Figure implements AreaFigure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.print("Figure: ");
        System.out.print("RightTriangle, ");
        System.out.print(" FirstLeg - " + firstLeg);
        System.out.print(", SecondLeg - " + secondLeg);
        System.out.print(", Area - " + (firstLeg * secondLeg * 0.5));
        System.out.print(", Color: " + getColor().toLowerCase() + "\n");
    }
}

