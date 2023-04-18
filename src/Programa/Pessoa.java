package Programa;
import Utilitarios.Utils;

public class Pessoa {
    private static int counter = 1;

    private int numeroPessoa ;
    private String nome;
    private String cpf;
    private String email;
    // private Date accountCreationDate;

    public Pessoa() { }

    public Pessoa(String name, String cpf, String email) {
        this.numeroPessoa = Pessoa.counter;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        //   this.accountCreationDate = new Date();
        Pessoa.counter += 1;
    }

    public int getNumeroPessoa() {
        return this.numeroPessoa;
    }

    public String getNome() {
        return nome;
    }
    public void setName(String name) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    // public Date getAccountCreationDate() {
    //    return this.accountCreationDate;
    // }

    public String toString() {
        return  "\nName: " + this.getNome() +
                "\nCPF: " + this.getCpf() +
                "\nEmail: " + this.getEmail();
        //    "\nAccount Creation Date: " + Utils.dateToString(this.getAccountCreationDate());
    }
}
