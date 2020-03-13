package paquete1;

public class localizacion {

	String pasillo;
	String estanteria;
	String estante;
	
	public void set_pasillo(String p) 
	{
		pasillo=p;
	}
	public String get_pasillo() 
	{
	return pasillo;	
		
	}
	public void set_estanteria(String p) 
	{
		estanteria=p;
	}
	public String get_estanteria() 
	{
	return estanteria;	
		
	}
	public void set_estante(String p) 
	{
		estante=p;
	}
	public String get_estante() 
	{
	return estante;	
		
	}
	
	public localizacion(String p, String es,String est)
	{
		pasillo = p;
		estanteria = es;
		estante = est;
		
	}
	public localizacion()
	{
		pasillo = "0";
		estanteria = "0";
		estante = "0";
		
	}
}
