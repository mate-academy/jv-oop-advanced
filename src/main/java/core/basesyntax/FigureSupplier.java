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
                figure = new Circle(cs.getRandomColor(), figurePartSize);
                break;
            case 1:
                figure = new RightTriangle(
                        cs.getRandomColor(),
                        figurePartSize, figurePartSize

                );
                break;
            case 2:
                figure = new IsoscelesTrapezoid(
                        cs.getRandomColor(),
                        figurePartSize, figurePartSize, figurePartSize
                );
                break;
            case 3:
                figure = new Square(cs.getRandomColor(),figurePartSize);
                break;
            case 4:
                figure = new Rectangle(cs.getRandomColor(),figurePartSize, figurePartSize);
                break;
            default:
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

}
