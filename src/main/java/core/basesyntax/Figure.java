package core.basesyntax;


import core.basesyntax.interfaces.Print;

public abstract class Figure implements Print {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
