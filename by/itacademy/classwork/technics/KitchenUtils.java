package by.itacademy.classwork.technics;

public class KitchenUtils {
    public static int getVoltage(Kitchen kitchen) {
        int result = 0;
        for (Devices d : kitchen.getDevices()) {
            if (d.isPlugged()) {
                result += d.getPower();
            }
        }
        return result;

    }
}
