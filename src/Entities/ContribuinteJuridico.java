package Entities;

public class ContribuinteJuridico extends Contribuintes {

	private int numeroFuncion�rio;
	
	
	public ContribuinteJuridico(){
		
	}
	
		
	public ContribuinteJuridico(String nome, Double rendaAnual,
			int numeroFuncion�rio) {
		super(nome, rendaAnual);
		this.numeroFuncion�rio = numeroFuncion�rio;
	}
	
	public double getNumeroFuncion�rio() {
		return numeroFuncion�rio;
	}


	public void setNumeroFuncion�rio(int numeroFuncion�rio) {
		this.numeroFuncion�rio = numeroFuncion�rio;
	}


	@Override
	public Double imposto() {

		if (numeroFuncion�rio > 10){
		return 	(rendaAnual  * 14) /100;
			
		}else{
			return (rendaAnual * 16) /100;
		}
		
		
	}

}
