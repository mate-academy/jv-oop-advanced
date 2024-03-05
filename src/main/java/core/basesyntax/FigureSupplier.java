package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure[] figures = {
                new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        random.nextInt(),
                        random.nextInt(),
                        random.nextInt()
                ),
                new Circle(
                        colorSupplier.getRandomColor(),
                        random.nextInt()
                ),
                new RightTriangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(),
                        random.nextInt()
                ),
                new Rectangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(),
                        random.nextInt()
                ),
                new Square(
                        colorSupplier.getRandomColor(),
                        random.nextInt()
                )};
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.toString(), 10);
    }
}
