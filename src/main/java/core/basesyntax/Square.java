package core.basesyntax;

public class Square implements Figure {
    private double side;
    private String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public double getSide() {
        return this.side;
    }

    public String getColor() {
        return this.color;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea()
                + " sq. units, side: " + side + " units, color: " + color);
    }
}
