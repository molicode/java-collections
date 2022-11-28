package main.java.com.linkedin.collections._02;

public class Application02 {

  public static void main(String[] args){
    Contract contract = new Implementation();
    printTerms(contract);
  }

  private static void printTerms(Contract contract) {
    contract.term1();
    contract.term2();
    contract.extendedTerm();
  }

}
