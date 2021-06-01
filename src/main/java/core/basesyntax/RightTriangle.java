package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculatable {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String name, String color, double area, double firstLeg, double secondLeg) {
        super(name, color, area);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "; " + "Area: " + area + "; " + "Leg: " + firstLeg +
                "Leg: " + secondLeg + "; " + "Color: " + color + ";");
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }
}
