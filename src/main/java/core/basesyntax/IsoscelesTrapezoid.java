package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(double firstBase, double secondBase, double height, String color) {
        this.secondBase = secondBase;
        this.firstBase = firstBase;
        this.height = height;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return ((firstBase + secondBase) / 2 * height);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure : IsoscelesTrapezoid, area: "
                        + (Math.round(calculateArea() * 100) / 100d) + " units, "
                        + ", firstBase: " + firstBase + " units, "
                        + "secondBase: " + secondBase + " units, "
                        + "height: " + height + " units, "
                        + "color: " + color);
    }
}
