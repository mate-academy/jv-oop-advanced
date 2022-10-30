package core.basesyntax;

public interface FigureInformationPrinting extends AreaCalculator {
    default void drawArea() {
        System.out.println("Figure: square, area: " + String.format("%.2f",getArea()));
    }
}
