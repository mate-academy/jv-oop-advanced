package core.basesyntax;

public class Figure implements AreaOfFigure, DescriptionOfFigure {
    protected String color;

    public String descriptionOfSide() {
        return null;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
