package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_NUMBER_OF_FIGURES = 5;

    private static boolean isDefault = true;
    private int index;
    private Random random = new Random();
    private Figure defaultFigure;
    private Figure randomFigure;

    public static boolean isDefault() {
        return isDefault;
    }

    public Figure getRandomFigure() {
        isDefault = false;
        index = random.nextInt(MAX_NUMBER_OF_FIGURES);

        switch (index) {
            case 0 :
                randomFigure = new Square();
                break;
            case 1 :
                randomFigure = new Rectangle();
                break;
            case 2 :
                randomFigure = new RightTriangle();
                break;
            case 3 :
                randomFigure = new IsoscelesTrapezoid();
                break;
            case 4 :
            default:
                randomFigure = new Circle();
        }

        return randomFigure;
    }

    public Figure getDefaultFigure() {
        isDefault = true;
        defaultFigure = new Circle();
        return defaultFigure;
    }
}
