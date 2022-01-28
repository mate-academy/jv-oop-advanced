package core.basesyntax;

import java.util.Random;

public class FigureSuplier {
    public static Figure getRandomFigure() {
        Random random = new Random();
        int side = random.nextInt(10);
        int radius = random.nextInt(10);
        int smallSide = random.nextInt(10);
        int bigSide = random.nextInt(10);
        int firstLeg = random.nextInt(10);
        int secondLeg = random.nextInt(10);
        int height = random.nextInt(10);
        int topBase = random.nextInt(10);
        int bottomBase = random.nextInt(10);

        Figure [] figures = {new Circle(ColorSuplier.getRandomColor(), radius),
                new IsoscelesTrapezoid(ColorSuplier.getRandomColor(), height, topBase, bottomBase),
                new Rectangle(ColorSuplier.getRandomColor(), smallSide, bigSide),
                new RightTriangle(ColorSuplier.getRandomColor(), firstLeg, secondLeg),
                new Square(ColorSuplier.getRandomColor(), side)};
        int index = random.nextInt(figures.length);

        return figures[index];
    }

    public static Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
