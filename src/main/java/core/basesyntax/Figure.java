package core.basesyntax;

public abstract class Figure implements FigureBehaviour {
    static final int maxParameterLength = 20;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract Figure setRandomParameters();
}
