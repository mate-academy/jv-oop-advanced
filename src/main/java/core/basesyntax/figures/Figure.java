package core.basesyntax.figures;

public abstract class Figure implements AreaAble, DrawAble {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
