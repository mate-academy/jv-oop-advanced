package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("color: " + color.toString());
    }
}
