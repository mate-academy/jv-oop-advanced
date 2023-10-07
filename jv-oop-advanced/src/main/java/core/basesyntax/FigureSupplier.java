package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static Random random = new Random();
    private static int side = 0;
    private static int firstleg = 0;
    private static int secondleg = 0;
    private static final Form[] forms = Form.values();
    private static Figure figures;

    public static Form getRandomForm() {
        int index = random.nextInt(forms.length);
        return forms[index];
    }

    public static Figure getRandomFigure() {
        side = random.nextInt(100);
        firstleg = random.nextInt(100);
        secondleg = random.nextInt(100);
        Form randomForm = getRandomForm();
        if (randomForm.name().equals("Circle")) {
            figures = new Circle(getRandomForm(), ColorSupplier.getRandomColor(), side);
        }
        if (randomForm.name().equals("Rectangle")) {
            figures = new Rectangle(getRandomForm(),
                    ColorSupplier.getRandomColor(), firstleg, secondleg);
        }
        if (randomForm.name().equals("RightTriangle")) {
            figures = new RightTriangle(getRandomForm(), ColorSupplier.getRandomColor(), side);
        }
        if (randomForm.name().equals("Square")) {
            figures = new Square(getRandomForm(), ColorSupplier.getRandomColor(), side);
        }
        return figures;
    }

    public static Figure getDefaultFigure() {
        return new Circle(Form.Circle, Color.WHITE, 10);
    }

    public static Figure getFigures() {
        return figures;
    }

    public static void setFigures(Figure figures) {
        FigureSupplier.figures = figures;
    }
}

