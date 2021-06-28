package Trab_seg_bim;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]={"000000000100","001011110110","011100001000","101010110111",
				"111010000111","111111111111"};
		String ex1 []={"000000000001","000100000000","111111111111"};
		
		String ex2 []={"000000000100","001011110110","011100001000","101010110111","111010000111","111111111111"};
		
		
		
		Pacote pacotes1= new Pacote( a );
		pacotes1.mostrar();
		Pacote pacotes2= new Pacote( ex1 );
		pacotes2.mostrar();
		Pacote pacotes3= new Pacote( ex2 );
		pacotes3.mostrar();

	
	
		
	}
	

}
