package core.basesyntax;

class FigureForm implements AreaOfFigure, Draw {
    private String color = ColorSupplier.getRandomColor();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
        Draw.super.draw();
    }
}
