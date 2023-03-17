package core.basesyntax;

public class DefaultFigure extends AbstractFigure {

    public DefaultFigure(String color) {
        super(color);
    }

    @Override
    public String draw() {
        double radius = 10;
        double area = Math.PI * radius;
        return String.format("Figure: circle, area: %s sq.units, radius: %s units",
               String.format("%.2f", area), String.format("%.2f", radius));
    }

}

