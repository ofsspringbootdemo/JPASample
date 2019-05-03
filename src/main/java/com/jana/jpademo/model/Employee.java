package com.jana.jpademo.model;

import javax.persistence.*;

@Entity
public class Employee {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  @Column(name = "ID")
  private Long id;

  @Column(name = "FIRST_NAME")
  private String firstName;

  @Column(name = "LAST_NAME")
  private String lastName;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "ACCOUNT_ID")
  private Account account;

  public Employee() {

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  @Override
  public String toString() {
    return String.format("Employee [id=%d, firstName='%s', lastName='%s']",
            id, firstName, lastName);
  }
}
