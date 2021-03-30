package core.basesyntax;

public class Triangle extends Figure {
    private final int height;
    private final int base;

    public Triangle(String color, int leg, int base, int hypotenuse) {
        super("triangle", color, new Property("hypotenuse", hypotenuse));
        this.height = leg;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return (height * base) / 2.0;
    }
}
