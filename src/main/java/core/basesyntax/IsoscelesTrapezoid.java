package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double smallParallel;
    private double bigParallel;
    private double height;

    public IsoscelesTrapezoid(String color, double smallParallel,
                              double bigParallel, double height) {
        super(color);
        this.smallParallel = smallParallel;
        this.bigParallel = bigParallel;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: "
                + getArea()
                + " sq. units, small parallel: "
                + smallParallel
                + " units, big parallel parallel: "
                + bigParallel
                + " units, height: "
                + height
                + " units, color: "
                + getColor();
    }

    public double getSmallParallel() {
        return smallParallel;
    }

    public void setSmallParallel(double smallParallel) {
        this.smallParallel = smallParallel;
    }

    public double getBigParallel() {
        return bigParallel;
    }

    public void setBigParallel(double bigParallel) {
        this.bigParallel = bigParallel;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles Trapezoid is drawing");
    }

    @Override
    public double getArea() {
        return ((smallParallel + bigParallel) / 2) * height;
    }
}
