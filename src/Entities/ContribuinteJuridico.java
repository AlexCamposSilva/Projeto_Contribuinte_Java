package Entities;

public class ContribuinteJuridico extends Contribuintes {

	private int numeroFuncionário;
	
	
	public ContribuinteJuridico(){
		
	}
	
		
	public ContribuinteJuridico(String nome, Double rendaAnual,
			int numeroFuncionário) {
		super(nome, rendaAnual);
		this.numeroFuncionário = numeroFuncionário;
	}
	
	public double getNumeroFuncionário() {
		return numeroFuncionário;
	}


	public void setNumeroFuncionário(int numeroFuncionário) {
		this.numeroFuncionário = numeroFuncionário;
	}


	@Override
	public Double imposto() {

		if (numeroFuncionário > 10){
		return 	(rendaAnual  * 14) /100;
			
		}else{
			return (rendaAnual * 16) /100;
		}
		
		
	}

}
