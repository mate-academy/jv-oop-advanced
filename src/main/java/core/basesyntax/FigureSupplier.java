package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Shape getDefaultFigure() {
        int defaultRadius = 10;
        String defaultColor = Color.WHITE.toString();
        Shape defaultFigure = new Circle(defaultRadius,defaultColor);
        return defaultFigure;
    }

    public Shape getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String randomColor = new ColorSupplier().getRandomColor();
        switch (figureNumber) {
            case 1 : {
                //Circle
                int randomRadius = random.nextInt(100);
                return new Circle(randomRadius,randomColor);
            }
            case 2 : {
                //IsoscelesTrapezoid
                int randomBottomBase = random.nextInt(100);
                int randomUpperBase = random.nextInt(100);
                int randomEdge = random.nextInt(100);
                return new IsoscelesTrapezoid(randomBottomBase,
                        randomUpperBase, randomEdge, randomColor);
            }
            case 3 : {
                //Rectangle
                int randomFirstLeg = random.nextInt(100);
                int randomSecondLeg = random.nextInt(100);
                return new Rectangle(randomFirstLeg, randomSecondLeg, randomColor);
            }
            case 4 : {
                //RightTriangle
                int randomSide = random.nextInt(100);
                return new RightTriangle(randomSide, randomColor);
            }
            default: {
                //Square
                int randomSide = random.nextInt(100);
                return new Square(randomSide, randomColor);
            }
        }
    }
}
