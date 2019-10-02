import dto.Computer;

public class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer("Asuss");
        c1.getName("Asus");
        c1.setHddMb(500);
        c1.setRamMb(1024);
        System.out.println("hdd = " + c1.getHddMb() + "ram = " + c1.getRamMb());

        Computer c2 = new Computer("Leno");
        c2.getName("Lenovo");
        c2.setHddMb(500);
        c2.setRamMb(1024);
        System.out.println("hdd = " + c2.getHddMb() + "ram = " + c2.getRamMb());

    }

}
