package core.basesyntax;

public abstract class Figure implements GetAreaAndInfo {
    private String name;
    private String color = new ColorSupplier().getRandomColor();

    private float something = new FigureSupplier().getRandomFigure();


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String getColor() {
        return color;
    }

    @Override
    public String printInfo() {
        return null;
    }

    @Override
    public float getArea() {
        return 0;
    }

    public float getSomething() {
        return something;
    }
}
