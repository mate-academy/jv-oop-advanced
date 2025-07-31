package org.denys.oop.advanced;

import java.util.List;
import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();

    public static Figure getRandomFigure() {

        List<Figure> randomFigure = List.of(
                new Circle(ColorSupplier.getRandomColor(),
                        1.0 + 19.0 * RANDOM.nextDouble()),
                new Rectangle(ColorSupplier.getRandomColor(),
                        1 + RANDOM.nextInt(20),
                        1 + RANDOM.nextInt(20)),
                new Square(ColorSupplier.getRandomColor(),
                        1 + RANDOM.nextInt(20)));

        int randomIndex = RANDOM.nextInt(randomFigure.size());
        return randomFigure.get(randomIndex);
    }

    public static Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

}
