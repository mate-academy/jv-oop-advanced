package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Random getRandom() {
        return random;
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT - 1);
        switch (figureNumber) {
            case 1:
                Circle randomCircle = new Circle();
                return randomCircle;
            case 2:
                Square randomSquare = new Square();
                return randomSquare;
            case 3:
                Rectangle randomRectangle = new Rectangle();
                return randomRectangle;
            case 4:
                RigthTriangle randomTriangle = new RigthTriangle();
                return randomTriangle;
            default:
                IsoscelesTrapezoid randomIsoTrapezoid = new IsoscelesTrapezoid();
                return randomIsoTrapezoid;
        }
    }
}
