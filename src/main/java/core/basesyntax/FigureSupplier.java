package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier;
    private Random random;

    public FigureSupplier() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }

    public Figure getRandomFigure() {
        Figure figure;
        FigureEnum figureEnum = FigureEnum.values()[random.nextInt(FigureEnum.values().length)];

        switch (figureEnum) {
            case CIRCLE:
                figure = createCircle();
                break;

            case SQUARE:
                figure = createSquare();
                break;

            case RECTANGLE:
                figure = createRectangle();
                break;

            case RIGHT_TRIANGLE:
                figure = createRightTriangle();
                break;

            case ISOSCELES_TRAPEZOID:
                figure = createIsoscelesTrapezoid();
                break;

            default:
                figure = null;
                break;
        }
        return figure;
    }

    private Figure createCircle() {
        return new Circle(getRandomInt(), getRandomColor());
    }

    private Figure createSquare() {
        return new Square(getRandomInt(), getRandomColor());
    }

    private Figure createRectangle() {
        return new Rectangle(getRandomInt(), getRandomInt(), getRandomColor());
    }

    private Figure createRightTriangle() {
        return new RightTriangle(getRandomInt(), getRandomColor());
    }

    private Figure createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandomInt(),
                getRandomInt(),
                getRandomInt(),
                getRandomColor());
    }

    private int getRandomInt() {
        return random.nextInt(15) + 2;
    }

    private String getRandomColor() {
        return colorSupplier.getRandomColor();
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
