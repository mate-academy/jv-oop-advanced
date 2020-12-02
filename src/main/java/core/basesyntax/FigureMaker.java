package core.basesyntax;

import java.util.Random;

public class FigureMaker {

    public static final int FIGURES_TYPES = 5;

    public Figure[] makeFigures(int amount) {

        Random random = new Random();
        Figure[] figures = new Figure[amount];

        for (int i = 0; i < amount; i++) {
            switch (random.nextInt(FIGURES_TYPES)) {
                case 0:
                    figures[i] = new Circle(random.nextInt(25));
                    break;
                case 1:
                    figures[i] = new IsoscelesTrapezoid(random.nextInt(25),
                            random.nextInt(25), random.nextInt(25));
                    break;
                case 2:
                    figures[i] = new Rectangle(random.nextInt(25), random.nextInt(25));
                    break;
                case 3:
                    figures[i] = new RightTriangle(random.nextInt(25), random.nextInt(25));
                    break;
                default:
                case 4:
                    figures[i] = new Square(random.nextInt(25));
                    break;
            }
            figures[i].setColor(Color.values()[random.nextInt(Color.values().length)]);
        }
        return figures;
    }
}
