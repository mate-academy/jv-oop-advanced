package core.basesyntax;

public class Figure implements Drawing {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
    }
}
