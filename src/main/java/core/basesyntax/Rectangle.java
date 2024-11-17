package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
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
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        String firstPart = "Figure: rectangle, area: " + calculateArea();
        String secondPart = "sq. units, first side: " + firstSide;
        String thirdPart= " units, second side: " + secondSide + " units, color: " + getColor();
        System.out.println(firstPart + secondPart + thirdPart);
    }
}
