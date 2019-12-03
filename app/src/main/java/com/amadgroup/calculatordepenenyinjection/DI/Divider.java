package com.amadgroup.calculatordepenenyinjection.DI;

import dagger.Module;

import javax.inject.Inject;

@Module
public class Divider {
    private boolean supportNegative = false;

    @Inject
    public Divider(){
    }

    public void setSupportNegativeNumber(boolean support){
        supportNegative = support;
    }

    public Double divide (Double num1 , Double num2){
        if(num2 == 0){
            return 0.0;
        }
        return num1 / num2 ;
    }

}
