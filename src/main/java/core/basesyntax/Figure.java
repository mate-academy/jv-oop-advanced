package core.basesyntax;

public abstract class Figure implements FigureBehaviour {
    private String color;

    public Figure() {
        this.color = new ColorSupplier().getRandomColor();
    }

    public String getColor() {
        return color;
    }
}
