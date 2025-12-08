package core.basesyntax;

public abstract class Figure {
    private String color;
    private String figure (String color) {
        this.color = color;
        return color;
    }

    private String getcolor() {
        return color;
    }

    private void setcolor(String color) {
        this.color = color;
    }
}
