package org.generation.italy.geometria;

public class Rettangolo {
	int base;
	int altezza;
	
	public Rettangolo(int base, int altezza){
		this.base=base;
		this.altezza=altezza;
	}
	
	public  int perimetro(int base, int altezza) {
		int perimetro=((base*2)+(altezza*2));
		return perimetro;
	}
	
	public int area(int base, int altezza) {
		int area=base*altezza;
		return area;
	}
}
