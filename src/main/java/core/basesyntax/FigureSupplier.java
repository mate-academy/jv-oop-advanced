package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public FigureSupplier() {

    }

    public Figure getRandomFigure(int numberOfFigures) {
        ColorSupplier colorSupplier = new ColorSupplier(this.random);
        int figureOption = random.nextInt(numberOfFigures);
        Figure figure = new Figure();
        switch (figureOption) {
            case 0:
                figure = getRandomSquare(colorSupplier);
                break;
            case 1:
                figure = getRandomRectangle(colorSupplier);
                break;
            case 2:
                figure = getRandomRightTriangle(colorSupplier);
                break;
            case 3:
                figure = getRandomCircle(colorSupplier);
                break;
            case 4:
                figure = getRandomIsoscelesTrapezoid(colorSupplier);
                break;
            default:
                break;
        }

        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

    public Square getRandomSquare(ColorSupplier colorSupplier) {
        return new Square(colorSupplier.getRandomColor(), random.nextDouble());
    }

    public Rectangle getRandomRectangle(ColorSupplier colorSupplier) {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(),
                random.nextDouble());
    }

    public RightTriangle getRandomRightTriangle(ColorSupplier colorSupplier) {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble(),
                random.nextDouble());
    }

    public Circle getRandomCircle(ColorSupplier colorSupplier) {
        return new Circle(colorSupplier.getRandomColor(), random.nextDouble());
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid(ColorSupplier colorSupplier) {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(),
                random.nextDouble(), random.nextDouble());
    }
}
