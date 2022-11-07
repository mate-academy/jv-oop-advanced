package core.basesyntax;

public class Figure implements Draw, AreaCalculator {

    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure color: " + color);
        ;
    }

    @Override
    public int calculateArea() {
        return 0;
    }
}
