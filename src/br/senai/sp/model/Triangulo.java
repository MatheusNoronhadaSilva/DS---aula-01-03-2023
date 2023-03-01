package br.senai.sp.model;

public class Triangulo {
	
    //Propiedades/atributos da classe
	public int base;
	public int sideB;
	public int sideC;
	public int hight;
	public String nome;
	public int area;
	
	//Métodos da classe
	public void mostrarDimensoes() {
		
		System.out.println("----------------------");
		System.out.println(nome);
		System.out.println("----------------------");
		System.out.println("Base = " + base );
		System.out.println("LadoB = " + sideB);
		System.out.println("LadoC = " + sideC);
		System.out.println("Altura = " + hight);
		System.out.println(" ");
		calcularArea();
		calcularPerimetro();
		
		
		}
	public void calcularArea() {
		
		int area = (base * hight) / 2;
		System.out.println("Área = " + area);
	}
	public void calcularPerimetro() {
		
		int perimetro = base + sideB + sideC;
		System.out.println("perímetro = " + perimetro);
	}

}
