package core.basesyntax;

import java.util.Random;

public abstract class Figure implements Drawable {
    private int radius;
    private String color;

    public static class FigureSupplier {
        private static final Random random = new Random();

        protected int getRandomFigure() {
            return random.nextInt(10) + 1;
        }

        public Circle getDefaultFigure() {
            int radius = 10;
            String color = "White";
            return new Circle(radius, color);
        }
    }
}
