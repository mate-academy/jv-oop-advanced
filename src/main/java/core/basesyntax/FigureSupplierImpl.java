package core.basesyntax;

import java.util.Random;

public class FigureSupplierImpl implements FigureSupplier {
    private static final int DEFOULT_VALUE = 10;
    private static final int MAX_VALUE = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier;

    public FigureSupplierImpl(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    @Override
    public Figure getRandomFigure() {
        int indexF = random.nextInt(FigureNames.values().length);
        FigureNames figure = FigureNames.values()[indexF];
        switch (figure) {
            case CIRCLE:
                return getCircle();
            case SQUARE:
                return getSquare();
            case RECTANGLE:
                return getRectangle();
            case RIGHT_TRIANGLE:
                return getRightTriangle();
            case ISOSCELAS_TRAPEZOID:
                return getIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    @Override
    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(),DEFOULT_VALUE);
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + 1,
                random.nextInt(MAX_VALUE) + 1, random.nextInt(MAX_VALUE) + 1);
    }

    private Figure getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),random.nextInt(MAX_VALUE) + 1,
                random.nextInt(MAX_VALUE) + 1);
    }

    private Figure getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + 1,
                random.nextInt(MAX_VALUE) + 1);
    }

    private Figure getSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + 1);
    }

    private Figure getCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt() + 1);
    }

}
