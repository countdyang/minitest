/**
 * Created by countdyang on 7/14/2018.
 */
public class test {

    public void gameOutputStage1(int total){
        if(total < 1){
            System.out.println("Impossible.");
        }
        for(int i = 1; i <= total; i++){
            if((i%3 == 0)&&(i%5 == 0)){
                System.out.println("FizzBuzz");
            }else if(i%3 == 0){
                System.out.println("Fizz");
            }else if(i%5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    public void gameOutputStage2(int total){
        if(total < 1){
            System.out.println("Impossible.");
        }
        for(int i = 1; i <= total; i++){
            if((i%3 == 0)&&(i%5 == 0)){
                System.out.println("FizzBuzz");
            }else if((i%3 == 0) || checkFizzBuzzCondition(i,3)){
                System.out.println("Fizz");
            }else if((i%5 == 0) || checkFizzBuzzCondition(i,5)){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    public boolean checkFizzBuzzCondition(int dividen, int divisor){
        while(dividen % 10 != 0){
            int temp = dividen % 10;
            if(temp == divisor){
                return true;
            }
            dividen /= 10;
        }
        return false;
    }

}




