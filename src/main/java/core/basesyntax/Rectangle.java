package core.basesyntax;

public class Rectangle extends Default {
    private double side;
    private double firstLeg;
    private double secondLeg;

    public Rectangle(String color, double side, double firstLeg, double secondLeg) {
        super(color);
        this.side = side;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getProperty() {
        return firstLeg * secondLeg;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: area: " + Math.round(getArea())
                + " Property: " + Math.round(getProperty())
                + " Color: " + getColor()
                + " firstLeg: " + Math.round(firstLeg)
                + " secondLeg: " + Math.round(secondLeg));
    }
}
