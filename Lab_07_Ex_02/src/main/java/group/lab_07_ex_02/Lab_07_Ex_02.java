
package group.lab_07_ex_02;


public class Lab_07_Ex_02 {

    public static void main(String[] args) {
      
        Account currentAcc1 = new Account("Current", 123000.0);
        Account currentAcc2 = new Account("Current", 17000.0);
        Account savAcc = new Account("Savings", 255000.0);
        
        
        Member member1 = new Member("Bisma", 011, currentAcc1);
        Member member2 = new Member("Mahnoor", 102, currentAcc2);
        Member member3 = new Member("Sara", 103, savAcc);
        
       
        System.out.println("Bank Members:");
        member1.displayInfo();
        member2.displayInfo();
        member3.displayInfo();
    }
}
        
 
