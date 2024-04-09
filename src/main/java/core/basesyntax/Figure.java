package core.basesyntax;

public abstract class Figure implements FigureBehavior {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public Figure() {
    }

    public String draw() {
        return "Figure: " + getClass().getSimpleName()
                + "\n\tArea: "
                + String.format("%.2f", obtainArea())
                + " sq. units\n\tColor: "
                + getColor();
    }

    public String getColor() {
        return color;
    }
}
