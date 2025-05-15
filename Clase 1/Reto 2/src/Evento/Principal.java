package Evento;

public class Principal {
  public static void main (String[] args){
      Entrada entrada1 = new Entrada( "Concierto Harry Styles", 500);
      Entrada entrada2 = new Entrada( "Concierto Bad Bunny", 1500);

      entrada1.mostrarInformacion();
      entrada2.mostrarInformacion();

  }
}
