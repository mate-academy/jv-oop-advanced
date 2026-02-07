package core.basesyntax;

public abstract class Figure implements InfoPrint {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract void printInfo();
}
