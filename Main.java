package Trab_seg_bim;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]={"000000000100","001011110110","011100001000","101010110111","111010000111","111111111111"};
		String ex1 []={"000000000001","000100000000","111111111111"};	
		String ex2 []={"000000000100","001011110110","011100001000","101010110111","111010000111","111111111111"};
		
		
		PacoteView vis1 =new PacoteView(a);
		vis1.mostrarEvento();
		PacoteView vis2 =new PacoteView(ex1);
		vis2.mostrarEvento();
		PacoteView vis3 =new PacoteView(ex2);
		vis3.mostrarEvento();

		
		


	
	
		
	}
	

}
