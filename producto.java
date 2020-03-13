package paquete1;

public class producto {
	
	int Codigo;
	String Nombre;
	String descripcion;
	int stock;
	localizacion Localiza;
	int pendientes;
	
	public void set_Codigo(int p) 
	{
		Codigo=p;
	}
	public int get_Codigo() 
	{
	return Codigo;	
		
	}
	public void set_Nombre(String p) 
	{
		Nombre=p;
	}
	public String get_Nombre() 
	{
	return Nombre;	
		
	}
	public void set_descripcion(String p) 
	{
		descripcion=p;
	}
	public String get_descripcion() 
	{
	return descripcion;	
		
	}
	public void set_stock(int p) 
	{
		stock=p;
	}
	public int get_stock() 
	{
	return stock;	
		
	}
	public void set_Localiza(localizacion p) 
	{
		Localiza = p;
	}
	public localizacion get_Localiza() 
	{
	return Localiza;	
		
	}
	public void set_pendientes(int p) 
	{
		pendientes = p;
	}
	public int get_pendientes() 
	{
	return pendientes;	
		
	}
	
	public producto() 
	{
		Codigo=0;
		Nombre ="a";
		descripcion="a";
		stock = 0;
		Localiza = new localizacion();
	}
	
}
