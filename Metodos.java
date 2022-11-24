/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Usuario
 */
public class Metodos {

    private String cadena;
    private double resultado;
    private boolean suma, resta, multi,divi, raiz, x, xn, sen, cos , tan,
                    inverso, facto, clear;

    public Metodos(){
        cadena="";
        suma=false;
        resta=false;
        multi=false;
        divi=false;
        raiz=false;
        raiz=false;
        x=false;
        xn=false;
        sen=false;
        cos=false;
        tan=false;
        inverso=false;
        facto=false;
        clear=false;
}

    public String concatenamiento(String cadena){
        this.cadena=this.cadena+cadena;
        return this.cadena;
    }

    public void suma(String cadena) {
        this.resultado=Double.parseDouble ( cadena) ;
        suma=true;
        this.cadena ="";
    }

    public void resta (String cadena){
        this.resultado=Double.parseDouble ( cadena) ;
        resta=true;
        this.cadena="";
    }

    public void multi(String cadena){
        this.resultado=Double.parseDouble ( cadena);
        multi=true;
        this.cadena="";
    }

    public void divi(String cadena) {
        this. resultado=Double.parseDouble ( cadena);
        divi=true;
        this.cadena="";
    }

    public void raiz (String cadena) {
        this.resultado=Double.parseDouble ( cadena);
        raiz=true;
        this.cadena="";
    }

    public void x (String cadena) {
        this.resultado=Double.parseDouble ( cadena);
        x=true;
        this.cadena="";
    }

    public void xn (String cadena) {
        this. resultado=Double.parseDouble ( cadena);
        xn=true;
        this.cadena="";
    }

    public void sen (String cadena){
        this.resultado=Double.parseDouble ( cadena);
        sen=true;
        this.cadena="";
    }

    public void cos(String cadena) {
        this.resultado=Double.parseDouble ( cadena) ;
        cos=true;
        this.cadena="";
}

    public void tan(String cadena) {
        this. resultado=Double.parseDouble (cadena) ;
        tan=true;
        this.cadena="";
    }

    public void inverso (String cadena){
        this. resultado=Double.parseDouble ( cadena) ;
        inverso=true;
        this.cadena="";
    }

    public void facto( String cadena){
        this. resultado=Double.parseDouble ( cadena) ;
        facto=true;
        this.cadena="";
    }

    public void clear (String cadena) {
        this.resultado=0 ;
        clear=true;
        this.cadena=" ";
    }

    public double resultado (String numero) {
       if(suma==true) {
            resultado=resultado+Double.parseDouble( numero);
       }
        else if( resta==true) {
            resultado=resultado-Double.parseDouble( numero);
       }
        else if(multi==true) {
            resultado=resultado*Double.parseDouble( numero); 
       }
        else if (divi==true) {
            resultado=resultado/Double.parseDouble (numero);
       }
        else if (raiz==true) {
            resultado=Math. sqrt ( resultado);
       }
        else if (x==true){
            resultado=Math .pow( resultado, 2);
       }
        else if (xn==true) {
            resultado=Math. pow( resultado, Double.parseDouble (numero));
       }
        else if (sen==true) {
            resultado=Math. sin( resultado);
       }
        else if(cos==true) {
            resultado=Math. cos(resultado );
       }
        else if(tan==true) {
            resultado=Math. tan( resultado);
       }
        else if (facto==true){
            int factorial;
            for (double i=resultado; i>0; i--){
                resultado=resultado*i;
           }
       }
        else if (inverso==true) {
            resultado= 1 / resultado;
       }
        else if (clear==true) {
            resultado=0;
       }

      suma=false;
      resta=false;
      multi=false;
      divi=false;
      raiz=false;
      raiz=false;
      x=false;
      xn=false;
      sen=false;
      cos=false;
      tan=false;
      inverso=false;
      clear=false;

     return resultado;
   }
}
