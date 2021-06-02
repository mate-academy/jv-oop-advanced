package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(String name, String color, double upperSide,
                              double bottomSide, double height) {
        super(name, color);
        this.upperSide = upperSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + "; " + "Area: "
                + calculateArea() + "; " + "Upper side: " + upperSide
                + "Bottom side: " + bottomSide + "; " + "Height: " + height
                + "; " + "Color: " + getColor() + ";");
    }

    @Override
    public double calculateArea() {
        return height / 2 * (upperSide + bottomSide);
    }
}
