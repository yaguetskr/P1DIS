
package paquete1;
















import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//declaramos las funciones encargadas de buscar en los arrays de clase producto y cliente

public class main {
	
	
	
	
	
	public static int  buscar_producto(producto[] product, String n){
		
		
		
	    for(int i = 0;
	    		i<10;
	    		i++)
	    {
	    	
	        if (product[i].Nombre==n){
	            return i;
	        }
	    }
	    return -1;
	}

	public static int  buscar_cliente(clientes[] clients , String n){
	    for(int i=0;i<10;i++){
	        if (clients[i].Nombre==n){
	            return i;
	        }
	    }
	    return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
    
    public static void main(String[] args) throws IOException{
    	
    
        
        //el programa se estructura con 5 clases ; producto cliente pedidos direccion lozalizacion.
        //hemos creado 3 arrays uno con clientes , otro con productos y el ultimo para los
        //pedidos,este a diferencia de los otros posee un array de productos dentro, para poder realizar pedidos con mas de un producto.
        //todas las clases constan de su constructor parametrizado y asi es como inicializamos las variables y arrays.
        
        clientes[] clients=new clientes[10];
        producto[] prod= new producto[10];
        pedidos[] pedido= new pedidos[10];
        String nom;
        int cod;
        String desc;
        int stk;
        String pas;
        String est;
        String nte;
        String apell;
        String mail;
        String tlf;
        String calle;
        int num;
        int codp;
        String pobl;
        String pais;
        int salir=0;
        String nom_prod;
        int cantidad;
        String destin;
        int contador_pedidos=0;
        int contador_clientes=0;
        int contador_productos=0;
        
       
        int num_pedido=0;
        int num_cliente=-1;
        int num_producto=-1;
        
        
        BufferedReader reader =
        new BufferedReader(new InputStreamReader(System.in));
        // TODO Auto-generated method stub
        System.out.println("Que elemento quieres a�adir?");
        System.out.println("1.-Producto");
        System.out.println("2.-Cliente");
        System.out.println("3.-Pedido");
         System.out.println("4.-Salir");
        
        int n = Integer.parseInt(reader.readLine());
        
        
        do{
        switch(n) {
            case 1:
                
                System.out.println("C�digo:");
                
                cod = Integer.parseInt(reader.readLine());
                System.out.println("Nombre:");
                
                nom = reader.readLine();
                System.out.println("Descripci�n");
                
                desc = reader.readLine();
                
                System.out.println("Stock");
                
                stk = Integer.parseInt(reader.readLine());
                System.out.println("Pasillo");
                
                pas = reader.readLine();
                System.out.println("Estanter�a");
                
                est = reader.readLine();
                System.out.println("Estante");
                
                nte = reader.readLine();
                
                
                System.out.println("Pendientes");
                boolean pendientes = Boolean.parseBoolean(reader.readLine());
                
              
                localizacion loc;
                loc=new localizacion(pas,est,nte);
                prod[contador_productos]=new producto(cod, nom,desc,stk,loc,pendientes);
                contador_productos ++;
             
                break;
            case 2:
                
                
                
                System.out.println("Introduzca Nombre:");
                
                nom = reader.readLine();
                System.out.println("Apellidos:");
                
                apell = reader.readLine();
                System.out.println("Email:");
                
                mail = reader.readLine();
                
                
                System.out.println("Telefono");
                tlf = reader.readLine();
                
                System.out.println("Calle");
                
                
                calle = reader.readLine();
                
                System.out.println("Numero");
                
                
                num = Integer.parseInt(reader.readLine());
                
                
                System.out.println("Codigo postal");
                
                codp = Integer.parseInt(reader.readLine());
                System.out.println("Poblacion");
                
                pobl = reader.readLine();
                
                
                System.out.println("Pa�s");
                
                pais = reader.readLine();
                
               
                
                direccion dir=new direccion(calle,num,codp,pobl,pais);
                clients[contador_clientes] = new clientes(nom,apell,mail,tlf,dir);

                contador_clientes++;
                break;
            case 3:
                
                 int contador_aux=0;
                do{
                System.out.println("Para realizar pedido pulse 0 sino introduzca otro numero");
                     salir = Integer.parseInt(reader.readLine());
                    if (salir!=0){
                          System.out.println("hasta la proxima");
                        break;
                    }while(salir==0)
                        
                    System.out.println("introduzca el nombre del producto:");
                    nom_prod = reader.readLine();
                    num_producto=buscar_producto(prod,nom_prod);
                    System.out.println("cantidad:");
                    cantidad = Integer.parseInt(reader.readLine());
                
                    System.out.println("nombre del cliente /destinatario:");
                    nom = reader.readLine();
                    num_cliente= buscar_cliente(clients,nom);
                
                   
                    System.out.println("fecha de entrega:");
                    System.out.println("Se entregara una semana despues del pago...");
                    System.out.println("pedido realizado");
                    
                 
                    pedido[contador_pedidos]=new pedidos(prod,cantidad,clients[num_cliente].dir,clients[num_cliente].Nombre,"En una semana");
                    contador_aux++;
                }while(salir==0);
                       contador_pedidos++;
                
                break;
            default:
                System.out.println("opciones validas (1-4)");
                break;
                
                
        }
        }while(n!=4);
       
        
        
    }
    //estas funciones devuelven la posicion en el array de cliente y producto

    
    

        
        
        
}
        
        
        
        
        
        
        
        
        
        
        
        

