package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(MainFigure.figureCount);
        switch (figureNumber) {
            case 0:
                return new Square(random.nextInt(25), colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(random.nextInt(25), random.nextInt(25),
                        colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(random.nextInt(25), random.nextInt(25),
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(random.nextInt(25), colorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(random.nextInt(25), random.nextInt(25),
                        random.nextInt(25), colorSupplier.getRandomColor());
        }
    }
}
