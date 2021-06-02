package core.basesyntax;

public class RightTriange extends Figure {
    private double side;

    public RightTriange(String color, double side) {
        super.setColor(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure : right triangle, area: " + String.format("%.2f", getArea())
                + " sq.units, side: " + String.format("%.0f", getSide())
                + " units, color: " + getColor());
    }
}
