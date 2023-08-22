package core.basesyntax;

public abstract class Figure implements Draw, AreaCalculation {
    protected String color1;
    private Color color;

    public Figure(){

    }

    public Figure(String color1) {
        this.color1 = ColorSupplier.getRandomColor();
    }

    public Figure(Color color) {
        this.color = color;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
