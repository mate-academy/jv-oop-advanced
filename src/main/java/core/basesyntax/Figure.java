package core.basesyntax;

public class Figure implements FigureDraw {
    public String color;

    @Override
    public void drawInfo() {
        System.out.println("This is a figure");
    }


}
