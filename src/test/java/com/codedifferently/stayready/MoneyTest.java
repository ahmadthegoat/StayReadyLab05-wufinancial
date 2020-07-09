package com.codedifferently.stayready;

import org.junit.Assert;
import org.junit.Test;

public class MoneyTest {


    @Test
    public void UStoEuroTest(){
        // Given
        Money money = new Money();

        // When
        Double expected = .94;
        Double actual = money.UStoEURO(1.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void EUROtoUS(){
        // Given
        Money money = new Money();

        // When
        Double expected = .94;
        Double actual = money.EUROtoUS(1.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void EUROtoBRIT(){
        // Given
        Money money = new Money();

        // When
        Double expected = .82;
        Double actual = money.EUROtoBRIT(1.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void BRITtoINDITest(){
        // Given
        Money money = new Money();

        // When
        Double expected = 68.32;
        Double actual = money.BRITtoINDI(1.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void RUPEtoCANA(){
        // Given
        Money money = new Money();

        // When
        Double expected = 90.18;
        Double actual = money.RUPEtoCANA(68.32);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }
    
}