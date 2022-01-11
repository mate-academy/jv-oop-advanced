package core.basesyntax;

import core.basesyntax.entities.Figure;
import core.basesyntax.service.ColorSupplier;
import core.basesyntax.service.FigureSupplier;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        int n = 5;
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);
        Figure[] figures = new Figure[n * 2];

        for (int i = 0; i < n; i++) {
            try {
                figures[i] = figureSupplier.getRandomFigure();
            } catch (NoSuchMethodException | InvocationTargetException | InstantiationException
                    | IllegalAccessException e) {
                e.printStackTrace();
            }
            figures[i + n] = figureSupplier.getDefaultFigure();
        }

        Arrays.stream(figures).forEach(System.out::println);
    }
}
