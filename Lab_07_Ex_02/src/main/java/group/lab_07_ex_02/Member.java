
package group.lab_07_ex_02;


public class Member {
    private String name;
    private int memberId;
    private Account account;

    public Member(String name, int memberId, Account account) {
        this.name = name;
        this.memberId = memberId;
        this.account = account;
    }

    public void displayInfo() {
        System.out.println("Member ID: " + memberId + ", Name: " + name);
        account.displayInfo();
    }
}

