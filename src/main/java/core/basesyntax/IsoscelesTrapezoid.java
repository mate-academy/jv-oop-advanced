package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculatable {
    private double upperSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(String name, String color, double area, double upperSide, double bottomSide, double height) {
        super(name, color, area);
        this.upperSide = upperSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "; " + "Area: " + area + "; " + "Upper side: " + upperSide +
                "Bottom side: " + bottomSide + "; " + "Height: " + height + "; " + "Color: " + color + ";");
    }

    @Override
    public double calculateArea() {
        return height / 2 * (upperSide + bottomSide);
    }
}
