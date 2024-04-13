package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random;

    public FigureSupplier(Random random) {
        this.random = random;
    }

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier(this.random);
        int figureOption = random.nextInt(5);
        Figure figure = new Figure();
        switch (figureOption) {
            case 0:
                figure = new Square(colorSupplier.getRandomColor(), random.nextDouble());
                break;
            case 1:
                figure = new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(),
                        random.nextDouble());
                break;
            case 2:
                figure = new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble(),
                        random.nextDouble());
                break;
            case 3:
                figure = new Circle(colorSupplier.getRandomColor(), random.nextDouble());
                break;
            case 4:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(),
                        random.nextDouble(), random.nextDouble());
                break;
            default:
                break;
        }

        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
