public class Device {
    private int battery = 100;

    public void displayBatteryLife() {
        System.out.println("Current battery level: " + battery + "%" );
    }
    public int getBattery(){
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
