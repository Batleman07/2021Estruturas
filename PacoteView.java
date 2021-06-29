package Trab_seg_bim;

public class PacoteView {
	Pacote pack;
	public PacoteView(String []a) {		
		super();
		setPack(a);
	}
	
	
	public void setPack(String []a) {
		this.pack =new Pacote(a);
	}
	public  void mostrarEvento() {
		if (pack.getStatus()==1) {
			System.out.println("Foram detectados e recebidos "+pack.getNpacotes()+" para leitura de informa��es:");
			mostraPackrecebidoOrdenado();
			System.out.println("O valor convertido atrav�s dos pacotes recebidos �: "+pack.getValorContidoPacotes());
		}else {
			System.out.println("O n�mero de pacotes recebidos n�o esta de acordo com o valor informado no begin: Programa encerrado! ");
			pack.parada();
			
		}
		
	}
	
	public void mostraPackrecebidoOrdenado() {
		for ( int i=0;i<pack.getNpacotes();i++) {
			System.out.println((i+1)+"� Pacote : "+pack.getStrPacotes(i));
		}
	}
	

}
