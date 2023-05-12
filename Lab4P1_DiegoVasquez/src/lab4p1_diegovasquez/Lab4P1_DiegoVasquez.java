/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_diegovasquez;
import java.util.Scanner;
/**
 *
 * @author Diego Vasquez
 */
public class Lab4P1_DiegoVasquez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        //leer solo para strings, y lea pa los demas
        boolean seguir = true;
        while (seguir){
            System.out.println("1.Conjuntos");
            System.out.println("2.Contraseña Mejorada");
            System.out.println("3.Salir");
            System.out.println("Ingrese su opcion: ");
            int opcion = lea.nextInt();
            switch(opcion){
                case 1: {
                    System.out.println("Ingrese el primer conjunto:");
                    String conjunto1 = leer.nextLine();
                    while (conjunto1.charAt(0) != 'A' || conjunto1.charAt(2) != '{'||conjunto1.charAt(1) != '='){
                        System.out.println("Su conjunto debe de ser una mayuscula y seguir la rubrica de un conjunto ");
                        break;
                    }
                    System.out.println("Ingrese el Segundo conjunto: ");
                    String conjunto2 = leer.nextLine();
                    while (conjunto2.charAt(0) != 'B' || conjunto2.charAt(2) != '{'||conjunto2.charAt(1) != '='){
                        System.out.println("Su conjunto debe de ser una mayuscula y seguir la rubrica de un conjunto");
                        break;
                    }
                    String union = "={";
                    String intersex = "={";
                    for (int i = 3; i < conjunto1.length()-1; i++){
                        int x = conjunto1.charAt(i);
                        for (int j = 3; j < conjunto2.length()-1;j++){
                            int y = conjunto2.charAt(j);
                            if(x != y){
                            union += (char)y;
                            union += ",";
                            union += (char)x;
                            }
                            else{
                                intersex += (char)y;
                            }
                       
                        }
                            
                        }
                        
                        union += '}';
                        intersex += '}';
                        if (union == intersex){
                            System.out.println("Los conjuntos son iguales");
                        }else{
                            System.out.println("Sus conjuntos no son iguales");
                            System.out.println("La union es: C"+union);
                            System.out.println("La intesecion es: D"+intersex);
                    
                        }  
                }//fin case 1
                break;
                case 2:{
                    System.out.println("Ingrese la contraseña: ");
                    String contra = leer.nextLine();
                    System.out.println("Ingrese un numero: ");
                    int mejora = lea.nextInt();
                    int letra = 0;
                    int nums = 0;
                    for (int c=0;c<contra.length();c++){
                        int m = contra.charAt(c);
                        if(m >= 97 && m <= 122){
                            letra += 1;
                        }
                        if( m >= 48 && m <= 57){
                            nums += 1;
                        }
                    }//fin for
                    if (contra.length() < 8){
                        System.out.println("Su contraseña no es segura");
                        System.out.println("La contraseña no es segura porque tiene menos de 8 caracteres");
                    } else if(letra == 0){
                        System.out.println("Su contraseña no es segura");
                        System.out.println("La contraseña no es segura porque no tiene letras");
                    }else if(nums == 0){
                        System.out.println("Su contraseña no es segura");
                        System.out.println("La contra no es segura porque no tiene numeros");
                    }else{
                        System.out.println("Su contraseña es segura");
                        System.out.print("La nueva contraseña es: ");
                        String ncontra = "";
                        for (int z = 1; z <= contra.length();z++){
                            if (z % 2 == 0){
                                ncontra += contra.charAt(z-1);
                                ncontra += mejora;
                                mejora++; 
                                
                            }else{
                                ncontra += contra.charAt(z-1);
                                
                            }
                        }
                        System.out.print(ncontra);
                        System.out.println("");
                    }
                }
                break;
                case 3:{
                    seguir = false;
                }//fin case 3
                break;
                default: {
                    System.out.println("Su opcion es invalida. Intentelo de nuevo:");
                }
            }
        }//fin while
    }//fin public static void main
    
}//fin public class
