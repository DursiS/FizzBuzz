public class Reduce {

    static void main() {
        System.out.println(getStepsToZero(100));
    }

   static public Integer getStepsToZero(Integer n) {
        Integer Steps = 0;
        while (n > 0) {
            boolean is_even = false;
            if (n % 2 == 0) {
                n = n / 2;
                Steps++;
            } else {
                n--;
                Steps++;
            }
        }
        return Steps;
    }

}