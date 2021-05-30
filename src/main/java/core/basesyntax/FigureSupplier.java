package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getFigure(int basicSize) {
        Figure figure;
        int countFigures = 5;
        Random random = new Random();
        switch (random.nextInt(countFigures) + 1) {
            case 1:
                figure = new Circle(random.nextDouble() * basicSize,
                        new ColorSupplier().getRandomColor());
                break;
            case 2:
                figure = new RightTriangle(random.nextDouble() * basicSize,
                        random.nextDouble() * basicSize * 2,
                        new ColorSupplier().getRandomColor());
                break;
            case 3:
                figure = new Rectangle(random.nextDouble() * basicSize,
                        random.nextDouble() * basicSize * 2,
                        new ColorSupplier().getRandomColor());
                break;
            case 4:
                figure = new IsoscelesTrapezoid(random.nextDouble() * basicSize,
                        random.nextDouble() * basicSize * 2,
                        random.nextDouble() * basicSize * 3,
                        new ColorSupplier().getRandomColor());
                break;
            case 5:
                figure = new Square(random.nextDouble() * basicSize,
                        new ColorSupplier().getRandomColor());
                break;
            default:
                figure = null;
        }
        return figure;
    }
}
