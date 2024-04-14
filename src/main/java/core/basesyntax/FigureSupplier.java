package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10.0;
    private static final int NUMBER_OF_FIGURES = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier(this.random);

    public Figure getRandomFigure() {
        int figureOption = random.nextInt(NUMBER_OF_FIGURES);
        Figure figure = new Figure();
        switch (figureOption) {
            case 0:
                figure = getRandomSquare();
                break;
            case 1:
                figure = getRandomRectangle();
                break;
            case 2:
                figure = getRandomRightTriangle();
                break;
            case 3:
                figure = getRandomCircle();
                break;
            case 4:
                figure = getRandomIsoscelesTrapezoid();
                break;
            default:
                break;
        }

        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }

    public Square getRandomSquare() {
        return new Square(this.colorSupplier.getRandomColor(), random.nextDouble());
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(this.colorSupplier.getRandomColor(), random.nextDouble(),
                random.nextDouble());
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(this.colorSupplier.getRandomColor(), random.nextDouble(),
                random.nextDouble());
    }

    public Circle getRandomCircle() {
        return new Circle(this.colorSupplier.getRandomColor(), random.nextDouble());
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(this.colorSupplier.getRandomColor(), random.nextDouble(),
                random.nextDouble(), random.nextDouble());
    }
}
