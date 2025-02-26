package com.ferragnez.party;

// Import Scanner
import java.util.Scanner;

public class CheckGuest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Creo e inizializzo l'array degli invitati
    String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

    // Prelevo il nome dell'utente
    System.out.println("Inserisci il tuo nome: ");
    String userName = input.nextLine();
    while(userName.length() <= 3){
      System.out.println("Il nome inserito deve essere piu' lungo di 3 caratteri. \nRiprova: ");
      userName = input.nextLine();
    }

    // Creo una variabile per sapere se l'utente e' in lista
    boolean userCanEnter = false;
    // Controllo se l'utente e' presente in lista
    for(int i = 0; i < guests.length; i++){
      if(guests[i].toLowerCase().contains(userName.toLowerCase()))
        userCanEnter = true;
    }

    if(userCanEnter)
      System.err.println("Puoi entrare alla festa!");
    else
      System.err.println("Non puoi entrare alla festa! Non sei stato invitato.");
  }
}
