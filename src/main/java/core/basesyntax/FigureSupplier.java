package core.basesyntax;

public class FigureSupplier {
    public static Figure getFigure() {
        int randomNumber = (int) (Math.random() * 5);
        switch (randomNumber) {
            case 0:
                Square s = new Square();
                s.setProperty(s.drawFigure());
                return s;
            case 1:
                Rectangle r = new Rectangle();
                r.setProperty(r.drawFigure());
                return r;
            case 2:
                Triangle t = new Triangle();
                t.setProperty(t.drawFigure());
                return t;
            case 3:
                Circle c = new Circle();
                c.setProperty(c.drawFigure());
                return c;
            default:
                IsTrapezoid i = new IsTrapezoid();
                i.setProperty(i.drawFigure());
                return i;
        }
    }
}
