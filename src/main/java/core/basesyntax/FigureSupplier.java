package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_NUMBER = 5;

    private int index;
    private Figure randomFigure;
    private Random random = new Random();
    private Figure defaultFigure = new Circle();

    public Figure getRandomFigure() {
        index = random.nextInt(FIGURE_NUMBER);

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
        defaultFigure.setDefaultParameters();
        return defaultFigure;
    }
}
