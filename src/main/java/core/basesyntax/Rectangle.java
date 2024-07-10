package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        super();
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    @Override
    public double area() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle," + "area: " + area() + "sq. units," + "first side: " + firstSide + " units , second side: " + secondSide + "units, " + "color: " + color);
    }
}
