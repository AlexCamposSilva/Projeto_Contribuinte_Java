package Entities;

public class ContribuinteFisico extends Contribuintes {

	private Double gastoComSaude;
	
	public ContribuinteFisico(){
		
	}
	
		
	public ContribuinteFisico(String nome, Double rendaAnual,
			Double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}


	


	@Override
	public Double imposto() {
		
		 if(rendaAnual < 20000.00){
			return	(rendaAnual * 0.15) - (gastoComSaude * 0.50) ;

		 } else  {
			return  
		 ((rendaAnual * 0.25) - (gastoComSaude * 0.50));
		 }
		 
	}

}
