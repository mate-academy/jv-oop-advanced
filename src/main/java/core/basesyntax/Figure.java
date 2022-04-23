package core.basesyntax;

public class Figure {
    private String color;

    public Figure() {
        ColorSupplier cc = new ColorSupplier();
        this.color = cc.getRandomColor();
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "color='" + color + '\'' +
                '}';
    }
}
