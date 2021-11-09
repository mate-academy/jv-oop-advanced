package core.basesyntax;

public abstract class Figural implements Paremetres, Draweble {
    private String color;

    public Figural(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

