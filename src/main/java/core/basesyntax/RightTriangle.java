package core.basesyntax;

public class RightTriangle extends Figure {
    private final String name = "Rigth Triangle";
    private int side;

    public RightTriangle(Colors colors, int side) {
        super(colors);
        this.side = side;
    }

    public String getName() {
        return name;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * getSide() * getSide() / 4;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea() + " sq. units, side:  " + getSide()
                + " units, color: " + getColor());
    }
}
