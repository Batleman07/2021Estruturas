package Trab_01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ordenacao<Carro> implements Sort , Comparator<Carro>{

	public void buble (List<Carro> c) {
		int b;
		Carro d2 ;
		if(!c.isEmpty()) 
		{
			
			
			
			for(int i = 0; i<=c.size()-1  ; ++ i) 
			{
				if(compare(c.get(i),c.get(i+1))==1)
				{ 
					
					d2 =c.get(i);
					c.add(i,c.get(i+1));
				}
				for(int j = 0;j<=c.size()-1 ; ++j) 
				{
					System.out.println(c.get(j));
				}
			}
		}
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compare(Carro o1, Carro o2) {
		
		return 0;
	}

	@Override
	public void buble() {
		// TODO Auto-generated method stub
		
	}



}
