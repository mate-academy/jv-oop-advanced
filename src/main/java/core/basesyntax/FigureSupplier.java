package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static Figure getFigure(int basicSize) {
        Figure figure;
        Random random = new Random();
        switch (random.nextInt(5) + 1) {
            case 1:
                figure = new Circle(random.nextDouble() * basicSize,
                        ColorSupplier.getRandomColor());
                break;
            case 2:
                figure = new RightTriangle(random.nextDouble() * basicSize,
                        random.nextDouble() * basicSize * 2,
                        ColorSupplier.getRandomColor());
                break;
            case 3:
                figure = new Rectangle(random.nextDouble() * basicSize,
                        random.nextDouble() * basicSize * 2,
                        ColorSupplier.getRandomColor());
                break;
            case 4:
                figure = new IsoscelesTrapezoid(random.nextDouble() * basicSize,
                        random.nextDouble() * basicSize * 2,
                        random.nextDouble() * basicSize * 3,
                        ColorSupplier.getRandomColor());
                break;
            case 5:
                figure = new Square(random.nextDouble() * basicSize,
                        ColorSupplier.getRandomColor());
                break;
            default:
                figure = null;
        }
        return figure;
    }
}
