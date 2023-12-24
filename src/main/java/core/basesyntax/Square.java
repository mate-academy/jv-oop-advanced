package core.basesyntax;

public class Square extends Figure {
    private double side;
    private String name;
    private String color;

    public Square() {
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName()
                + ", " + "area: " + calculateArea()
                + ", " + "side: " + getSide()
                + ", " + "color: " + getColor());
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
