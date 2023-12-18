package core.basesyntax;

public class RightTriangle extends Figure {

    private double side;

    public RightTriangle(double side, String color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return (Math.pow(side, 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle, area: " + ((int) (getArea() * 100) / 100.0)
                + " sq. units, side: " + getSide()
                + ", color: " + getColor());
    }
}
