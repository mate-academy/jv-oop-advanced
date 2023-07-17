package core.basesyntax;

public class Superclass implements Figure {

    private final String color = new ColorSupplier().getRandomColor();

    @Override
    public String getArea() {

        return color;
    }
}
