package core.basesyntax;

public class Rectangle extends Figure {
    static final FigType type = FigType.Rectangle;
    private float sideA;
    private float sideB;

    public Rectangle(Color color, float sideA, float sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + type + ", area: " + getArea() + " sq.units, sideA: "
                + sideA + " units, sideB: " + sideB + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
