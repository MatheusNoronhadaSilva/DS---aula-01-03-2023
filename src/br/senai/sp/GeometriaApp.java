package br.senai.sp;

import br.senai.sp.model.Triangulo;

public class GeometriaApp {

	public static void main(String[] args) {
		
		//criando um triângulo
		Triangulo t1 = new Triangulo();
		
		Triangulo t2 = new Triangulo();
		
		Triangulo t3 = new Triangulo();
	
		
		//Definindo as dimensões dos triângulos
		
		t1.nome = "Triângulo 001";
	    t1.base = 18; 
		t1.sideB = 15; 
		t1.sideC = 15; 
		t1.hight = 12;
		
		t2.nome = "Triângulo 002";
		t2.base = 10; 
		t2.sideB = 6; 
		t2.sideC = 8; 
		t2.hight = 8;
		
		t3.nome = "Triângulo 003";
		t3.base = 18;
		t3.sideB = 20;
		t3.sideC = 21;
		t3.hight = 14;
		
		//Mostar dimensões dos triângulos
		t1.mostrarDimensoes();
		
		t2.mostrarDimensoes();
		
		t3.mostrarDimensoes();
		
		
	}

}
