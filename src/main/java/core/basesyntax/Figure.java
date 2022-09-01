package core.basesyntax;

public abstract class Figure implements Area, Draw{
    private String color;
    protected Figure (String color) {
        this.color = color;
    }

}
