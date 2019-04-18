public class Main {

    public static void main(String[] args) {
        //测试题完成
        for(int i=1;i<101;i++){
             if(i%3 == 0 && i%5 != 0){
                 System.out.println("Fizz");
             }else if (i%3 != 0 && i%5 == 0){
                 System.out.println("Buzz");
             }else if (i%3 == 0 && i%5 == 0){
                 System.out.println("FizzBuzz");
             }else{
                 System.out.println(i);
             }
        }
        System.out.println("================================");
        for (int i=1;i<101;i++){
            if (i%3 == 0 && (i-3)%10== 0){
                System.out.println(i);
            }
        }
        System.out.println("================================");
        for (int i=1;i<101;i++){
            if (i%3 != 0 && i%5 == 0 && (i-5)%10== 0){
                System.out.println(i);
            }
        }
        System.out.println("================================");
        for(int i=1;i<101;i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println(i);
            }
        }
    }
}
