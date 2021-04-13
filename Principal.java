package Trab_01;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
	Carro c1 = new Carro("eleonor","vermelho","Mustang");
	Carro c2 = new Carro("Diablo","amarelo","Lamborgini");
	Carro c3 = new Carro("grant","preto","ferrari");
	Carro c4 = new Carro("fusca","azul","volkswagen");
	List<Carro> l = new ArrayList<Carro>();
	
	l.add(c1);
	l.add(c2);
	l.add(c3);
	l.add(c4);
	
	buble(l);

	}

}
