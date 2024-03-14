package core.basesyntax;

public class DefaultFigure implements Figure {

    @Override
    public double getArea() {
        return 10;
    }

    @Override
    public String getFigureInfo() {
        return "Figure: circle, area: 10 sq. units, side: 5 units, color: white";
    }
}

