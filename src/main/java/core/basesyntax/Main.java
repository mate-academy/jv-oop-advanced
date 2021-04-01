package core.basesyntax;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static final int LIMIT = 20;

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Figure> figuresArrayList = new ArrayList<>();
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = random.nextInt(LIMIT); i > 0; i--) {
            figuresArrayList.add(figureSupplier.getRandomFigure());
        }
        figuresArrayList.forEach(Drawer::draw);
    }
}
