package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private int figureNumber = random.nextInt(FIGURE_COUNT);
    private int figureLeg = random.nextInt(10);

    public int getFigureLeg() {
        return figureLeg;
    }
    public void setFigureLeg(int figureLeg) {
        this.figureLeg = figureLeg;
    }
    public int getFigureNumber() {
        return figureNumber;
    }
    public void setFigureNumber(int figureNumber) {
        this.figureNumber = figureNumber;
    }

    public Figure getRandomFigure() {

        Circle circle = new Circle();
        circle.setRadius(figureNumber);
        return circle;
    }
}