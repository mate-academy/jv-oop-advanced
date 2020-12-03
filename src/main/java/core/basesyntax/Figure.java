package core.basesyntax;

import java.util.Random;

public abstract class Figure implements FigureBehaviour {

    public static Figure getFigure() {
        int randomFigure = new Random().nextInt(5);

        switch (randomFigure) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new IsoscelesTrapezoid();
            case 3:
                return new RightTriangle();
            case 4:
            default:
                return new Rectangle();
        }
    }

    public Color getColor() {
        int randomIndexColor = new Random().nextInt(Color.values().length);
        return Color.values()[randomIndexColor];
    }
}
