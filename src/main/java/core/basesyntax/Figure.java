package core.basesyntax;

public abstract class Figure implements Area, Drawing {
    private String colors;

    public Figure(String colors) {
        this.colors = colors;
    }

    public String getColors() {
        return colors;
    }
}
