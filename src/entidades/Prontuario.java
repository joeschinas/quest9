/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Prontuario {
    private String clienteDoProntuario;
    private Date dtNasc;
    private Double altura;
    private Double peso;
    private List<Prontuario> listPaciente = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");

    public Prontuario(String clienteDoProntuario, Date dtNasc, Double altura, Double peso) {
        this.clienteDoProntuario = clienteDoProntuario;
        this.dtNasc = dtNasc;
        this.altura = altura;
        this.peso = peso;
    }

    public Prontuario() {
    }

    public String getClienteDoProntuario() {
        return clienteDoProntuario;
    }

    public void setClienteDoProntuario(String clienteDoProntuario) {
        this.clienteDoProntuario = clienteDoProntuario;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public void addPaciente(Prontuario paciente){
    listPaciente.add(paciente);
    }
    public void removePaciente(Prontuario paciente){
    listPaciente.remove(paciente);
    }
    public String imcPaciente(Double altura){
    this.altura=Math.pow(altura,2);
    DecimalFormat df = new DecimalFormat("0.00");
    Double imc = peso/this.altura;
    
    return df.format(imc);
           
    }
    public StringBuilder Stringsb(){
    StringBuilder sb = new StringBuilder();
    
    sb.append("NOME DO PARCIENTE: \n");
    sb.append(clienteDoProntuario);
    sb.append("\n DATA DE NASCIMENTO: \n");
    sb.append(sdf.format(dtNasc));
    sb.append("\nALTURA DO PARCIENTE: \n");
    sb.append(altura);
    sb.append("\nPESO DO PARCIENTE: \n");
    sb.append(peso);
    
    
    return sb;
    }
    public void preDiagnosticar (){
    
        System.out.println("IMC                    |SITUAÇÃO");
        System.out.println("ABAIXO 18.5            |Você esta abaixo do peso ideal");
        System.out.println("ABAIXO 18.5 e 24.9     |Você esta no seu peso ideal   ");
        System.out.println("ABAIXO 25 e 29.9       |Você esta com Sobrepeso       ");
        System.out.println("ABAIXO 30 e 34.9       |Obesidade grau I              ");
        System.out.println("ABAIXO 35 e 39.9       |Obesidade grau II             ");
        System.out.println("acima de 40            |Obesidade Mórbida             ");
        
    
    }
}
