package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    private double firstSide;
    private double secondSide;

    public Rectangle(String name, String color, double firstSide, double secondSide) {
        super(name, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "; " + "Area: " + calculateArea() + "; " + "First side: " + firstSide + "; " +
                "Second side: " + secondSide + "; " + "Color: " + color + ";");
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }
}
