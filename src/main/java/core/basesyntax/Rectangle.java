package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private String color;

    public Rectangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
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

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure" + ": " + getClass().getSimpleName() + ", area: " + getArea()
                + " sq. units, firstLeg: " + getFirstLeg() + " units, secondLeg: " + getSecondLeg()
                + " units, color: " + getColor());
    }
}
