package core.basesyntax;

public class FigureSupplier {
    public Figure getDefaultFigure() {
        return new DefaultFigure();
    }

    public static class DefaultFigure implements Figure {
        @Override
        public double getArea() {
            return 10;
        }

        @Override
        public String getFigureInfo() {
            return "Figure: circle, area: 10 sq. units, side: 5 units, color: white";
        }
    }
}
