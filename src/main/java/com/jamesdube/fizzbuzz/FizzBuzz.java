package com.jamesdube.fizzbuzz;

class FizzBuzz {

    void play(int start, int end){

        for(int i = start ; i <= end ; i++){
            System.out.print(checkFizzBuzz(i) + " ");
        }
    }


    String checkFizzBuzz(int number) {

        String answer = String.valueOf(number);

        if (number % 5 == 0 && number % 7 == 0) answer = "fizzbuzz";
        else if (number % 5 == 0) answer = "fizz";
        else if (number % 7 == 0) answer = "buzz";

        return answer;
    }
}
