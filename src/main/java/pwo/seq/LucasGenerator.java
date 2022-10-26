/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.seq;

import java.math.BigDecimal;

/**
 * Generator rzadu Lucasa.
 */
public class LucasGenerator extends FibonacciGenerator {
/**
     * Tworzy nowa instancje.
     */
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);

    }
/**
     * Resetuje ciag do pierwszego elementu.
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);

    }
/**
     * @return Nastepny element rzadu Lucasa.
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);

        }
        return super.nextTerm();

    }
}
