package modelo;

public class CuentaJoven extends Cuenta {
			
	
	     int bonificación;
	     boolean estudiante;
	     
	    
	     public Persona getTitular() {
				return getTitular();
				
	     }	
	     
	     
		public CuentaJoven(Persona titular, int bonificación, boolean estudiante) {
			super(titular);
			
			this.bonificación = bonificación;
			this.estudiante = estudiante;
			 		
			
			}
						
			


		public int getBonificación() {
			return bonificación;
		}

		public void setBonificación(int bonificación) {
			this.bonificación = bonificación;
		}

		public boolean isEstudiante() {
			return estudiante;
		}

		public void setEstudiante(boolean estudiante) {
			this.estudiante = estudiante;
		}

		@Override
		public String toString() {
			return "CuentaJoven [bonificación=" + bonificación + ", estudiante=" + estudiante + "]";
		}
	     
	     
}
