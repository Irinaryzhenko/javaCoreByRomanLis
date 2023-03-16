package by.itacademy.classwork.technics;

public abstract class Devices implements Plugeble {
    protected boolean plugged;
    protected int power;

    public Devices(int power) {
        this.power = power;
        this.plugged = false;
    }

    @Override
    public void plugIn() {

        plugged = true;
    }

    @Override
    public void plugOf() {
        plugged = false;

    }

    @Override
    public boolean isPlugged() {
        return plugged;
    }

    public int getPower() {
        return power;
    }
}
