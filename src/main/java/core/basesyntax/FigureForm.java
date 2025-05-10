package core.basesyntax;

class FigureForm implements AreaOfFigure, Drawable {
    private String color = new ColorSupplier().getRandomColor();

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println(color);
    }
}
