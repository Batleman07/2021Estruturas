package Trab_01;

public class Carro {
   private	String nome ;
   private String cor;
   private String marca;
   
   public Carro(String nome,String cor, String marca) 
   {
	   this.nome =nome;
	   this.cor =cor;
	   this.marca=marca;
   }
   
   public String getNome() 
   {
	   return nome;
   }
   public String getCor() 
   {
	   return cor;
	   
   }
   public String getMarca() 
   {
	   return marca;
   }
}
