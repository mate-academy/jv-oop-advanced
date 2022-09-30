package core.basesyntax;

public class Circle extends Figure implements FigureArea{
    private int radius;


    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public String draw() {
        return "";
    }
}
