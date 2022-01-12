package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
   ColorSupplier colorSupplier = new ColorSupplier();
   public Random random = new Random();
   public static final int FIGURE_COUNT = 4;
   public static final int FIGURE_MAX_VALUE = 10;

    public Figures getRandomFigure() {
        int randomFigureNumber = random.nextInt(FIGURE_COUNT);
        Figures result;
        switch (randomFigureNumber) {
            default : return null;
            case 0 :
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                int randomSide = random.nextInt(FIGURE_MAX_VALUE);
                square.setSide(randomSide);
                return square;
        }
    }

    public Figures getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor(colorSupplier.getDefaultColor());
        return circle;
    }


}
