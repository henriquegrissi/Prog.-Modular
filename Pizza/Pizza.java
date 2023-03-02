package Pizza;

/**
 * Classe Pizza, criada baseada no enunciado do Exercício 1
 * @author Henrique Grissi
 * 
 */
public class Pizza {
    
    //Atributos
    private boolean basica;
    private double adicional;
    private double valorTotal;


    //Construtores
    /**
     * Construtor de Pizza Básica
     */
    public Pizza (){
        this.basica = true ;
        this.adicional = 0;
        this.valorTotal = 25;
    }
    /**
     * Construtor de Pizza com adicionais
     * @param adicional Quantidade de adicionais
     */
    public Pizza (double adicional){

        this.basica = false;
        this.adicional = adicional;
        this.valorTotal = calculaValorTotal();

    }
    
    //Getters
    public boolean getBasica(){
        return basica;
    }
    public double getAdicional(){
        return adicional;
    }
    public double getValorTotal(){
        return valorTotal;
    }

    /**
     * Método que Calcula o valor total da pizza.
     * @return Valor total da PIZZA
     */
    public double calculaValorTotal(){
        return this.adicionaisMax() + 25;
    }


/**
    *   Método para verificar número máximo de adicionais e devolve valor
    * @return Valor total dos ADICIONAIS
**/

    public double adicionaisMax(){

        if(this.getAdicional() > 8 || this.getAdicional() < 0){
            System.out.println("Número de adicionais inválidos -- ERRO");
            return 0;
        }else{
            return adicional * 4;
        }
    }


    /**
     *  
     * Método da emissão da Nota, descrição do tipo de Pizza (Básica ou com adicionais) e o seu valor! 
     */

    public void emiteNota (){

        if(this.getBasica() == true){

            System.out.println("Pizza Básica - R$25.00");

        }else{

            System.out.println("Pizza com adicionais - " + this.calculaValorTotal());

        }


    }
}
