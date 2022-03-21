package core.basesyntax;

public abstract class Figure implements FigureDetails{
    public FigureE name;
    public Color color;

    @Override
    public void getArea() {
        System.out.println("Area");
    }

    @Override
    public void getDetails() {
        System.out.println("Details");
    }
}
