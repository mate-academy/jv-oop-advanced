package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_VALUE = 10.0;
    private static final int MULTIPLAYER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        FiguresShape[] figureshape = FiguresShape.values();
        Figure fg = null;
        switch (figureshape[random.nextInt(figureshape.length)].name()) {
            case "SQUARE": {
                fg = new Square(random.nextDouble() * MULTIPLAYER, colorSupplier);
                break;
            }
            case "RECTANGLE": {
                fg = new Rectangle(random.nextDouble() * MULTIPLAYER, random.nextDouble()
                    * MULTIPLAYER, colorSupplier);
                break;
            }
            case "RIGHTTRIANGLE": {
                fg = new RightTriangle(random.nextDouble() * MULTIPLAYER, random.nextDouble()
                    * MULTIPLAYER, colorSupplier);
                break;
            }
            case "CIRCLE": {
                fg = new Circle(random.nextDouble() * MULTIPLAYER, colorSupplier);
                break;
            }
            case "ISOSCELESTRAPEZOID": {
                fg = new IsoscelesTrapezoid(random.nextDouble() * MULTIPLAYER, random.nextDouble()
                    * MULTIPLAYER, random.nextDouble() * MULTIPLAYER, colorSupplier);
                break;
            }
            default: {
            }
        }
        return fg;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_VALUE);
    }
}
