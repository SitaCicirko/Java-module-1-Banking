abstract class Bank {
    abstract protected void putYourCardIn();
    abstract protected void typeYourPin();
    abstract protected void typeTheAmount();

    private void theWithdrawalRequest() {
    System.out.println("The amount was requested to the Bank");
    }
    private void accountStatusCheck(){
        System.out.println("Account status check");
    }
    private void confirmationOfWithdrawal(){
        System.out.println("Confirmation of the possibility of withdrawal");
    }
    abstract protected void withdrawingCash();
    abstract protected void theEnd();

    public void run(){
        this.putYourCardIn();
        this.typeYourPin();
        this.typeTheAmount();
        this.theWithdrawalRequest();
        this.accountStatusCheck();
        this.confirmationOfWithdrawal();
        this.withdrawingCash();
        this.theEnd();
    }

}
class Bankomat extends Bank {
    protected void putYourCardIn() {
        System.out.println("Put your card in");
    }
    protected void typeYourPin() {
        System.out.println("Type your PIN");
    }
    protected void typeTheAmount() {
        System.out.println("Type the amount");
    }
    protected void withdrawingCash() {
        System.out.println("Withdrawing Cash");
    }
    protected void theEnd() {
        System.out.println("Thank you! Have a nice day! ;)");
    }
}
class Application {
    public static void main(String args[]) {
        Bankomat bankomat = new Bankomat();
        bankomat.run();
    }
}
