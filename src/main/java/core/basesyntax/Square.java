package core.basesyntax;

public class Square extends Figure {
    static final  FigType type = FigType.Square;
    private float sideLength;

    public Square(Color color, float sideLength) {
        super(color);
        this.sideLength = sideLength;
    }
    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + type + ", area: " + getArea() + " sq.units, side:"
                + " " + sideLength + " units, color: " + getColor());
    }
}
