package TEC.Proyecto_LogoTEC.interprete.ast;

public class AsigException extends Exception{
	
	private int codigoError;
	
	public AsigException (int codigoError) {
		super();
		this.codigoError=codigoError;
	}

	@Override
    public String getMessage(){
         
        String mensaje="";
         
        switch(codigoError){
            case 111:
                mensaje="ERROR: 'Haz' intenta asignar un valor a una variable ya asignada";
                break;
        }
         
        return mensaje;
         
    }
}
