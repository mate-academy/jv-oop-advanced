package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double bottomBase;
    private double upperBase;
    private double lateralSide;
    private String name;
    private String color;

    public IsoscelesTrapezoid() {
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

    public void setBottomBase(double bottomBase) {
        this.bottomBase = bottomBase;
    }

    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }

    public void setLateralSide(double lateralSide) {
        this.lateralSide = lateralSide;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
