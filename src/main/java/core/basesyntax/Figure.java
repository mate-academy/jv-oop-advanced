package core.basesyntax;

public abstract class Figure implements FigureBehavior {
    private Colors color;
    private String name;

    public Figure(Colors color, String name) {
        this.color = color;
        this.name = name;
    }

    public Colors getColor() {
        return this.color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
