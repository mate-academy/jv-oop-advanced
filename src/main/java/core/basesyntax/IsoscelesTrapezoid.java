package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstSide;
    private final int secondSide;
    private final int height;
    private final TypeOfFigure type = TypeOfFigure.TRAPEZOID;

    public IsoscelesTrapezoid(Color color, int firstSide, int secondSide, int height) {
        super(color, TypeOfFigure.CIRCLE);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public int getHeight() {
        return height;
    }

    public TypeOfFigure getType() {
        return type;
    }

    @Override
    public double calculateArea() {
        return ((firstSide + secondSide) / 2.0) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getType().name()
                + ", area: " + calculateArea()
                + " sq.units, first side: " + getFirstSide()
                + " units, second side: " + getSecondSide()
                + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }
}
