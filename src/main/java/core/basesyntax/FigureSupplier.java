package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    private int getRandomNumber() {
        return random.nextInt(100) + 1;
    }

    public Shape getDefaultFigure() {
        int defaultRadius = 10;
        String defaultColor = Color.WHITE.toString();
        return new Circle(defaultRadius,defaultColor);
    }

    public Shape getRandomFigure() {
        String randomColor = new ColorSupplier().getRandomColor();
        switch (random.nextInt(FIGURE_COUNT)) {
            case 1 : {
                int randomRadius = getRandomNumber();
                return new Circle(randomRadius, randomColor);
            }
            case 2 : {
                int randomBottomBase = getRandomNumber();
                int randomUpperBase = getRandomNumber();
                int randomEdge = getRandomNumber();
                return new IsoscelesTrapezoid(randomBottomBase,
                        randomUpperBase, randomEdge, randomColor);
            }
            case 3 : {
                int randomFirstLeg = getRandomNumber();
                int randomSecondLeg = getRandomNumber();
                return new Rectangle(randomFirstLeg, randomSecondLeg, randomColor);
            }
            case 4 : {
                int randomSide = getRandomNumber();
                return new RightTriangle(randomSide, randomColor);
            }
            case 5:
            default: {
                int randomSide = getRandomNumber();
                return new Square(randomSide, randomColor);
            }
        }
    }
}
