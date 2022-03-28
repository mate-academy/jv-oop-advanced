package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Drawable {
    private double side;
    private String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public String getName() {
        return "square";
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + " area: "
                + area() + " sq.units, side: " + getSide()
                + " units, color: " + color());
    }

}
