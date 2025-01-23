// concrete handler
public class Armor implements Defense {

    private Defense nextDefense;
    private int def;

    public Armor() {
    }

    public Armor(int def) {
        this.def = def;
    }

    @Override
    public void defense(Attack attack) {
        /**
         * Point!
         * 다음 프로세스를 무조건 불러온다.
         */
        process(attack);

        if (nextDefense != null) {
            nextDefense.defense(attack);
        }
    }

    private void process(Attack attack) {
        int amount = attack.getAmount();
        amount -= def;
        attack.setAmount(amount);
    }

    public void setNextDefense(Defense nextDefense) {
        this.nextDefense = nextDefense;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
