package fr.rouen.mastergil.tptest;

import org.junit.jupiter.api.Test;

import static fr.rouen.mastergil.tptest.Devise.DINAR;
import static fr.rouen.mastergil.tptest.Devise.EURO;
import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    public void shouldbePositif() {
        /*//Given
        int montant ;
        boolean expected = false;
        boolean result ;
        Money money = new Money(-100, EURO);
        //When
        result  = money.isPositif();
        //Then
       assertEquals(expected,result);*/
        //autre Méthode :
        //given
        Money compt= new Money();
        //when
        compt.setMontant(1);
        //then
        assertTrue(compt.isPositif());
        compt.setMontant(-1);
        assertFalse(compt.isPositif());

    }

    @Test
    public void shouldInstanceMoneyMontantZEROetDeviseEURO() {
        //Given
        Money money;
        //When
        money = new Money();
        //Then
        assertEquals(money.getMontant(),0);
        assertEquals(money.getDevise(),EURO);
    }

    @Test
    public void shouldinstanceMoneyWithDefinedValues() {
        //Given
        Money money ;
        int montant = 100 ;
        Devise devise = DINAR ;
        //When
        money = new Money(montant,devise);
        //Then
        assertEquals(money.getDevise(),devise);
        assertEquals(money.getMontant(),montant);

    }

    @Test
    public void shouldThrowErrorWhenDeviseNULL() {
        //Given
        int montant = 100 ;
        Devise devise = null;
        Money money ;
        //When
        money = new Money();
        money.setMontant(montant);
        money.setDevise(devise);
        //Then
        assertThrows(IllegalArgumentException.class,()-> {money.setDevise(devise);});
    }

}


/*
* assertions -> assertj
* JavaCodeCoverage -> JaCoCo
* Les getters/setters pas lapaine de les tester sauf si ils
* porte une certaine logics
* */