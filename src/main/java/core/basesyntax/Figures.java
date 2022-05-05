package core.basesyntax;

abstract class Figures implements Figure{
    private Colors color;

    public Figures(Colors color) {
        this.color = color;
    }

    @Override
    public abstract double getArea();

    @Override
    public Colors getColor() {
        return color;
    }
}
