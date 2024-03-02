| Lógica | Síntaxe |
|:--:|:--:|
| and  | &&  | 
| or | ll | 
| not | != | 


```java 

public class OperadoresLogica {
public static void main ( String [] args ) {

int x = 10 ;
int y = 13 ;
int z = 15 ;

if ( x > y && x > z ) {

System.out.println("verdadeiro");

}


else if ( x > y || z < y ) {


System.out.println("verdadeiro");

}

else if ( x != y ) {

System.out.println("verdadeiro");


}

else {

System.out.println("falso");

}

}




```