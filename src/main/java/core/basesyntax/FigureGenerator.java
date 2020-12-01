package core.basesyntax;

import java.util.Random;

public class FigureGenerator {
    public static Figures random() {
        Random figures = new Random();
        int y = figures.nextInt(5);
        int randomSide = figures.nextInt(150);
        int randomSide1 = figures.nextInt(150);
        int randomSide2 = figures.nextInt(150);
        switch (y) {
            case 1:
                return new Square(colorRand(), randomSide);
            case 2:
                return new IsoscelesTrapezoid(colorRand(), randomSide, randomSide1, randomSide2);
            case 3:
                return new RightTriangle(colorRand(), randomSide, randomSide1);
            case 4:
                return new Rectangle(colorRand(), randomSide, randomSide1);
            default:
                return new Circle(colorRand(), randomSide);
        }
    }

    private static Colors colorRand() {
        Colors[] color = Colors.values();
        Random random = new Random();
        return color[random.nextInt(color.length)];
    }
}
