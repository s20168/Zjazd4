package pl.edu.pjwstk.poj.Computable;

public class LambdaTest {

    public static void main(String[] args){
        Computable half = x -> x / 2;
        System.out.println(half.compute(2));
    }

}
