/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opquebrados;

/**
 *
 * @author Fernando
 */
public class OpQuebrados {
    static Quebrado quebrado1;
    static Quebrado quebrado2;

    public OpQuebrados(Quebrado quebrado1, Quebrado quebrado2) {
        this.quebrado1 = quebrado1;
        this.quebrado2 = quebrado2;
    }

    public Quebrado getQuebrado1() {
        return quebrado1;
    }

    public void setQuebrado1(Quebrado quebrado1) {
        this.quebrado1 = quebrado1;
    }

    public Quebrado getQuebrado2() {
        return quebrado2;
    }

    public void setQuebrado2(Quebrado quebrado2) {
        this.quebrado2 = quebrado2;
    }
    
    public static Quebrado suma(){
    Quebrado n;
    double prenum1,prenum2,preden;
    int num, den;
    prenum1 = quebrado2.getDenominador() * quebrado1.getNumerador();
    prenum2 = quebrado2.getNumerador() * quebrado1.getDenominador();
    preden = quebrado2.getDenominador() * quebrado1.getDenominador();
    num = (int) ((int) prenum1 + prenum2);
    den = (int) preden;
    n = new Quebrado(num, den);
    
    return n;
    }
    public static Quebrado resta(){
    Quebrado n;
    double prenum1,prenum2,preden;
    int num, den;
    prenum1 = quebrado2.getDenominador() * quebrado1.getNumerador();
    prenum2 = quebrado2.getNumerador() * quebrado1.getDenominador();
    preden = quebrado2.getDenominador() * quebrado1.getDenominador();
    num = (int) ((int) prenum1 - prenum2);
    den = (int) preden;
    n = new Quebrado(num, den);
    
    return n;
    }
    
    public static Quebrado multiplicacion(){
    Quebrado n;
    double prenum,preden;
    int num, den;
    prenum = quebrado2.getNumerador()* quebrado1.getNumerador();
    preden = quebrado2.getDenominador() * quebrado1.getDenominador();
    num = (int)prenum;
    den = (int) preden;
    n = new Quebrado(num, den);
    
    return n;
    }
    public static Quebrado division(){
    Quebrado n;
    double prenum,preden;
    int num, den;
    prenum = quebrado2.getDenominador()* quebrado1.getNumerador();
    preden = quebrado2.getNumerador()* quebrado1.getDenominador();
    num = (int)prenum;
    den = (int) preden;
    n = new Quebrado(num, den);
    
    return n;
    }
    
}
