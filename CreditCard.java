public class CreditCard {
    private Money balance;
    private Money creditLimit;

    private Person Person;

    public CreditCard(Person newCardHolder, Money limit){
        this.Person = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0);
    }

    public Money getBalance(){
        return new Money(balance);
    }

    public Money getCreditLimit(){
        return new Money(creditLimit);
    }

    public String getPersonals(){
        return Person.toString();
    }

    public void charge(Money amount){
        Money newBalance = balance.add(amount);
        if(newBalance.compareTo(creditLimit) <= 0){
            balance = newBalance;
        }
        else{
            System.out.println("Error: Exceeds credit limit");
        }
    }

    public void payment(Money amount){

        balance = balance.subtract(amount);
    }

}
