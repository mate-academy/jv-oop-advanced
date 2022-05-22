package core.basesyntax;

public abstract class Figure {
    private String color;
    private String type;

    public Figure(String color, String type) {
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "color='" + color + '\'' +
                '}';
    }

}
