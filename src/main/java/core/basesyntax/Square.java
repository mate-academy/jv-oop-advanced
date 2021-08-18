package core.basesyntax;

public class Square extends Figure implements AreaCalculator, InfoFigure {
    private final String name = "square";
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println(this.name + ", area: "
                + getArea() + " sq.units, "
                + this.side + " units, "
                + getColor());
    }
}
