package core.basesyntax;

public abstract class Figure implements AreaCalculator, GeneralInformation {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
