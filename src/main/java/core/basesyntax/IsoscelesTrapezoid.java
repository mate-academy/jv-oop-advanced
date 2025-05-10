package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideTop;
    private double sideBottom;
    private double side;

    public IsoscelesTrapezoid(String color, double sideTop, double sideBottom, double side) {
        super(color);
        this.sideTop = sideTop;
        this.sideBottom = sideBottom;
        this.side = side;
    }

    public double getSideTop() {
        return sideTop;
    }

    public double getSideBottom() {
        return sideBottom;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSideA(double sideTop) {
        this.sideTop = sideTop;
    }

    public void setSideB(double sideBottom) {
        this.sideBottom = sideBottom;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Tarapezoid, area: "
                + getArea() + " sq.units, sideTop: "
                + getSideTop() + " sideBottom: " + getSideBottom()
                + " sq.units, side right and Left : "
                + getSide() + " sq.units Color: " + getColor());
    }

    @Override
    public double getArea() {
        return (sideTop + sideBottom) / 2
                * Math.sqrt(side * side - Math.pow((Math.abs(sideBottom - sideTop)) / 2, 2));
    }
}
