package core.basesyntax;

abstract class FigureBase implements FigureArea, FigureDrawable {
    protected String color;

    public FigureBase(String color) {
        this.color = color;
    }

    @Override
    public abstract double getArea();

    @Override
    public abstract void getInfo();
}
