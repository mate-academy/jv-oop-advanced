package core.basesyntax;

public class Square extends Figure implements GetArea, Draw {
    private double side;
    private double area = side * side;

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double area() {
        return area;
    }

    @Override
    public void print() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + area() + " sq. units, " + "Side: " + side + ", Color: " + getColor());
    }
}
