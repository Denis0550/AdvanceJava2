package InnerClasses;

public class MethodInnerClass {
    public static void main(String[] args) {

        FootballClub f = new FootballClub();
        int value = f.CalculateFees(11);
        System.out.println(value);
    }
}

class FootballClub{
    String teamName;
    int numOfMembers;

    public int CalculateFees(int players){
        class Fees {
            int fee = 100;
            int discount = 200;
            int amount = 0;

            public void calculation() {
                amount = fee * players;
                if (players > 10) {
                    amount = amount - discount;
                }
            }
        }//inner class fee ends


        Fees objFees = new Fees();
        objFees.calculation();
        int answer = objFees.amount;

        return answer;
        }//method ends
}
