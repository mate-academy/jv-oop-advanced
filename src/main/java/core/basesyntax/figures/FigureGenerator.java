package core.basesyntax.figures;

import java.util.Random;

public class FigureGenerator {
    private static final int FIGURES_AMOUNT = 5; //Number of inherited classes
    private static Random random = new Random();

    public static Figures getRandomFigure() {
        switch (random.nextInt(FIGURES_AMOUNT)) {
            case 0:
                return new Circle(random.nextDouble() * 25 + 1,
                        Color.getRandom());

            case 1:
                return new IsoscelesTrapezoid(random.nextDouble() * 25 + 1,
                        Math.random() * 25 + 1,
                        Math.random() * 25 + 1,
                        Color.getRandom());

            case 2:
                return new RightTriangle(random.nextDouble() * 25,
                        Math.random() * 25 + 1,
                        Color.getRandom());

            case 3:
                return new Rectangle(random.nextDouble() * 25 + 1,
                        Math.random() * 25 + 1,
                        Color.getRandom());

            case 4:
                return new Square(random.nextDouble() * 25 + 1,
                        Color.getRandom());

            default:
                return new Square(0, Color.BLACK);
        }
    }
}
