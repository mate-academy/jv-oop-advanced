package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperSide;
    private double lowerSide;
    private double height;

    public IsoscelesTrapezoid(double upperSide, double lowerSide, double height) {
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((upperSide + lowerSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IsoscelesTrapezoid{");
        sb.append("upperSide=").append(upperSide);
        sb.append(", lowerSide=").append(lowerSide);
        sb.append(", height=").append(height);
        sb.append(", color=").append(getColor());
        sb.append('}');
        return sb.toString();
    }

    public double getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(double upperSide) {
        this.upperSide = upperSide;
    }

    public double getLowerSide() {
        return lowerSide;
    }

    public void setLowerSide(double lowerSide) {
        this.lowerSide = lowerSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
