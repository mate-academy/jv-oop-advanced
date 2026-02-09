package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Drawable {
    private double side;

    public Square(double side,String color) {
        super(color);
        if (side <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.side = side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            return;
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return this.getSide() * this.getSide();
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + this.area() + "sq. units, side: "
                + this.getSide() + " ,color: " + getColor());
    }
}
