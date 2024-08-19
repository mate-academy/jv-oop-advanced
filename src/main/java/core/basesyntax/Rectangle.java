package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);

        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public void drawArea() {
        double area = this.firstSide * this.secondSide;

        System.out.println("Figure: rectangle, " + "area: " + area + " sq. units, first side: " + this.firstSide + " units, " +
                "second side: " + this.secondSide + " units, color: " + this.getColor());
    }
}
