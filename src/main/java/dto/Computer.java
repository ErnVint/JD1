package dto;

public class Computer implements IComputer {
    private Ram ram;
    private Hdd hdd;
    public Computer (Ram ram, Hdd hdd) {

        this.ram = ram;
        this.hdd = hdd;
    }
    public void on() {

        System.out.println("on");
  }
    public void off() {
        System.out.println("off");
    }
    public void reset() {
        System.out.println("reset");
    }
    public void work() {
        System.out.println("work");
    }
}