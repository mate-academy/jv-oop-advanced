package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier cs = new ColorSupplier();

    public Figure getRandomFigure() {
        Random random = new Random();
        int shapeNumber = random.nextInt(5);
        double figurePartSize = random.nextInt(20);
        Figure figure = null;

        switch (shapeNumber) {
            case 0:
                figure = new Circle(figurePartSize, cs.getRandomColor());
                break;
            case 1:
                figure = new RightTriangle(
                        figurePartSize, figurePartSize,
                        cs.getRandomColor()
                );
                break;
            case 2:
                figure = new IsoscelesTrapezoid(
                        figurePartSize, figurePartSize,
                        figurePartSize, cs.getRandomColor()
                );
                break;
            case 3:
                figure = new Square(figurePartSize, cs.getRandomColor());
                break;
            case 4:
                figure = new Rectangle(figurePartSize, figurePartSize, cs.getRandomColor());
                break;
            default:
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }

}
