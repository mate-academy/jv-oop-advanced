package core.basesyntax;

public abstract class Figure implements FigureDetailer {
    private FigureE name;
    private Color color;

    public FigureE getName() {
        return name;
    }

    public void setName(FigureE name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void getArea() {
        System.out.println("Area");
    }

    @Override
    public void getDetails() {
        System.out.println("Details");
    }

}
