package core.basesyntax;

public abstract class Figure implements WithArea {

    protected String color;

    public Figure(String color) {
        this.color = color.toLowerCase();
    }
}
