package com.dio.base;

import java.math.BigDecimal;

/**
 * @author vikmiranda
 * @version 1.0.0
 * @see BigDecimal
 * @since Release 1.0.0
 */
public class Order {

    //representa o codigo do pedido
    private final String code;
    private final BigDecimal totalValue;
    private String[] items;

    /**
     * Construtor da classe
     *
     * @param code Código do pedido
     * @param totalValue Valor total do pedido
     * @param items
     */
    public Order(String code, BigDecimal totalValue, String[] items){
        this.code = code;
        this.totalValue = totalValue;
        this.items = items;
    }

    /**
     * Calcula valor total de acordo com o pedido. Se o valor for maior que $100 uma taxa será cobrada.
     *
     * @return Valor total do pedido com as taxas calculadas
     * @throws RuntimeException Se o valor do pedido for um valor negativo
     */
    public BigDecimal calculateFee() throws RuntimeException{
        if(this.totalValue.signum() < 0){
            throw  new RuntimeException("O pedido não pode ter valor negativo");
        }
        if(this.totalValue.compareTo(new BigDecimal("100.000") > 100)){
            return this.totalValue.multiply(new BigDecimal("0.99"));
        }
        return this.totalValue;
    }

    //laço while
//    public void printItems(){
//        int i = 0;
//        do {
//            System.out.println(items[i]);
//            i++;
//        }while (i < items.length);
//    }
        //laço for
//    public void printItems(){
//        for(int i=0; i< items.length; i++){
//            System.out.println(items[i]);
//        }
//    }

    //enchanted for
    public void printItems(){
        for (String i : items){
            System.out.println(i);
        }
    }




    @Override
    public String toString() {
        return "Order{" +
                "code='" + code + '\'' +
                '}';
    }
}
