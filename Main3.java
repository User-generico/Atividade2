import java.util.Scanner;

public class Main
{
    private double hentrada = 0, hsaida = 0, calculo = 0, aux = 0; 
    private double preco = 0;
    private int placa = 0;
    private String modelo = "Corsa";
    Scanner input = new Scanner ( System.in );
    
    public void setmodelo(String modelo){
            System.out.println(" ");
            System.out.println("Informe o modelo: ");
            String omodelo = input.next();
            this.modelo = omodelo;
        }

    public void setplaca(int placa){
        System.out.println("Informe a placa: ");
        String aplaca = input.next();
        int plaquinha = Integer.parseInt(aplaca);
        this.placa = plaquinha;
    }
    
    
    public void setCalculaHora(double hentrada, double hsaida, double calculo, double preco, double aux){
        System.out.println(" ");
        System.out.println("Informe o horário de chegada: ");
        String hentra = input.next();
        int horae = Integer.parseInt(hentra);
        this.hentrada = horae;
        System.out.println(" ");
        System.out.println("Informe o horário de saída: ");
        String hsai = input.next();
        int horas = Integer.parseInt(hsai);
        this.hsaida = horas;
        if(this.hentrada > 23 || this.hsaida > 23){
            System.out.println("Horario fora de 24 horas. ");
        }
        if(this.hentrada < this.hsaida){
            this.calculo = this.hsaida - this.hentrada;
            this.preco = this.calculo * 1.5;
        }else{
            this.aux = 24 - this.hentrada;
            this.calculo = this.aux + this.hsaida;
            this.preco = this.calculo * 1.5;
        }
        
    }
    
    
    public int getplaca(){
        return this.placa;
    }
    
    public String getmodelo(){
        return this.modelo;
    }
    
    public double gethentrada(){
        return this.hentrada;
    }
    
    public double gethsaida(){
        return this.hsaida;
    }
    
    public double gethoras(){
        return this.calculo;
    }
    
    public double getpreco(){
        return this.preco;
    }
    
	public static void Main3(String[] args) {
		Main estacionamento = new Main();
		estacionamento.setplaca(1);
		estacionamento.setmodelo("Corsa");
		estacionamento.setCalculaHora(1,2,3,4,5);
		System.out.println(" ");
		System.out.println("Placa: " + estacionamento.getplaca());
		System.out.println(" ");
		System.out.println("Modelo: " + estacionamento.getmodelo());
		System.out.println(" ");
		System.out.println("Horário de entrada: " + estacionamento.gethentrada());
		System.out.println(" ");
		System.out.println("Horário de saída: " + estacionamento.gethsaida());
		System.out.println(" ");
		System.out.println("Horas ocupadas no estacionamento: " + estacionamento.gethoras());
		System.out.println(" ");
		System.out.println("Valor total a ser pago: R$" + estacionamento.getpreco() + " reais");
	}
}