
package ventasfarmacia;

public class Ventas {
	
	private double totalO;
	private double totalE;
	private double totalT;
	
	
	public Ventas() {
	}
	
	public boolean validarIndicador(String indicador){
		if (indicador.equalsIgnoreCase("O")|indicador.equalsIgnoreCase("E")|indicador.equalsIgnoreCase("T")){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean validarImporte(double importe){
		if (importe<=0){
			return true;
		}else{
			return false;
		}
	}
	
	public double getTotalO() {
		return totalO;
	}

	public void setTotalO(double totalO) {
		this.totalO = totalO;
	}

	public double getTotalE() {
		return totalE;
	}

	public void setTotalE(double totalE) {
		this.totalE = totalE;
	}

	public double getTotalT() {
		return totalT;
	}

	public void setTotalT(double totalT) {
		this.totalT = totalT;
	}
	
}
