/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import javax.annotation.Generated;

/**
 *
 * @author Usuario
 */
public class Calcu extends javax.swing.JFrame{
    Metodos metodo=new Metodos ();
    private Object jTextEield1;
    
  private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    /**
    *This method is called f rom within the constructor to initialize
    *WARNING: Do NOT modify this code. The content of this method is
    *regenerated by the Fo rm Editor.
    */
    @SuppressWarnings ("unchecked")
    Generated Code;

    private void jBsenActionPerformed (java.awt.event.ActionEvent evt) {
    }
// TODO add your handling code here:
    private void jBunoMouseClicked (java.awt.event.MouseEvent evt) {
        jTextField1.setText (metodo.concatenamiento("1"));
   }

    private void jBdosMouseCliicked (java.awt.event.MouseEvent evt) {
        jTextFieldl.setText (metodo.concatenamiento("2")) ;
   }

    private void jBtresMouseclicked (java.awt.event.MouseEvent evt) {
       jTextFieldl.setText (metodo.concatenamiento("3"));
   }

    private void jBcuatroMouseClicked (java.awt.event.MouseEvent evt) {
       jTextField1.setText (metodo.concatenamiento("4"));
   }

    private void jBcincoMouseClicked (java.awt.event.MouseEvent evt){
       jTextField1.setText (metodo.concatenamiento("5"));
   }

    private void jBseisMouseclicked (java.awt.event.MouseEvent evt) {
       jTextField1.setText (metodo.concatenamiento("6"));
   }

    private void jBnueveMouseClicked (java.awt.event.MouseEvent evt) {
       jTextField1.setText(metodo.concatenamiento ("g'"));
   }

    private void jBceroMouseClicked (java.awt.event.MouseEvent evt) {
       jTextField1.setText(metodo.concatenamiento ("0"));
   }

    private void jBpuntoMouseClicked (java.awt.event.MouseEvent evt) {
       jTextField1.setText(metodo.concatenamiento (","));
   }

    private void jBsieteMouseclicked (java.awt.event.MouseEvent evt) {
       jTextFieldl.setText(metodo.concatenamiento("7"));
   }

    private void jBochoMouseCclicked (java.awt.event . MouseEvent evt) {
       jTextField1.setText (metodo.concatenamiento("8"));
   }

    private void jBsumaMouseClicked (java. awt.event.MouseEvent evt) {
       metodo.suma (jTextField1.getText ( ));
   }

    private void jBrestaMouseClicked (java. awt.event. MouseEvent evt){
       metodo.resta (jTextField1.getText ());
   }

    private void jBraizMouseClicked (java.awt.event . MouseEvent evt) {
       metodo.raiz(jTextField1.getText ());
       jTextField1.setText (""+metodo.resultado(jTextField1.getText()));
   }
   
    private void jBraizMouseDragged (java.awt.event.MouseEvent evt) {
   }

    private void jBxMouseClicked (java.awt.event.MouseEvent evt) {
       metodo.x(jTextField1.getText ());
       jTextField1.setText(""+metodo.resultado(jTextField1.getText ()));
   }
 
    private void jBxnMouseClicked (java.awt.event.MouseEvent evt) {
       metodo.xn(jTextFieldl.getText ());
   }

   private void jBsenMouseClicked (java.awt.event.MouseEvent evt) {
       metodo.sen(jTextField1.getText ( ));
       jTextField1.setText(""+metodo.resultado(jTextFieldl.getText ()));
   }

   private void jBigualMouseClicked (java.awt.event.MouseEvent evt) {
      jTextField1.setText("" +metodo.resultado(jTextField1.getText ( )));
      metodo.clear(jTextField1.getText ( ));
   }

   
    void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setVisible(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

    private static class jTextFieldl {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public jTextFieldl() {
        }
    }

    private void jBclearMouseclicked (java.awt.event.MouseEvent evt) {
       metodo.clear(jTextField1.getText () );
       jTextField1.setText ("0");
   }

    private void jBmultiMouseClicked (java.awt.event.MouseEvent evt) {
       metodo.multi(jTextFieldl.getText ());
   }

    private void jBdiviMouseclicked (java.awt.event.MouseEvent evt) {
       metodo.divi(jTextField1.getText () );
   }

    private void jBcosMouseDragged (java.awt.event.MouseEvent evt) {
   }
// TOD0 add your handling code here:
    private void jBcosMouseClicked (java.awt.event.MouseEvent evt) {
       metodo.cos(jTextField1.getText());
       jTextField1.setText("" +metodo.resultado (jTextField1.getText ()));
      }

    private void jBtanMouseDragged (java. awt.event.MouseEvent evt){
    }
// TOD0 add your handling code here:
    private void jBtanMouseClicked (java. awt.event. MouseEvent evt) {
       metodo.tan(jTextField1.getText () );
       jTextField1.setText (""+metodo.resultado (jTextField1.getText ( )));
   }

    private void jBinversoMouseDragged (java.awt.event. MouseEvent evt) {
   }
// TODO add your handling code he re:
    private void jBinversoMouseClicked (java.awt.event.MouseEvent evt){
       metodo. inverso(jTextField1.getText ());
       jTextField1.setText (""+metodo.resultado (jTextField1.getText ())) ;
   }

    private void jBfactoMouseDragged(java.awt.event.MouseEvent evt) {
  }

    private void jBfactoMouseClicked (java.awt.event.MouseEvent evt) {
       metodo.facto (jTextField1.getText ( ));
       jTextField1.setText (""+metodo.resultado (jTextField1.getText ())) ;
       } 



}