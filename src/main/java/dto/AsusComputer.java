package dto;

public class AsusComputer extends Computer {
    public AsusComputer(Ram ram, Hdd hdd) {
        super(ram, hdd);
    }

public AsusComputer(int ram, int hdd) {

}
    public void work() {
        System.out.println("Я асус");
    }

    @Override
    public void on() {
        super.on();
    }
}
