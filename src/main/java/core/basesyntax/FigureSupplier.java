package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FUGURES = 5;
    private static final int RADIUS_OF_DEFAULT_CIRCLE = 10;
    private static final int MULTIPLAYER = 10;
    private static final String COLOR_DEFAULT_CIRCLE = "white";
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(NUMBER_OF_FUGURES);

        switch (type) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), random.nextDouble()
                        * MULTIPLAYER);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),random.nextDouble()
                        * MULTIPLAYER,random.nextDouble() * MULTIPLAYER);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble()
                        * MULTIPLAYER, random.nextDouble() * MULTIPLAYER);
            case 3:
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble()
                        * MULTIPLAYER);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),random.nextDouble()
                        * MULTIPLAYER, random.nextDouble() * MULTIPLAYER,
                    random.nextDouble() * MULTIPLAYER);
            default: return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR_DEFAULT_CIRCLE,RADIUS_OF_DEFAULT_CIRCLE);
    }
}
