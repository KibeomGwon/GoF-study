package system;

// default : package에서만 접근 가능
class HelpSystem01 {
    public HelpSystem01() {
        System.out.println("Call Constructor : " + getClass().getSimpleName());
    }

    public void process() {
        System.out.println("Call Process : " + getClass().getSimpleName());
    }
}
