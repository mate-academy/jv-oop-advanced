package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends Figure {

    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    @Override
    public double getSide() {
        double sideSize = random.nextInt(FIGURE_COUNT) + 1;
        return sideSize;
    }

    public int getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT) + 1;
        return figureNumber;
    }

    @Override
    public String getColors() {
        String[] colors = new String[]{"blue", "red", "yellow", "white", "black"};
        int numberOfColors = colors.length;
        int pickColor = random.nextInt(numberOfColors);
        String colorChoice = colors[pickColor];
        return colorChoice;
    }
}
