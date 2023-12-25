package core.basesyntax;

public class Square extends Figure {
    private double side;
    private String name;

    public Square(double side, String name, String color) {
        super(color);
        this.side = side;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
