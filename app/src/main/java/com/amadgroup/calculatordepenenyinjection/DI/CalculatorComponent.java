package com.amadgroup.calculatordepenenyinjection.DI;

import dagger.Component;

@Component (modules = { Adder.class , Subscriber.class , Multipler.class , Divider.class})
public interface CalculatorComponent {
    public Adder getAdder();
    public Subscriber getSubscriber();
    public Divider getDivider();
    public Multipler getMultipler ();
}
