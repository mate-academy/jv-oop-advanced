package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double height;
    private double bottomBase;
    private double topBase;
    private String name;

    public IsoscelesTrapezoid(String color, double height, double bottomBase,
                              double topBase, String name) {
        super(color);
        this.height = height;
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.name = name;
    }

    public double getArea() {
        return Math.round((getBottomBase() + getTopBase()) / 2 * getHeight());
    }

    public double getTopBase() {
        return topBase;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public String draw() {
        String returnLine = "Shape: " + getName() + ", area: " + getArea()
                + " sq. units, top base length: " + getTopBase()
                + " units, bottom base length: " + getBottomBase()
                + " units, height length: " + getHeight()
                + ", color: " + getColor();
        return returnLine;
    }
}
