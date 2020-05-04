/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import entidades.Prontuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Program {

    
    public static void main(String[] args) throws ParseException {
       Locale.setDefault(Locale.US);
       Scanner read = new Scanner (System.in);
       SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
        Prontuario paciente = new Prontuario();
        System.out.println("Preender os dados de 2(dois) pacientes: ");
        for(int i=1; i<=2; i++){
        System.out.println("por favor preencher os dados do pacientes:");
        System.out.println("Nome do Parcientes:"+i+"");
        String nomePaciente = read.nextLine();
        System.out.println("Data de nascimento do parciente:");
        Date dtNasc = sdf.parse(read.next());
        System.out.println("Altura do parciente");
        Double altura = read.nextDouble();
        System.out.println("Peso do parciente");
        Double peso = read.nextDouble();
        
       paciente = new Prontuario(nomePaciente,dtNasc, altura, peso );
       paciente.addPaciente(paciente);
       System.out.println("paciente #"+i+"\n"+paciente.Stringsb());
       System.out.println("RESULTADO DO IMC DO PACIENTE "+i+"#:"+paciente.imcPaciente(altura));
       paciente.preDiagnosticar();
       read.nextLine();
        }
       
        
        
       
    }
    
}
