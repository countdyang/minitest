/**
 * Created by countdyang on 7/14/2018.
 */
public class test {

    public void gameOutputStage1(int total){
        if(total < 1){
            System.out.println("Impossible.");
        }
        for(int i = 1; i <= total; i++){
            if((i%3 == 0)&&(i%5 == 0)){// meet both requirement
                System.out.println("FizzBuzz");
            }else if(i%3 == 0){ // multiples of 3
                System.out.println("Fizz");
            }else if(i%5 == 0){// multiples of 5
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
            boolean fizz = false;// whether a number meets stage 2 fizz requirement
            boolean buzz = false;// whether a number meets stage 2 buzz requirement
            if((i%3 == 0) || checkFizzBuzzCondition(i,3)){
                 fizz = true;
            }
            if((i%5 == 0) || checkFizzBuzzCondition(i,5)){
                buzz = true;
            }
            if(fizz && buzz){// a number that meets both requirements
                System.out.println("FizzBuzz");
            }else if(fizz == true && buzz == false){// only meet fizz requirement
                System.out.println("Fizz");
            }else if(fizz == false && buzz == true){// only meet buzz requirement
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    // Whether a number has a divisor in it.
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




