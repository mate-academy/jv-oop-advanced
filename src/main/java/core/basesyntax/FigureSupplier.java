package core.basesyntax;

import java.util.Random;

public interface FigureSupplier {
     Random random = new Random();

     Figure getRandomFigure();

     Figure getDefaultFigure();
}
