package TP1 ;
public class ecercice2 {
	public<T extends Number> Double somme (T[] tab)
	{
		double total=0;
		for (int i=0; i < tab.length;i++ )
		{ total += tab [i].doubleValue();}
		return total;
		
	}

}
