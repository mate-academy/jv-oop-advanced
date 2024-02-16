package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawer {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public abstract double getArea();//не впевнений що сюди потрібно було це додавати,
    // чи це потрібно тільки в класи наслідники в випадку абстрактного класу?

    @Override
    public abstract void draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
