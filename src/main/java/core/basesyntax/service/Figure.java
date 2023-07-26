package core.basesyntax.service;

import core.basesyntax.supplier.ColorSupplier;
import core.basesyntax.supplier.FigureSupplier;

public abstract class Figure implements FigureBehaviourService {
    protected ColorSupplier colorSupplier = new ColorSupplier();
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void drawFigure() {
        FigureSupplier figureSupplier = new FigureSupplier(new ColorSupplier());
        Figure figure = figureSupplier.getDefaultFigure();
        figure.drawFigure();
    }
}
