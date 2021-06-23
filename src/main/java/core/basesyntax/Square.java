package core.basesyntax;

public class Square extends Figure {
    private String color;
    private double side;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public String getName() {
        return "Square";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return this.side * this.side;
    }

    @Override
    public String drawInfo() {
        return ("Figure: " + getName() + ", " + "area: " + area() + " sq.units, "
                + "side: " + getSide() + " units, " + "color: " + getColor());
    }
}
