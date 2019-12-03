package com.amadgroup.calculatordepenenyinjection.DI;

import dagger.Module;
import dagger.Provides;

import javax.inject.Inject;

@Module
public class Subscriber {

    private boolean supportNegative = false;

    @Inject
    public Subscriber(){
    }

    public void setSupportNegativeNumber(boolean support){
        supportNegative = support;
    }

    public Double substract (Double num1 , Double num2){
        if(supportNegative == true){
            return subtractNegative(num1 , num2);
        }
        return subtractPositive(num1,num2);
    }

    public Double subtractPositive (Double num1 , Double num2){
        if(num1 > num2){
            return num1 - num2;
        }
        return num2 - num1;
    }
    public Double subtractNegative (Double num1 , Double num2){
        return num1 - num2;
    }
}
