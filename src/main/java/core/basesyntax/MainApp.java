package core.basesyntax;

import core.basesyntax.entities.Figure;
import core.basesyntax.interfaces.Drawable;
import core.basesyntax.service.ColorSupplier;
import core.basesyntax.service.FigureSupplier;
import java.util.Arrays;
import java.util.Random;

public class MainApp {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier(random);
    private static final FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);
    private static final int HALF_SIZE = 5;
    private static final Figure[] figures = new Figure[HALF_SIZE * 2];

    public static void main(String[] args) {
        for (int i = 0; i < HALF_SIZE; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i + HALF_SIZE] = figureSupplier.getDefaultFigure();
        }

        Arrays.stream(figures).forEach(Drawable::draw);
    }
}
