import java.util.Scanner;

class UI{
  private int argsLength;
  UI(String[] args){
    argsLength = args.length;
  } void printUI(){
    System.out.println("[*] Starting CLOVER UI...");
    if (argsLength < 1 || argsLength >= 3){
      System.out.println("[!] Error loading IP and Port! Usage: java Clover [IP] [Port]");
    } else if (argsLength == 1) {
      System.out.println("[!] Error loading IP or Port! Usage: java Clover [IP] [Port]");
    } else{
      System.out.println("[+] Loaded IP and Port Successfully!");
    }

    System.out.println();

    System.out.println("|----------------------------------|");
    System.out.println("|                                  |");
    System.out.println("|                                  |");
    System.out.println("|          Clover   v.1.0          |");
    System.out.println("|                                  |");
    System.out.println("|                                  |");
    System.out.println("|----------------------------------|");
    System.out.println();
    System.out.println("[+] User Interface Success!");
  }

}

class System{


}

class Clover{
  public static void main(String args[]){
    UI ui = new UI(args);
    ui.printUI();


  }




}
