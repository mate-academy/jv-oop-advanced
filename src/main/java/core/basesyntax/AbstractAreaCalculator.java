package core.basesyntax;

abstract class AbstractAreaCalculator implements AreaCalculator,Drawable {
    private String color;

    public AbstractAreaCalculator(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
