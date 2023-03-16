package by.itacademy.classwork.technics;

public class Main {
    public static void main(String[] args) {
        Kettle kettle = new Kettle(2);
        Fridge fridge = new Fridge(4);
        Fridge fridgeSecond = new Fridge(4);
        TV tv = new TV(3000);

        Devices [] devices = {kettle, fridge, tv};
        Kitchen kitchen = new Kitchen(devices);

        System.out.println(KitchenUtils.getVoltage(kitchen));
        kettle.plugIn();
        tv.plugIn();
        System.out.println(KitchenUtils.getVoltage(kitchen));
        kettle.plugOf();
        fridge.plugIn();
        fridgeSecond.plugIn();
        System.out.println(KitchenUtils.getVoltage(kitchen));


    }


}
