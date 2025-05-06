package core.basesyntax;

public abstract class Figure implements Drawable {
    protected Color color;
    protected Type type;

    enum Color {
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        PURPLE,
        WHITE
    }

    enum Type {
        CIRCLE,
        ISOSCELES_TRAPEZOID,
        RECTANGLE,
        RIGHT_TRIANGLE,
        SQUARE
    }
}
