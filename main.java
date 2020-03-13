
package paquete1;











import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//declaramos las funciones encargadas de buscar en los arrays de clase producto y cliente

public class main {
	
	
	
	
	
	
	
	
    public static void generate(String name, producto[] producto,clientes[] clientes,pedidos[] pedidos) throws Exception{

  
       

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, name, null);
            document.setXmlVersion("1.0");

            //Main Node
            Element raiz = document.getDocumentElement();
            //Por cada key creamos un item que contendrá la key y el value
            for(int i=0; i<producto.length;i++){
                //Item Node
                Element itemNode = document.createElement("PRODUCTO"); 
                //Key Node
                Element keyNode = document.createElement("CODIGO"); 
                Text nodeKeyValue = document.createTextNode(Integer.toString(producto[i].get_Codigo()));
                keyNode.appendChild(nodeKeyValue);
                
                //Value Node
                Element valueNode = document.createElement("NOMBRE"); 
                Text nodeValueValue = document.createTextNode(producto[i].get_Nombre());                
                valueNode.appendChild(nodeValueValue);
                
                Element valuependiente = document.createElement("PENDIENTE"); 
                Text nodeValuependiente = document.createTextNode(producto[i].get_Nombre());                
                valuependiente.appendChild(nodeValuependiente);
                
                //append keyNode and valueNode to itemNode
                itemNode.appendChild(keyNode);
                itemNode.appendChild(valueNode);
                itemNode.appendChild(valuependiente);
                //append itemNode to raiz
                raiz.appendChild(itemNode); //pegamos el elemento a la raiz "Documento"
            }
            
            
            for(int i=0; i<clientes.length;i++){
                //Item Node
                Element itemNode2 = document.createElement("CLIENTE"); 
                //Key Node
                Element nombreNode = document.createElement("NOMBRE"); 
                Text nodenombre = document.createTextNode(Integer.toString(producto[i].get_Codigo()));
                nombreNode.appendChild(nodenombre);
                
                //Value Node
                Element apellNode = document.createElement("APELLIDOS"); 
                Text apellnodeValueValue = document.createTextNode(producto[i].get_Nombre());                
                apellNode.appendChild(apellnodeValueValue);
                
                Element tlfs = document.createElement("TELEFONOS"); 
                Text tlfsvalue = document.createTextNode(producto[i].get_Nombre());                
                tlfs.appendChild(tlfsvalue);
                
                //append keyNode and valueNode to itemNode
                itemNode2.appendChild(nombreNode);
                itemNode2.appendChild(apellNode);
                itemNode2.appendChild(tlfs);
                //append itemNode to raiz
                raiz.appendChild(itemNode2); //pegamos el elemento a la raiz "Documento"
            }
            
            
            for(int i=0; i<pedidos.length;i++){
                //Item Node
                Element itemNode3 = document.createElement("PEDIDOS"); 
                //Key Node
                //Element nombreNode = document.createElement("PRODUCTO"); 
                //Text nodenombre = document.createTextNode(producto[i].get_Codigo());
                //nombreNode.appendChild(nodenombre);
                
                //Value Node
                Element cantnode = document.createElement("CANTIDAD"); 
                Text cantvalue = document.createTextNode(producto[i].get_Nombre());                
                cantnode.appendChild(cantvalue);
                

                
                //append keyNode and valueNode to itemNode
                itemNode3.appendChild(cantnode);

                //append itemNode to raiz
                raiz.appendChild(itemNode3); //pegamos el elemento a la raiz "Documento"
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            //Generate XML
            Source source = new DOMSource(document);
            //Indicamos donde lo queremos almacenar
            Result result = new StreamResult(new java.io.File(name+".xml")); //nombre del archivo
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
        
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
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
        System.out.println("Que elemento quieres aï¿½adir?");
        System.out.println("1.-Producto");
        System.out.println("2.-Cliente");
        System.out.println("3.-Pedido");
         System.out.println("4.-Salir");
        
        int n = Integer.parseInt(reader.readLine());
        
        
        do{
        switch(n) {
            case 1:
                
                System.out.println("Cï¿½digo:");
                
                cod = Integer.parseInt(reader.readLine());
                System.out.println("Nombre:");
                
                nom = reader.readLine();
                System.out.println("Descripciï¿½n");
                
                desc = reader.readLine();
                
                System.out.println("Stock");
                
                stk = Integer.parseInt(reader.readLine());
                System.out.println("Pasillo");
                
                pas = reader.readLine();
                System.out.println("Estanterï¿½a");
                
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
                
                
                System.out.println("Paï¿½s");
                
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
       
        
        
        
        
        

        
        

        try { 
            generate("xml",prod,clients,pedido);
        } catch (Exception e) {} 
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    //estas funciones devuelven la posicion en el array de cliente y producto

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
}

        
        
        
        
        
        
        
        
        
        
        
        

