package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int upperSide;
    private int lowerSide;

    IsoscelesTrapezoid(){
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLowerSide(int lowerSide) {
        this.lowerSide = lowerSide;
    }

    public void setUpperSide(int upperSide) {
        this.upperSide = upperSide;
    }

    @Override
    public double getArea() {
        return (upperSide + lowerSide) * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                            + " sq.units, upperSide: " + upperSide
                            + " units, lowerSide: " + lowerSide + " units, height: "
                            + height + " units, color: " + color);
    }
}
