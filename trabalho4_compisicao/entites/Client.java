package trabalho4_compisicao.entites;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
    private String nome;
    private String email;
    private LocalDate birthDate;
    public Client(){
    }
    public Client(String nome, String email, String birthDate) {
        this.nome = nome;
        this.email = email;
        String dataCerta = conversorData(birthDate);
        this.birthDate = LocalDate.parse(dataCerta);
    }

    public String conversorData(String data){
        String dia = data.substring(0, 2);
        String mes = data.substring(3, 5);
        String ano = data.substring(6);
        return (ano + "-" + mes + "-" + dia);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
