package core.basesyntax;

public class Square extends Figure {
    private double firstLeg;
    private double secondLeg;
    private String color;

    public Square(double firstLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        secondLeg = firstLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure" + ": " + getClass().getSimpleName() + ", area: " + getArea()
                + " sq. units, firstLeg: " + getFirstLeg() + " units, secondLeg: " + getSecondLeg()
                + " units, color: " + getColor());
    }
}
