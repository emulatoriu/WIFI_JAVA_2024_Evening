package logic;

import logic.fizzbuzz.FizzBuzzCheck;

import java.util.List;

public class Runner {
    private final List<FizzBuzzCheck> checker;

    public Runner(List<FizzBuzzCheck> checker) {
        this.checker = checker;
    }

    public void run() {
        boolean match = false;
        for (int i=1; i<= 100; i++) {
            for(FizzBuzzCheck check : checker) {
                if(check.check(i)) {
                    check.print();
                    match = true;
                    break;
                }
            }
            if(!match){
                System.out.println(i);
            }
            match = false;
        }
    }
}
