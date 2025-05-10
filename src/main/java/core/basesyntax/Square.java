package core.basesyntax;

public class Square extends Figure {
    private double length;

    public Square(String color, double length) {
        super(color);
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + String.format("%.2f", getArea())
                + " sq. cm, length: " + String.format("%.2f", length) + " cm, color: "
                + getColor());
    }
}
