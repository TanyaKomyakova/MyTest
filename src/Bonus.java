public class Bonus {
    public static void main(String[] args){
        int replenishment = 1110;
        int bonus;

        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int balance = 100;
        int sum = balance + replenishment + bonus;


        System.out.println(sum);
    }
}


