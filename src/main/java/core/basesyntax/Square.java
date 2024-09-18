package core.basesyntax;

public class Square extends Figure {

    public Square(Colors color, double side) {
        super(color, side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: "
                + getArea() + "sq. units, side "
                + getSide() + " units, color: "
                + getColor().name());
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }
}
