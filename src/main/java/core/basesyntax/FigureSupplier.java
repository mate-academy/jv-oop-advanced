package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random randomFigure = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Figure[] array = new Figure[]{new Square(colorSupplier.getRandomColor(), randomFigure.nextInt()),
            new Rectangle(colorSupplier.getRandomColor(), randomFigure.nextInt(), randomFigure.nextInt()),
            new RightTriangle(colorSupplier.getRandomColor(), randomFigure.nextInt(), randomFigure.nextInt()),
            new Circle(colorSupplier.getRandomColor(), randomFigure.nextInt()),
            new IsoscelesTrapezoid(colorSupplier.getRandomColor(), randomFigure.nextInt(), randomFigure.nextInt(),
                    randomFigure.nextInt())};

    public Figure getRandomFigure() {
        int index = randomFigure.nextInt(array.length);
        return array[index];
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
