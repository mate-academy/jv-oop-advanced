package core.basesyntax.figures;

public class Square extends Figure implements Drawable, AreaCalculator{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("-------------------------");
        System.out.println("This is a SQUARE:");
        System.out.println("[side]  [color]  [area]");
        System.out.println("  " + side + "  :: " + getColor() + " :: " + getArea());
        System.out.println("-------------------------");
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
