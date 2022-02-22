package core.basesyntax;

public abstract class Figure {

    private String color;


    public Figure (String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void getArea();

}
