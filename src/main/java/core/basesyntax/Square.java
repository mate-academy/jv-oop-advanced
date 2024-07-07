package core.basesyntax;

public class Square extends Figure implements Drawable, AreaCalculator {
    private double side;

    public Square(double side, Color color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }


    public void setSide(int side) {
        this.side = side;
    }


    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public void draw() {
        System.out.println(String.format("Square with area: %.2f sq. units, side: %.2f units, "
                + "color: %s", getArea(), getSide(), getColor()));
    }
}
