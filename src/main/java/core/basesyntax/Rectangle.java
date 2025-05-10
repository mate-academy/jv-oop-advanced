package core.basesyntax;

public class Rectangle extends Figure {
    public static final double MAX_FIRST_SIDE = 10;
    public static final double MAX_SECOND_SIDE = 10;
    private final double firstSide;
    private final double secondSide;
    private final TypeFigure name = TypeFigure.RECTANGLE;

    public Rectangle(Color color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public TypeFigure getName() {
        return name;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName().name() + " area: " + calculateArea()
                + " sq.units, firstSide: " + getFirstSide() + " secondSide: "
                + getSecondSide() + " units, color: " + getColor());
    }
}
