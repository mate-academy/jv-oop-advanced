package core.basesyntax;

import java.util.ArrayList;
import java.util.Random;

public class MainFigureTest {
    public static void main(String[] args) {
        Random random = new Random();

        int numberOfFigures = random.nextInt(20);

        ArrayList<Figure> figureArrayList = new ArrayList<>();

        while (numberOfFigures > 0) {
            figureArrayList.add(FigureSupplier.generateFigure());
            numberOfFigures--;
        }

        figureArrayList.forEach(FiguresBehavior::drawFigure);
    }
}
