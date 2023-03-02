
public class Pizza {
    
    //Atributos

    private boolean basica;
    private double adicional;
    private double valorTotal;
    //deve ter uma nota com descrição e valor


    //Construtores

    public Pizza (){
        this.basica = true ;
        this.adicional = 0;
        this.valorTotal = 25;
    }
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


    public double calculaValorTotal(){
        return this.adicionaisMax() + 25;
    }


/**
    *   Método para verificar número máximo de adicionais e devolve valor
**/

    public double adicionaisMax(){

        if(this.getAdicional() > 8 || this.getAdicional() < 0){
            System.out.println("Número de adicionais inválidos -- ERRO");
            return 0;
        }else{
            return adicional * 4;
        }
    }



    public void emiteNota (){

        if(this.getBasica() == true){

            System.out.println("Pizza Básica - R$25.00");

        }else{

            System.out.println("Pizza com adicionais - " + this.calculaValorTotal());

        }


    }
}
