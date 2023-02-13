package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_PARAMETER = 10.0;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random randomParameter = new Random();

    public Figure getRandomFigure() {
        int randomIndex = randomParameter.nextInt(FigureName.values().length);
        switch (FigureName.values()[randomIndex]) {
            case SQUARE:
                return getRandomSquare();

            case CIRCLE:
                return getRandomCircle();

            case RECTANGLE:
                return getRandomRectangle();

            case RIGHT_TRIANGLE:
                return getRandomRightTriangle();

            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                getRandomParameter()
        );
    }

    public Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                getRandomParameter());
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomParameter(),
                getRandomParameter()
        );
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomParameter(),
                getRandomParameter()
        );
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomParameter(),
                getRandomParameter(),
                getRandomParameter()
        );
    }

    public double getRandomParameter() {
        return 4.0 * randomParameter.nextDouble() + 1.0;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_PARAMETER);
    }
}

