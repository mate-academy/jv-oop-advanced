package core.basesyntax;

import java.util.ArrayList;
import java.util.Random;

public class MainFigureTest {
    private static final int RANDOM_LIMIT = 50;

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Figure> figureArrayList = new ArrayList<>();

        for (int i = random.nextInt(RANDOM_LIMIT); i > 0; i--) {
            figureArrayList.add(FigureSupplier.generateFigure());
        }

        figureArrayList.forEach(FigureDrawer::drawFigure);
    }
}
