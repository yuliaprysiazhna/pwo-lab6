/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo;

import java.math.BigDecimal;

public class LucasGenerator implements IGenerator {

    private BigDecimal a = new BigDecimal(2);
    private BigDecimal b = new BigDecimal(1);
    private BigDecimal c = new BigDecimal(0);

    public BigDecimal GenerateLucasValues(int i) {
        c = a.add(b);
        a = b;
        b = c;
        return c;
    }

    @Override
    public BigDecimal getTerm(int i) {
        return GenerateLucasValues(i);
    }
}