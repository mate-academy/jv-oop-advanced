package core.basesyntax;

public abstract class Figure implements AreaCalculator, PrintInfo {

    public Figure(Colors color){
        this.color = color;
    }
    private Colors color;

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
