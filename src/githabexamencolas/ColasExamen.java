/*Instituto Tecnologico De Tuxtla Gutierrez
Extencion Venustiano Carranza
Ingenieria En Sistemas Computacionales
Profesor: ISC Edwin Yuliani Moreno Bautista
Alumno: Pablo Daniel Hernandez Coello
Unidad 3 Estructura De Datos
26 de cotubre del 2018*/
package githabexamencolas;

import javax.swing.JOptionPane;

public class ColasExamen implements IColasExamen{
 private int Tam; 
    private int Frente; 
    private int Fin;
    private int[] Cola; 
    
    @Override
    public void crearCola() {
        Frente = 0;
        Fin = -1;
        Cola = new int[Tam=Integer.parseInt(JOptionPane.showInputDialog("Escriba El Tamaño De La Cola "))]; 
         JOptionPane.showMessageDialog(null, "  Se Creo La Cola De " + Tam + " Elementos ");    
    }
    
    @Override
    public void insertarElemento() {
         if (Fin == Tam - 1) {  
            JOptionPane.showMessageDialog(null, "SIN ESPACIO","ESPACIO AGOTADO", (int) JOptionPane.LEFT_ALIGNMENT);
        } else {
            int Dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Un Elemento A La Cola"));
            JOptionPane.showMessageDialog(null, "  Se Guardo El Elemento En La Cola ");   
            Cola[++Fin] = Dato;
        }
    }

    @Override
    public void estaVacia() {
        if(Tam == 0){
              JOptionPane.showMessageDialog(null,"LA COLA ESTA VACIA");
          }else{
              JOptionPane.showMessageDialog(null,"LA COLA ESTA LLENA");
          }      
    }
    
    @Override
    public void estaLlena() {
       if(Fin == -1){
              JOptionPane.showMessageDialog(null,"LA COLA ESTA VACIA");
          }else{
              JOptionPane.showMessageDialog(null,"LA COLA ESTA LLENA");
          }      
    
    }

    @Override
    public void quitarElemento() {
        if ((Fin==-1)) {
            JOptionPane.showMessageDialog(null, "SIN ELEMENTOS POR ELIMINAR", " ERROR ", (int) JOptionPane.LEFT_ALIGNMENT);
        } else {
            for(int i=Frente; i<Fin; i++){
            Cola[i]=Cola[i+1];
            }
            Fin--;
            Cola[Tam-1]=Frente;
         JOptionPane.showMessageDialog(null, "Se Elimino El Elemento [" + Cola[Tam-1] + "]");
        }
    }

    @Override
    public void imprimirCola() {
        String Colas = "";
        if (!(Fin == -1)) {
            JOptionPane.showMessageDialog(null, "La Cola De Tamaño: " + Tam + ""
                    + " Contiene " + (Fin + 1) + " Elementos ");
            for (int i = Frente; i <= Fin; i++) {
                Colas = Colas + "Elemento " + i + ": " + "[" + Cola[i] + "]" + "\n";
            }
            JOptionPane.showMessageDialog(null,
                    Colas, "Mostrar Elementos", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "La Cola Esta Vacia "," ERROR ", (int) JOptionPane.LEFT_ALIGNMENT);
        }
    }
     @Override
    public void Menu() {
   
        do {
int opcion=Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "---MENU COLAS EXAMEN---\n"+
                    "1.Crear Una Nueva Cola\n"+       
                    "2.Insertar Elementos\n"+
                    "3.Comprobar Si Esta Vacia\n"+
                    "4.Comprobar Si Esta Llena\n"+
                    "5.Quitar Un Elemento A la Cola\n"+
                    "6.Imprimir Toda La Cola \n"+
                    "7. Salir \n"+
                    "--------------------------------------------------------\n"+
                    "INGRESE LA OPCION [1 - 7]","MENU COLAS",JOptionPane.QUESTION_MESSAGE));
switch(opcion)
{
case 1: crearCola();
break;
case 2: insertarElemento();
break; 
case 3: estaVacia();
break;
case 4:  estaLlena();
break;      
case 5: quitarElemento();
break;
case 6: imprimirCola();
break;
case 7: System.exit(0);
break;
default:
JOptionPane.showMessageDialog(null,"ERROR");
	
}
}while (true);
}
   public static void main(String []args) {
       ColasExamen p=new ColasExamen();
       p.Menu();
   }

}  

 

   