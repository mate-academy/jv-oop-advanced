package core.basesyntax;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static final int LIMIT = 40;

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Figure> figuresArrayList = new ArrayList<>();
        for (int i = random.nextInt(LIMIT); i > 0; i--) {
            figuresArrayList.add(FigureSupplier.figureGenerator());
        }
        figuresArrayList.forEach(Drawer::drawFigure);
    }
}
