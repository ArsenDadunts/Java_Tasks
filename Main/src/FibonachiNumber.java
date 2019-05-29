public class FibonachiNumber {
    public static void main(String[] args) {
        fibonachiNumber(5);
    }

    public static void fibonachiNumber(int num) {
        int num1=0;
        int num2=1;
        int result=0;
        for (int i = 0; i <num; i++) {
            if(num<=1){
                result=num;
            }else{
                result=num1+num2;
                num1=num2;
                num2=result;
            }
        }
        System.out.println(result);
    }
}
