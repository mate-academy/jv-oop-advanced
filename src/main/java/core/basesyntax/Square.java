package core.basesyntax;

public class Square extends Figure {
    private String name = "square";
    private double side;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Shape: " + name + ", area: " + String.format("%.1f", getArea())
                + " sq. units, side: " + String.format("%.1f", getSide())
                + " units, color: " + color);
    }
}
