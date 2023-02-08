package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    Rectangle(String color) {
        super(color);
    }

    Rectangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.setName("Rectangle");
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setArea(calculateArea());
    }

    @Override
    void drawFigure() {
        String text = "Figure: " + getName() + ", area: " + getArea()
                + " sq.units, firstLeg: " + getFirstLeg()
                + " units, secondLeg: " + getSecondLeg()
                + " units, color: " + getColor();
        System.out.println(text);
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg;
    }
}
