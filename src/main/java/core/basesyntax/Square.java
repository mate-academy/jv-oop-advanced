package core.basesyntax;

public class Square extends Figure implements Drawing {
    private double side;

    public Square(String name, double area, double side, String color) {
        super(name, area, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", "
                + "area: " + getArea() + ", " + "side: "
                + getSide() + ", " + "color: " + getColor());
    }
}
