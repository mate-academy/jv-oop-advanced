package core.basesyntax;

public class Square extends Figure {
    private double side = 0;

    Square() {
        super("square", Color.WHITE);
    }

    Square(Color color) {
        super("square", color);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        } else {
            System.out.println("Square side can't be negative or equal to zero!");
        }
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        String info = "Figure: " + getName();
        info += ", area: " + area();
        info += " sq.units, side: " + side;
        info += " units, color: " + getColor().name();
        System.out.println(info);
    }
}
