import java.util.Scanner;
public class Main2
{
    
    private int lotacao, totalandar, andar = 0, gente = 0;
    Scanner input = new Scanner ( System.in );
	Scanner input1 = new Scanner ( System.in );
    
    public void Inicializa(int lotacao2, int totalandar2){
        System.out.println("----------------------------------------");
        System.out.println(" ");
        System.out.println("Informe a lotacao máxima de pessoas: ");
        String pessoal = input.next();
        lotacao2 = Integer.parseInt(pessoal);
        this.lotacao = lotacao2;
        
        System.out.println("Informe o total de andares: ");
        String andando = input1.next();
        totalandar2 = Integer.parseInt(andando);
        this.totalandar = totalandar2;
        System.out.println(" ");
    }
    
    public void Entra(){
        if(this.gente < this.lotacao){
            this.gente = this.gente + 1;
        }else{
            System.out.println("O ellevador tá cheio");
        }    
    }
    
    public void Sai(){
        if(this.gente > 0){
            this.gente = this.gente - 1;
        }else{
            System.out.println("O elevador está vazio");
        }  
    }
    
    public void Sobe(){
        if(this.andar < this.totalandar){
            this.andar = this.andar + 1;
        }else{
            System.out.println("Você está no terraço");
        }
    }
    
    public void Desce(){
        if(this.andar > 0){
            this.andar = this.andar - 1;
        }else{
            System.out.println("Você está no térreo");
        }
        
    }
    
    public void Status(){
        System.out.println(" ");
        System.out.println("Total de andar do prédio: ");
        System.out.println(this.totalandar);
        System.out.println(" ");
        System.out.println("lotacao de pessoas no elevador: ");
        System.out.println(this.lotacao);
        System.out.println(" ");
        System.out.println("----------------------------------------");
        System.out.println(" ");
        System.out.println("Pessoas no elevador: ");
        System.out.println(this.gente);
        System.out.println(" ");
        System.out.println("Andar atual: ");
        System.out.println(this.andar);
        System.out.println(" ");
        System.out.println("----------------------------------------");
        System.out.println(" ");
    }
    
    
    public int getAndar(){
        return andar;
    }
    
    public int getlotacao(){
        return lotacao;
    }
    
    public int getTotalandar(){
        return totalandar;
    }
    
    public int getPessoas(){
        return gente;
    }
    
    public void setAndar(){
        this.totalandar = this.totalandar;
    }
    
    public void setlotacao(){
        this.lotacao = this.lotacao;
    }
    
    public void setTotalandar(){
        this.totalandar = this.totalandar;
    }
    
    public void setPessoas(){
        this.gente = this.gente;
    }
    
	public static void main(String[] args) {
	    Main elevador = new Main();
	    elevador.Inicializa(1, 2);
	    while(true){
    	    Scanner inserircase = new Scanner ( System.in );
    	    System.out.println("----------------------------------------");
    	    System.out.println(" ");
    	    System.out.println("1 - Pessoa entra no elevador. ");
    	    System.out.println("2 - Pessoa sai no elevador. ");
    	    System.out.println("3 - Elevador sobe");
    	    System.out.println("4 - Elevador desce");
    	    System.out.println("5 - Sair do programa. ");
    	    System.out.println(" ");
    	    elevador.Status();
    	    String switch = inserircase.next();
    	    int ab = Integer.parseInt(switch);
    	    switch(ab){
    	        case 1:
    	            elevador.Entra();
    	            break;
    	        case 2:
    	            elevador.Sai();
    	            break;
    	        case 3:
    	            elevador.Sobe();
    	            break;
    	        case 4:
    	            elevador.Desce();
    	            break;
    	        case 5:
    	            System.exit(0);
    	            break;
    	    }  
    	    elevador.Status();
    	        
	    }
	}
	
}