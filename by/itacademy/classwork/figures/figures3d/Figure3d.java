package by.itacademy.classwork.figures.figures3d;

import by.itacademy.classwork.figures.Figure;

public abstract class Figure3d extends Figure {
    protected double volume;

    public int getVolume(int volume) {
        return volume;
    }
    protected  abstract double calculateVolume();
    }


