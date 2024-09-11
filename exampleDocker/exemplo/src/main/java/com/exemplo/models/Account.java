package com.exemplo.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Account {
    private String number;

    private String owner;

    private Double balance;

    private List<Transaction> transactions;

    public Account(){}

    public Account(String owner){
        this(owner, 0.0);
    }

    public Account(String owner, Double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public void makeDeposit(Double amount, LocalDateTime date, String notes) {
        if(amount <= 0) {
            throw new IllegalArgumentException();
        }
        this.transactions.add(new Transaction(amount, date, notes));
        this.balance += amount;
    }
    public void makeWithdrawal(Double amount, LocalDateTime date, String notes, Double balance) {
        if(amount <= 0){
            throw new IllegalArgumentException();
        }

        else if(balance - amount < 0){
            throw new IllegalStateException();
        }

        this.transactions.add(new Transaction(amount, date, notes));
        this.balance -= amount;

    }

    public String getAccountHistory(){
        StringBuilder report = new StringBuilder();
        report.append("Date\tAmount\tBalance\tNotes");

        for(Transaction transaction : this.transactions){
            balance += transaction.getAmount();
            report.append(transaction.getDate() + " " + transaction.getAmount() + " " + 0.0 +
                    " " + transaction.getNotes());
        }
        return report.toString();
    }

}
