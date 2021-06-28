package Trab_seg_bim;



public class Pacote {
  
   
  private int nPacotes;  
  private int nPacotesRec;
  private String begin;
  private int    posBegin;
  private String end;
  private int posEnd;
  private int status;
  private String bigBuffer;
  private String sinal;
  private int casasDecimais;
  private Double numeroDecimalFinal;
  private String valorContidoPacotes;
  
  private List <String>identfy=new ArrayList<>();
  private List <String>buffer=new ArrayList<>();
 
  
     
  List<String> L = new ArrayList<>();
  List<String> strPacotes =new ArrayList<>();
  
  
  
  public Pacote(String [] array) 
  
  {
	  nPacotesRec(array);
	  setNpacotes();
	  /**
	   * procura "end", retorna posição e string para as respectivas variaveis e alimenta o array ordenar;
	   */
	  procuraEnd(array);
	  ordenando();
	  setIdentfy();
	  setBuffer();
	  certificarPacotes();
	  setBigBuffer();
	  setSinal();
	  setCasasDecimais();
	  setNumeroDecimalFinal();
	  setValorContido();
	  
	  
	  
  }
  
  
  
  /**
   * procura o pacote begin  e mostra  quantos pacotes existem
   * */
 
  
  
  
  public int procuraBegin() {
	  for(int i=0;i<nPacotesRec;i++) {
		  if (L.get(i).substring(0,4).equalsIgnoreCase("0000")) {
			  setBegin(L.get(i));
			   
			  setPosBegin(i);
			  return cBinarioDec(L.get(i),5,12);
			   
		  }
	  }
	  return 0;
	  
  }
  
  
  
  
  
  
  
  
  public void procuraEnd(String [] array) {
	  
	  for (int i = posBegin+1;i<=nPacotesRec;i++) {
		  String teste= array[i].substring(0,4);
		  if(teste.equalsIgnoreCase("1111")==false) {
			  strPacotes.add(array[i]);
		  }else {
			  posEnd=i;
			  this.end=array[i];
			  break;
		  }
		  
	  }
	  
  }
  
  
  
  
  
  public void nPacotesRec(String []array){
		 nPacotesRec=array.length;
		 for(int i=0;i<nPacotesRec;i++) {
			  L.add(array[i]);
		  }
		  
  }
  
  
   
  
/**
 * converte binario em decimal
 * */
  public int cBinarioDec(String bin,int a, int b) {
	  
	return Integer.parseInt(bin.substring(a,b), 2);
	  
  }
 
  
  
  
  

 
/**
 * numero de pacotes funcionais
 * */  

  public void setBegin(String begin) {
	  this.begin= begin;
  }
  
  public void setNpacotes() {
	  
	  this.nPacotes = procuraBegin();
  }
  
  public void setPosBegin(int posBegin) {
	  this.posBegin= posBegin;
  }
  
  public void ordenando() {
	  String aux;
	  for (int i=0;i<strPacotes.size();i++) {
		  for(int j=0;j<strPacotes.size();j++) {
			  if(cBinarioDec(strPacotes.get(i),0,4)>cBinarioDec(strPacotes.get(j),0,4));
			  aux= strPacotes.get(i);
			  strPacotes.set(i, strPacotes.get(j));
			  strPacotes.set(j, aux);			  
		  }
	  }
	  
  }
  public void setIdentfy() {
	  for (int i=0;i<strPacotes.size();i++) {
		  identfy.add(strPacotes.get(i).substring(0, 4));		  
	  }
  }
  public void setBuffer() {
	  for (int i=0;i<strPacotes.size();i++) {
		  buffer.add(strPacotes.get(i).substring(4, 12));		  
	  }
	  
  }
  
  /**
   * definindo a soma dos buffers
   *
   * */  public void setBigBuffer() {
	  if(status==1) {
		  for (int i=0;i<buffer.size();i++) {
			  if(this.bigBuffer==null){
				  this.bigBuffer=buffer.get(i);
		      }else {
		    	  bigBuffer= bigBuffer.concat(buffer.get(i));
		      }
		  }
	  }
  }


  public void setSinal() {
	  if(bigBuffer.substring(0,1).equalsIgnoreCase("1")) {
		  sinal="-";		  
	  }else {
		  sinal="+";
	  };
  }
  
  public void setCasasDecimais() {
	  casasDecimais=   cBinarioDec(bigBuffer, 1, 4)  ;
	 	  
  }
  public void setValorContido() {
	  if (this.sinal.equalsIgnoreCase("+")) {
		  valorContidoPacotes=String.format ("% ."+String.valueOf(casasDecimais)+"f", numeroDecimalFinal/(Math.pow(10,casasDecimais)) );
	  }else {
		  
	  }valorContidoPacotes=String.format ("% ."+String.valueOf(casasDecimais)+"f", numeroDecimalFinal/(Math.pow(-10,casasDecimais)));
  }
  public void setNumeroDecimalFinal() {
	  numeroDecimalFinal= (double) cBinarioDec(bigBuffer, 4, bigBuffer.length()) ;//bigBuffer.substring(3,15);
	 	  
  }
  /**
   * conferindo a quantidade de pacotes e enviando status
*/public void certificarPacotes() {
	 if(nPacotes==strPacotes.size()) 
	 {
		 this.status=1;
	 }else {
		 this.status=0;
	 }
  }
  
  
  public void mostrar() {
	  System.out.println(begin);
	  for(int i=0;i<strPacotes.size();i++) {
		  System.out.println("Pacote "+(i+1)+" "+strPacotes.get(i));
	  }
	  System.out.println(end);
	  
	  /*
	  System.out.println(Integer.toString( nPacotes)+ Integer.toString(nPacotesRec)+
  "|"+begin+"|"+
  Integer.toString (posBegin)+
  end+ Integer.toString(strPacotes.size())+posEnd+strPacotes.size());
	  for (int i=0;i<strPacotes.size();i++) {
	  System.out.println(cBinarioDec(strPacotes.get(i), 0, 4));
	  }
	  for (int i=0;i<strPacotes.size();i++) {
		  System.out.println(identfy.get(i));
		  System.out.println(buffer.get(i));
		  }
	  System.out.println("dfgs");
	  System.out.println(bigBuffer);
	  System.out.println(buffer.get(0));
//	  System.out.println(buffer.get(3));
	
	  System.out.println(sinal);

	  System.out.println(casasDecimais);
//	  int casa=0;
//	  System.out.print(String.format ("% ."+String.valueOf(casa)+"f", numeroDecimalFinal/-1000 ));
	  System.out.print(valorContidoPacotes);
	  System.out.print( "");
*/
  }
  
  /**
   * método de parada
   * */
  public void parada() {
	  System.exit(0);
  };

}




