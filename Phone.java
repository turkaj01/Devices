public class Phone extends Device{

    public void makeCall() {
        int currentBatery = getBattery();
        currentBatery-=5;
        if(currentBatery<0) currentBatery=0;
        setBattery(currentBatery);

        if (getBattery()<10){
            System.out.println("Battery critical! Please charge your phone.");
        }
        System.out.println("Making a call. Battery remaining: " + getBattery() + "%");
    }
    public void  playGame() {
        int currentBattery = getBattery();
        if(currentBattery>=25) {
            currentBattery -= 20;
            setBattery(currentBattery);
            if (currentBattery < 0) currentBattery = 0;

            if(getBattery()<10) {
                System.out.println("Battery critical! Please charge your phone");
            }
            System.out.println("Playing a game. Battery remaining: " + getBattery() + "%");
        }
        else {
            System.out.println("Battery lower then 25%, please charge your phone.");
        }
    }
    public void charge(){
        int currentBattery=getBattery();
        currentBattery+=50;
        setBattery(currentBattery);
        if(currentBattery>100) currentBattery=100;
        System.out.println("Charging the phone. Battery remaining: " + getBattery() + "%");
    }

}
