package core.basesyntax;

public abstract class Figure implements AreaInter, DrawInterf {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
