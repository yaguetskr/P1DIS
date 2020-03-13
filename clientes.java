package paquete1;



public class clientes {
    //declaracion de variables
	String Nombre;
	String apellidos;
	String email;
	String telefono;
	direccion dir;
	
	// getters y setters
	public void set_Nombre(String p) 
	{
		Nombre=p;
	}
	public String get_Nombre() 
	{
	return Nombre;	
	}
	public void set_apellidos(String p) 
	{
		apellidos = p;
	}
	public String get_apellidos() 
	{
	return apellidos;	
	}
	public void set_email(String p) 
	{
		email=p;
	}
	public String get_email() 
	{
	return email;	
	}
	public void set_telefono(String p) 
	{
		telefono=p;
	}
	public String get_telefono() 
	{
	return telefono;	
	}
	public void set_dir(direccion p) 
	{
		dir=p;
	}
	public direccion get_pais() 
	{
	return dir;	
	}
    //constructor por parametros
    public clientes(String nom,String apell,String mail,String tlf,direccion direcc)
    {
        Nombre=nom;
        apellidos=apell;
        email=mail;
        telefono=tlf;
        dir =new direccion();
    }
    //constructor por defecto
	public clientes()
	{
		Nombre="0";
		apellidos="0";
		email="0";
		telefono="0";
		dir = new direccion();
	}
	
}
