/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lydia
 */
public class BankAcct {
    private String name;
    private String acctNumber;
    private String bankName;
    private String acctType;
    private String acctBalance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public String getAcctBalance() {
        return acctBalance;
    }

    public void setAcctBalance(String acctBalance) {
        this.acctBalance = acctBalance;
    }
    
   @Override  //using a method to override smth
    public String toString(){
        return name;
    }
}
