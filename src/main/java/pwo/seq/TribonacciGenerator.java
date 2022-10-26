/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.seq;


import java.math.BigDecimal;
/**
 * Generator rzadu Tribonacciego.
 */

public class TribonacciGenerator extends
        FibonacciGenerator {
     /**
     * Tworzy nowa instancje.
     */

    public TribonacciGenerator() {
        f_3 = new BigDecimal(0);
    }
/**
     * Resetuje ciag do pierwszego elementu.
     */
    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }
/**
     * @return Nastepny element rzadu Tribonacciego.
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }
        lastIndex++;
        return current;
    }
}