package com.kata;



import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;


public class TamagotchiTest {
    
    @Test
    public void test_WhenTamagochiEat_HungrineessDecreased()
    {
        Tamagotchi ada = new Tamagotchi();
        ada.eat();
        int currentHungriness = ada.getHungriness();
        assertThat(currentHungriness, is(value:3));
    }

    @Test
    public void test_WhenTamagochiEat_HungrineessIncreased()
    {
        Tamagotchi ada = new Tamagotchi();
        ada.eat();
        int CurrentFullness = ada.getFullness();
        assertThat(CurrentFullness, is(value:7));
    }

    @Test
    public void test_WhenTamagochiPlayHappineessDecreased()
    {
        Tamagotchi ada = new Tamagotchi();
        ada.play();
        int CurrentHappiness = ada.getHappiness();
        assertThat(ada, hasProperty(propertyName:"happiness"));
        assertThat(CurrentHappiness, is(value:7));
    }

    @Test
    public void test_WhenTamagochiPlayHappineessIncreased()
    {
        Tamagotchi ada = new Tamagotchi();
        ada.play();
        int CurrentTiredness = ada.getTiredness();
        assertThat(ada, hasProperty(propertyName:"tiredness"));
        assertThat(CurrentTiredness, is(value:7));
    }

    @Test
    public void test_WhenTamagochiPutToSleepHappineessDecreased()
    {
        Tamagotchi ada = new Tamagotchi();
        ada.putToSleep();
        int CurrentTiredness = ada.getTiredness();
        assertThat(CurrentTiredness, is(value:3));
    }

    @Test               
    public void test_WhenTamagochiMakePoopFullneessDecreased()
    {
        Tamagotchi ada = new Tamagotchi();
        ada.makeItPoop();
        int CurrentFullness = ada.getFullness();
        assertThat(CurrentFullness, is(value:3));
    }

    @Test               
    public void test_WhenTimePasessTirednessIsDecreased()
    {
        Tamagotchi ada = new Tamagotchi();
        ada.timePasess();
        int CurrentTiredness = ada.getHappiness();
        assertThat(CurrentHappiness, is(value:3));
    }


}
