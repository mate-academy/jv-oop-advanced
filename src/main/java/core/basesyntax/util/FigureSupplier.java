package core.basesyntax.util;

import core.basesyntax.enums.Figures;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Random;

public class FigureSupplier {
    private static Random rnd = new Random();
    private static final int BOUND = 100;

    public static Figure[] getRandomFigures(int bound) {
        Figure[] arr = new Figure[rnd.nextInt(bound)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomFigure();
        }

        return arr;
    }

    private static Figure getRandomFigure() {
        int index = rnd.nextInt(Figures.values().length);
        String figureName = "core.basesyntax.figures." + Figures.values()[index].toString();

        Figure figure = null;

        try {
            Class<Figure> cls = (Class<Figure>) Class.forName(figureName);
            figure = cls.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        if (figure != null) {
            figure.setColor(ColorSupplier.getRandomColor());
            setupFigureWithRandomParams(figure);
        }

        return figure;
    }

    private static void setupFigureWithRandomParams(Figure figure) {
        HashMap<String, Object> childParams = new HashMap<>();
        String simpleName = figure.getClass().getSimpleName();

        switch (simpleName) {
            case "Circle":
                Double radius = getRndNum();
                childParams.put("setRadius", radius);
                figure.setupAdditionalParams(childParams);
                break;
            case "IsoscelesTrapezoid":
                Double firstSide = getRndNum();
                Double secondSide = getRndNum();
                Double height = getRndNum();

                childParams.put("setFirstParallelSide", firstSide);
                childParams.put("setSecondParallelSide", secondSide);
                childParams.put("setHeight", height);
                figure.setupAdditionalParams(childParams);
                break;
            case "Rectangle":
                Double sideA = getRndNum();
                Double sideB = getRndNum();
                childParams.put("setSideA", sideA);
                childParams.put("setSideB", sideB);
                figure.setupAdditionalParams(childParams);
                break;
            case "RightTriangle":
                Double legA = getRndNum();
                Double legB = getRndNum();
                childParams.put("setLegA", legA);
                childParams.put("setLegB", legB);
                figure.setupAdditionalParams(childParams);
                break;
            case "Square":
                Double side = getRndNum();
                childParams.put("setSide", side);
                figure.setupAdditionalParams(childParams);
                break;
            default:
                throw new NoSuchFigureException();
        }
    }

    private static Double getRndNum() {
        Double result = Double.valueOf(rnd.nextInt(BOUND));
        if (result < 1) {
            getRndNum();
        }

        return result;
    }

    public static void drawFigures(Figure[] figures) {
        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}
