package fr.unistra.fizzbuzz;

public class FizzBuzz implements Int2String{

    public String convert(int number) {
        if(number%3==0 && number%5==0)return "FIZZBUZZ";
        else if(number%3==0)return "FIZZ";
        else if(number%5==0)return "BUZZ";
        return Integer.toString(number);
    }
}