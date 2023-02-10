package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstSide;
    private final int secondSide;
    private final int height;
    private final FigureType figureType = FigureType.ISOSCELESTRAPESOID;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super(color);
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

    public FigureType getFigureType() {
        return figureType;
    }

    @Override
    public int getArea() {
        return (firstSide + secondSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureType()
                + ", area: " + getArea()
                + " sq.units, firstSide: " + getFirstSide()
                + " units, secondSide: " + getSecondSide()
                + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }
}
