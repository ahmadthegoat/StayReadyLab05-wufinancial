package com.codedifferently.stayready;

public class Money {
    public static Double UStoEURO(Double n){
        Double converted = .94 * n;
        return Math.round(converted * 100.0) / 100.0;
    }
    public static Double EUROtoUS(Double n){
        Double converted = 1.0 * n;
        return Math.round(converted * 100.0) / 100.0;
    }
    public static Double EUROtoBRIT(Double n){
        Double converted = .82 * n;
        return Math.round(converted * 100.0) / 100.0;
    }
    public static Double BRITtoINDI(Double n){
        Double converted = 68.32 * n;
        return Math.round(converted * 100.0) / 100.0;
    }
    public static Double RUPEtoCANA(Double n){
        Double converted = 1.32 * n;
        return Math.round(converted * 100.0) / 100.0;
    }
    public static Double CANAtoSING(Double cana){
        return null;
    }
    public static Double SINGtoSWISS(Double sing){
        return null;
    }
    public static Double SWISStoMALAY(Double swiss){
        return null;
    }
    public static Double YENtoYUAN(Double yen){
        return null;
    }
}