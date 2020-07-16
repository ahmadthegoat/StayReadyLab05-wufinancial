package com.codedifferently.stayready;

public class Money {
    public static Double UStoEURO(Double n){
        Double converted = n - (.06 * n);
        return Math.round(converted * 100.0) / 100.0;
    }
    public static Double EUROtoUS(Double n){
        Double converted = n + (.06 * n);
        return Math.round(converted * 100.0) / 100.0;
    }
    public static Double EUROtoBRIT(Double n){
        Double converted = n - (.12 * n);
        return Math.round(converted * 100.0) / 100.0;
    }
    public static Double BRITtoINDI(Double n){
        Double converted = n + (68.5 * n);
        return Math.round(converted * 100.0) / 100.0;
    }
    public static Double RUPEtoCANA(Double n){
        Double converted = n - (68 * n);
        return Math.round(converted * 100.0) / 100.0;
    }
    public static Double CANAtoSING(Double CANA){
        Double SING = CANA + (.11 * CANA);
        return SING;
    }
    public static Double SINGtoSWISS(Double SING){
        Double SWISS = SING - (.42 * SING);
        return SWISS;
    }
    public static Double SWISStoMALAY(Double SWISS){
        Double MALAY = SWISS + (3.46 * SWISS);
        return MALAY;
    }
    public static Double YENtoYUAN(Double YEN){
        Double YUAN = YEN - (109.92 * YEN) ;
        return YUAN;
    }
}