package core.basesyntax;

public interface FigureDraw {
    public default String draw() {
        return null;
    }

    public default double getArea() {
        return 0;
    }
}
