package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM = 5;
    private static final int RADIUS_RANDOM = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int inde = random.nextInt(FigureEnum.values().length);
        FigureEnum figureEnum = FigureEnum.values()[inde];
        Color color = colorSupplier.getRandomColor();
        int sidr = random.nextInt(MAX_RANDOM) + 1;
        switch (figureEnum) {
            case CIRCLE:
                return getRandomCircle();
            case ISOSCELESTRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            case RESTANGLE:
                return getRandomRectangle();
            case RIGHTTRIANGLE:
                return getRandomRightTriangle();
            case SQUARE:
                return getRandomSquare();
            default:
                return null;
        }
    }

    public Figure getRandomCircle() {
        Color color = colorSupplier.getRandomColor();
        int sidr = random.nextInt(MAX_RANDOM) + 1;
        return new Circle(color.name(), sidr);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        Color color = colorSupplier.getRandomColor();
        int sidr = random.nextInt(MAX_RANDOM) + 1;
        return new IsoscelesTrapezoid(color.name(), sidr, sidr + 3, sidr);
    }

    public Figure getRandomRectangle() {
        Color color = colorSupplier.getRandomColor();
        int sidr = random.nextInt(MAX_RANDOM) + 1;
        return new Rectangle(color.name(), sidr, sidr + 2);
    }

    public Figure getRandomRightTriangle() {
        Color color = colorSupplier.getRandomColor();
        int sidr = random.nextInt(MAX_RANDOM) + 1;
        return new RightTriangle(color.name(), sidr, sidr + 2);
    }

    public Figure getRandomSquare() {
        Color color = colorSupplier.getRandomColor();
        int sidr = random.nextInt(MAX_RANDOM) + 1;
        return new Square(color.name(), sidr);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), RADIUS_RANDOM);
    }
}
