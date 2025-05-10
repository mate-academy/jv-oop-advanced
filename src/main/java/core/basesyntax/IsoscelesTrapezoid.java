package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(String color, double upperSide, double bottomSide, double height) {
        super(color);
        this.upperSide = upperSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    public double getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(double upperSide) {
        this.upperSide = upperSide;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(double bottomSide) {
        this.bottomSide = bottomSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Isosceles trapezoid" + " Area : " + getArea()
                + " Upper side : " + getUpperSide()
                + " Bottom side : " + getBottomSide()
                + " Height : " + getHeight()
                + " Color : " + getColor());
    }

    @Override
    public double getArea() {
        return getHeight() / 2 * (getBottomSide() + getUpperSide());
    }

    @Override
    public String toString() {
        return "Figure : Isosceles trapezoid" + " Area : " + getArea()
                + " Upper side : " + getUpperSide()
                + " Bottom side : " + getBottomSide()
                + " Height : " + getHeight()
                + " Color : " + getColor();
    }
}
