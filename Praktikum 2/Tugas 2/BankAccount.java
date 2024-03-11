/*
 * NAMA: INDANA NAJWA RAMADHANI
 * NIM : 24060122130070
 */

public class BankAccount {
    private float balance;
    public float jumlah;
    
    public BankAccount(){
        balance = 0;
    }
    public BankAccount(float initialBalance){
        balance = initialBalance;
    }
    public void deposit(float jumlah){
        balance += jumlah;
        System.out.println("Deposit sejumlah " + jumlah + " berhasil. Saldo sekarang: " + balance);
    }
    public void withdraw(float jumlah){
        balance -= jumlah;
        System.out.println("Penarikan sejumlah " + jumlah + " berhasil. Saldo sekarang: " + balance);
    }
    public double getBalance(){
        return balance;
    }
}
