package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 6;
    private Random random = new Random();
    private Figure figureObject;


    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 1 :
                figureObject = new Circle();
                break;
            case 2 :
                figureObject = new IsoscelesTrapezoid();
                break;
            case 3 :
                figureObject = new Rectangle();
                break;
            case 4 :
                figureObject = new RightTriangle();
                break;
            case 5 :
            default :
                figureObject = new Square();
        }
        return figureObject;
    }
}
