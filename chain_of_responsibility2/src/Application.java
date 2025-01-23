public class Application {
    public static void main(String[] args) {
        Attack attack = new Attack(100);

        Armor armor1 = new Armor(10);
        Armor armor2 = new Armor(15);

        armor1.setNextDefense(armor2);

        armor1.defense(attack);

        System.out.println(attack.getAmount());

        /**
         * point 2!
         * 동적으로 책임을 추가할 수 있다.
         */
        Defense newArmor = new Defense() {
            @Override
            public void defense(Attack attack) {
                attack.setAmount(attack.getAmount() - 50);
            }
        };

        Attack attack2 = new Attack(100);

        armor2.setNextDefense(newArmor);

        armor1.defense(attack2);

        System.out.println(attack2.getAmount());
    }
}
