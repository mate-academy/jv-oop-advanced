package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int LIMIT = 50;
    public Figure getRandomFigure(){
        Random r = new Random();
        ColorSupplier randomColor = new ColorSupplier();
        int i = r.nextInt(FigureE.values().length);
        String f = FigureE.values()[i].toString();

        if (f.equals("CIRCLE")){
            Figure res = new Circle(r.nextInt(LIMIT));
            res.color = Color.valueOf(randomColor.getRandomColor());
            return res;
        } else if (f.equals("SQUARE")){
            Figure res2 = new Square(r.nextInt(LIMIT));
            res2.color = Color.valueOf(randomColor.getRandomColor());
            return res2;
        } else if (f.equals("RECTANGLE")){
            Figure res3 = new Rectangle(r.nextInt(LIMIT), r.nextInt(LIMIT));
            res3.color = Color.valueOf(randomColor.getRandomColor());
            return res3;
        }
        return null;
    }
    public Figure getDefaultFigure(){
        Figure defaultCircle = new Circle(10);
        defaultCircle.color = Color.WHITE;
        return defaultCircle;
    }
}
