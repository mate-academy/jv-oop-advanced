package core.basesyntax;

import java.text.DecimalFormat;
import java.util.Random;

public abstract class Figure implements Drawable, Area {
    private DecimalFormat format = new DecimalFormat("#.##");

    public DecimalFormat getFormat() {
        return format;
    }

    public static class FigureSupplier {

        static final Random random = new Random();
        static final int DEFAULT_RADIUS = 10;
        static final int DEFAULT_BASE_ONE = 5;
        static final int DEFAULT_BASE_TWO = 10;
        static final int DEFAULT_HEIGHT = 10;
        static final int DEFAULT_WIDTH = 15;
        static final String DEFAULT_COLOR = "white";

        protected int getRandomFigure() {
            return random.nextInt(10) + 1;
        }

        public Circle getDefaultFigure() {
            return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
        }
    }
}

