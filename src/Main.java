public class Main {
    public static void main(String[] args) {
        int[] highTemp = {45, 29, 10, 22, 41, 28, 33};
        int[] precProb = {95,60,25,5,0,75,90};
        String[] dayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday"};
        int dayLength = dayWeek.length;
            for(int i = 0;i < dayLength; i++) {
                if (highTemp[i] <= 32 && precProb[i] > 50) {
                   System.out.println(dayWeek[i]);
                }
            }
        }
    }