package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure randomFigure;
        switch (random.nextInt(5)) {
            case 0:
                randomFigure = new Circle(random.nextInt(10) + 1);
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
            case 1:
                randomFigure = new IsoscelesTrapezoid(random.nextInt(10) + 1,
                        random.nextInt(10) + 1, random.nextInt(10) + 1);
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
            case 2:
                randomFigure = new Rectangle(random.nextInt(10) + 1, random.nextInt(10) + 1);
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
            case 3:
                randomFigure = new RightTriangle(random.nextInt(10) + 1, random.nextInt(10) + 1);
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
            default:
                randomFigure = new Square(random.nextInt(10) + 1);
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(10);
        defaultFigure.setColor(Color.WHITE.toString());
        return defaultFigure;
    }
}
