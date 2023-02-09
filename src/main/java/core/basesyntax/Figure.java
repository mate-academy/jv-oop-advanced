package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    public Color color;

    public void draw() {
        System.out.println("color: " + color.toString());
    }
}
