package core.basesyntax;

public abstract class Figure {
    private String color;
    private Figure (String color) {
        this.color = color;
    }
    private String getcolor() {
        return color;
    }
    private void setcolor(String color) {
        this.color = color;
    }
}
