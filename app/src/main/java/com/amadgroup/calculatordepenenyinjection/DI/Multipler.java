package com.amadgroup.calculatordepenenyinjection.DI;

import dagger.Module;

import javax.inject.Inject;

@Module
public class Multipler {
    private boolean supportNegative = false;

    @Inject
    public Multipler(){
    }

    public void setSupportNegativeNumber(boolean support){
        supportNegative = support;
    }

    public Double multiply (Double num1 , Double num2){
        if(supportNegative == true){
            return multiplyNegative(num1 , num2);
        }
        return multiplyPositive(num1,num2);
    }

    public Double multiplyPositive (Double num1 , Double num2){
        if(num1 > num2){
            return num1 * num2;
        }
        return num2 * num1;
    }
    public Double multiplyNegative (Double num1 , Double num2){
        return num1 * num2;
    }
}
