package core.basesyntax;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void draw();

    public abstract double getArea();
}

/*package core.basesyntax;

public abstract class Figure {
    String color;
    public Figure(String color) {
        this.color = color;
    }
    public abstract void draw();
    public abstract double getArea();
}*/
