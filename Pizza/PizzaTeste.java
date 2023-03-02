package Pizza;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PizzaTeste {

    Pizza pizza;

    @Test
    public void testaPizzaBasica(){
        
        //Cria nova pizza básica
        pizza = new Pizza();

        //Verifica adicionais
        assertEquals(0, pizza.getAdicional());

        //Verifica o Valor total
        assertEquals(25, pizza.getValorTotal());

    }
    @Test
    public void testaAdicionaisMax(){

        // Cria uma nova pizza com 3 adicionais (12)
        pizza = new Pizza(3);

        // Verifica se o método adicionaisMax() retorna o valor correto
        assertEquals(12, pizza.adicionaisMax());

    }

    @Test
    public void testaPizzaCAdicionais(){
        
        //Cria nova pizza com 4 adicionais
        pizza = new Pizza(4);

        //Verifica adicionais
        assertEquals(4, pizza.getAdicional());

        //Verifica o Valor total
        assertEquals(41, pizza.getValorTotal());

    }

    @Test
    public void testaCalculaValorTotal(){

        // Cria uma nova pizza com 2 adicionais
        pizza = new Pizza(2);

        // Verifica se o método calculaValorTotal() retorna o valor correto
        assertEquals(33, pizza.calculaValorTotal());

    }

    /* 
    Não consegui realizar um test de um MÉTODO void para um string"
    @Test
    public void testaemiteNota(){
        pizza = new Pizza();

        if(pizza.getBasica() == true){

            System.out.println("Pizza Básica - R$25.00");

        }else{

            System.out.println("Pizza com adicionais - " + pizza.calculaValorTotal());

        }

    }*/
    
}
