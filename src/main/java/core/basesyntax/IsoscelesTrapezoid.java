package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double bottomBase;
    private double upperBase;
    private double lateralSide;
    private String name;

    public IsoscelesTrapezoid(double bottomBase, double upperBase,
                              double lateralSide, String name, String color) {
        super(color);
        this.bottomBase = bottomBase;
        this.upperBase = upperBase;
        this.lateralSide = lateralSide;
        this.name = name;
    }

    @Override
    public double calculateArea() {
        return ((upperBase + bottomBase) / 2)
                *
                Math.sqrt((lateralSide * lateralSide) - (Math.pow(bottomBase - upperBase, 2) / 4));
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName()
                + ", " + "area: " + calculateArea()
                + ", " + "bottomBase: " + getBottomBase()
                + ", " + "upperBase: " + getUpperBase()
                + ", " + "lateralSide: " + getLateralSide()
                + ", " + "color: " + getColor());
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public double getLateralSide() {
        return lateralSide;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
