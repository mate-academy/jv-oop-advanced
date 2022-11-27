package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;

    @Override
    public double area() {
        return ((topSide + bottomSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles trapezoid, "
                + "area: " + area() + " sq.units, "
                + "top side: " + this.topSide + " units, "
                + "bottom side: " + this.bottomSide + " units, "
                + "height: " + this.height + " units, "
                + "color: " + getColor());
    }

    public double getTopSide() {
        return topSide;
    }

    public void setTopSide(double topSide) {
        this.topSide = topSide;
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
}
