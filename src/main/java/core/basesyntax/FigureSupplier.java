package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final static double DEFAULT_VALUE = 10.0;
    private final static int MULTIPLAYER = 100;
    private ColorSupplier colorSupplier;

    public FigureSupplier() {
        this.colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        FiguresShape[] figureshape = FiguresShape.values();
        Figure fg = null;
        switch (figureshape[random.nextInt(figureshape.length)].toString()) {
            case "Square": {
                fg = new Square(random.nextDouble() * MULTIPLAYER, colorSupplier);
                break;
            }
            case "Rectangle": {
                fg = new Rectangle(random.nextDouble() * MULTIPLAYER, random.nextDouble()
                    * MULTIPLAYER, colorSupplier);
                break;
            }
            case "RightTriangle": {
                fg = new RightTriangle(random.nextDouble() * MULTIPLAYER, random.nextDouble()
                    * MULTIPLAYER, colorSupplier);
                break;
            }
            case "Circle": {
                fg = new Circle(random.nextDouble() * MULTIPLAYER, colorSupplier);
                break;
            }
            case "IsoscelesTrapezoid": {
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
