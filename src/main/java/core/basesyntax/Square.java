package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void calculateArea() {
        this.setArea(side * side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass()
                + ", area: " + this.getArea() + " sq. units,"
                + " side: " + this.side + " units, "
                + "color: " + this.getColor());
    }
}
