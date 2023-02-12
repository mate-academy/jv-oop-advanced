package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstSide;
    private final int secondSide;
    private final int height;
    private final TypeFigure name = TypeFigure.TRAPEZOID;

    public IsoscelesTrapezoid(Color color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    public TypeFigure getName() {
        return name;
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

    @Override
    public double calculateArea() {
        return ((firstSide + secondSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName().name()
                + " area: " + calculateArea() + " sq.units, firstSide: "
                + getFirstSide() + " secondSide: " + getSecondSide()
                + " height: " + getHeight() + " units, color: " + getColor());
    }
}
