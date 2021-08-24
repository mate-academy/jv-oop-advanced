package core.basesyntax;

// there are some figures
public abstract class Figure {
    private String color; // all figures have color
    private String presentation; // all figures have draw presentation on screen

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

}
