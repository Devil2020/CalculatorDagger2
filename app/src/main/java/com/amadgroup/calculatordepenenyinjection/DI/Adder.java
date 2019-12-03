package com.amadgroup.calculatordepenenyinjection.DI;

import dagger.Module;

import javax.inject.Inject;

@Module
public class Adder {
    private boolean supportNegative = false;

    @Inject
    public Adder(){
    }

    public void setSupportNegativeNumber(boolean support){
        supportNegative = support;
    }

    public Double add (Double num1 , Double num2){
        if(supportNegative == true){
            return addNegative(num1 , num2);
        }
        return addPositive(num1,num2);
    }

    public Double addPositive (Double num1 , Double num2){
        if(num1 > num2){
            return num1 + num2;
        }
        return num2 + num1;
    }
    public Double addNegative (Double num1 , Double num2){
        return num1 + num2;
    }
}
