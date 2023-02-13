package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double upperBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(String color, double upperBase, double lowerBase, double height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + Double.toString(getArea())
                + ", perimeter: " + Double.toString(getPerimeter())
                + ", upper base: " + Double.toString(upperBase)
                + ", lower base: " + Double.toString(lowerBase)
                + ", height: " + Double.toString(height)
                + ", color: " + color
        );
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) / 2 * height;
    }

    @Override
    public double getPerimeter() {
        double side = Math.sqrt(Math.pow(Math.abs(lowerBase - upperBase) / 2, 2) + height * height);
        return upperBase + lowerBase + side * 2;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(double upperBase) {
        if (upperBase > 0) {
            this.upperBase = upperBase;
        } else {
            throw new RuntimeException("Upper base may be more than 0!");
        }
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(double lowerBase) {
        if (lowerBase > 0) {
            this.lowerBase = lowerBase;
        } else {
            throw new RuntimeException("Lower base may be more than 0!");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new RuntimeException("Height may be more than 0!");
        }
    }
}
