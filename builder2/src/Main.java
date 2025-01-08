public class Main {
    public static void main(String[] args) {
        Computer computer = ComputerBuilder.start()
                .setCpu("i7")
                .setRam("16g")
                .setStorage("256g ssd")
                .build();

        System.out.println(computer.toString());
    }
}
