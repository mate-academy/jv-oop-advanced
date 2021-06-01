package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculatable {
    private double firstSide;
    private double secondSide;

    public Rectangle(String name, String color, double area, double firstSide, double secondSide) {
        super(name, color, area);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "; " + "Area: " + area + "; " + "First side: " + firstSide + "; " +
                "Second side: " + secondSide + "; " + "Color: " + color + ";");
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }
}
