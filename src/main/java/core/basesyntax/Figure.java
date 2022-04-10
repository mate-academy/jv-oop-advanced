package core.basesyntax;

public abstract class Figure implements FigureBehaviour{
    public final int MAX_PARAMETER_LENGTH = 20;
    public String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract Figure setRandomParameters ();
}
