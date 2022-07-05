package core.basesyntax;

public interface DrawFigureInfo {
    default void drawInfo() {
        System.out.print("Figure: ");
    }
}
