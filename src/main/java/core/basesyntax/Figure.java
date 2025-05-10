package core.basesyntax;

public abstract class Figure implements Drawing {
    protected String color;

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public abstract String draw();
}
