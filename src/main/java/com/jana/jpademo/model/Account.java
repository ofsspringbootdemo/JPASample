package com.jana.jpademo.model;

import javax.persistence.*;

@Entity
@Table(name="ACCOUNT")
public class Account {


  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  @Column(name="ID")
  private Long id;

  @Column(name="ACCOUNT_NUMBER")
  private Long accountNumber;

  @Column(name="ACCOUNT_TYPE")
  private String accountType;

  @Column(name="BRANCH")
  private String branch;

  @Column(name="BALANCE")
  private double balance;

  @OneToOne(mappedBy = "account")
  private Employee employee;

  public Account() {

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(Long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }
}
