/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quizuninove;
import java.util.*;
import java.io.*;

/**
 *
 * @author Edimilson
 */
public class QuizUninove {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception
    {
        // TODO code application logic here
		String nome = new String(new char[25]);
		int medio = 0;
		int facil = 0;
		int dificil = 0;
		int cont = 0;
		int nivel = 0;
		int certo_1 = 0;
		int errado_1 = 0;
		int contp_1 = 1;
		int totp_1 = 1;
		int certo_2 = 0;
		int errado_2 = 0;
		int contp_2 = 1;
		int totp_2 = 1;
		int certo_3 = 0;
		int errado_3 = 0;
		int contp_3 = 1;
		int totp_3 = 1;

		System.out.print("*=============================================================================*\n");
		System.out.print("|    ___   ___ ___   ___ _________ ___ ___ ________   __  _______   |\n");
		System.out.print("|    XXX   XXX XXX_  XXX XXX XXX_  XXX XXXXXXXXX XX   XX  XXXXXXX   |\n");
		System.out.print("|    XXX   XXX XXXX_ XXX XXX XXXX_ XXX XXXXXXXXX XX   XX  XX        |\n");
		System.out.print("|    XXX   XXX XXXXX_XXX XXX XXXXX_XXX XXX   XXX XX   XX  XX        |\n");
		System.out.print("|    XXX   XXX XXXXXXXXX XXX XXXXXXXXX XXX   XXX XX   XX  XXXXXX    |\n");
		System.out.print("|    XXX___XXX XXX XXXXX XXX XXX XXXXX XXX___XXX XX   XX  XX        |\n");
		System.out.print("|    XXXXXXXXX XXX  XXXX XXX XXX  XXXX XXXXXXXXX  XX  XX  XX        |\n");
		System.out.print("|    XXXXXXXXX XXX  XXXX XXX XXX  XXXX XXXXXXXXX    XX    XXXXXXX   |\n");
		System.out.print("|                                                                             |\n");
		System.out.print("*=============================================================================*\n");
		System.out.print("|                  UNIVERSIDADE NOVE DE JULHO - UNINOVE                       |\n");
		System.out.print("|      EDIMILSON DA SILVA SANTOS - 4o SEMESTRE - SISTEMA DE INFORMAÇÃO        |\n");
		System.out.print("|          E-mails: Edimilson.santos@uninove.edu.br                           |\n");
		System.out.print("|      Materia: PROGRAMAÇÃO ORIENTADA A OBJETOS - PROF. ERNESTO TEODORO       |\n");
		System.out.print("*=============================================================================*\n\n");
		System.out.print("*=============================================================================*\n");
		System.out.print("|======================| QUIZ UNINOVE |======================|\n");
		System.out.print("*=============================================================================*\n");
		System.out.print("\nInforme o nome do participante e em seguida pressione \"enter\".\n\n");
		Scanner input = new Scanner(System.in); //String nome1 = input.nextLine();
                System.out.print("\nNOME DO PARTICIPANTE: ");
                nome = input.next();
                System.out.printf("\nSEJA BEM VINDO \"%s\"\n",nome);
		System.out.print("-------------------------------------------------------------------------------\n");
		System.out.print("Este e um jogo divertido de perguntas e respostas. O jogador devera escolher\n");
		System.out.print("dentre as alternativas apenas uma e em seguida pressionar \"enter\".\n\n");
		System.out.print("O jogo possui 3 niveis de dificuldade:\n\n");
		System.out.print("Nivel facil   - Cada resposta certa valera 1 pontos\n");
		System.out.print("Nivel medio   - Cada resposta certa valera 2 pontos\n");
		System.out.print("Nivel dificil - Cada resposta certa valera 3 pontos\n");
		System.out.print("-------------------------------------------------------------------------------\n");
		System.out.print("Boa sorte e bom jogo\n\n");
		System.out.print("Pressione \"enter\" para continuar...");
		System.in.read();
                dificuldade:
		System.out.print("*-----------------------------*\n");
		System.out.print("|    NIVEIS DE DIFICULDADE    |\n");
		System.out.print("*-----------------------------*\n");
		System.out.print("|  1 - NIVEL FACIL            |\n");
		System.out.print("|  2 - NIVEL MEDIO            |\n");
		System.out.print("|  3 - NIVEL DIFICIL          |\n");
		System.out.print("*-----------------------------*\n");
                
		Scanner input2 = new Scanner(System.in);
                System.out.print("DESEJA JOGAR EM QUAL NIVEL? \n");                
                String validar = input2.nextLine();
                if (validar != null )
                {
			nivel = Integer.parseInt(validar);
		}
                switch (nivel){
                    case 1:

                                long totalMiliSegundos = System.currentTimeMillis() - 10800000;
                                long totalSegundos = totalMiliSegundos / 1000;
                                long segundoAtual = totalSegundos % 60;
                                long totalMinutos = totalSegundos / 60;
                                long minutoAtual = totalMinutos % 60;
                                long totalHora = totalMinutos / 60;
                                long horaAtual = totalHora % 24;

				System.out.print("*=============================================================================*\n");
				System.out.print("|  ___   ___ ___ ___    ___ _________ ___                                     |\n");
				System.out.print("|  XXX_  XXX XXX XXX    XXX XXXXXXXXX XXX                                     |\n");
				System.out.print("|  XXXX_ XXX XXX XXX    XXX XXXXXXXXX XXX                                     |\n");
				System.out.print("|  XXXXX_XXX XXX XXX_  _XXX XXX____   XXX                                     |\n");
				System.out.print("|  XXXXXXXXX XXX  XXX__XXX  XXXXXXX   XXX                                     |\n");
				System.out.print("|  XXX XXXXX XXX   XXXXXX   XXX______ XXX______                               |\n");
				System.out.print("|  XXX  XXXX XXX    XXXX    XXXXXXXXX XXXXXXXXX                               |\n");
				System.out.print("|  XXX   XXX XXX     XX     XXXXXXXXX XXXXXXXXX                               |\n");
				System.out.print("|                                _________ _________ _________ ___ ___        |\n");
				System.out.print("|                                XXXXXXXXX XXXXXXXXX XXXXXXXXX XXX XXX        |\n");
				System.out.print("|                                XXXXXXXXX XXXXXXXXX XXXXXXXXX XXX XXX        |\n");
				System.out.print("|                                XXX___    XXX___XXX XXX       XXX XXX        |\n");
				System.out.print("|                                XXXXXX    XXXXXXXXX XXX       XXX XXX        |\n");
				System.out.print("|                                XXXXXX    XXXXXXXXX XXX______ XXX XXX______  |\n");
				System.out.print("|                                XXX       XXX   XXX XXXXXXXXX XXX XXXXXXXXX  |\n");
				System.out.print("|                                XXX       XXX   XXX XXXXXXXXX XXX XXXXXXXXX  |\n");
				System.out.print("|                                                                             |\n");
				System.out.print("*=============================================================================*\n\n");
				System.out.print("              AS PERGUNSTAS DE NIVEL \"FACIL\" VALEM 1 PONTOS CADA\n\n");//*/                                   
                                System.in.read();
				System.out.print("Pressione \"enter\" para continuar...");
				System.in.read();
				System.out.print("*--------------------------------*\n");
                                System.out.printf("|  Pergunta n. %2d - Nivel Facil  |\n",contp_1 ++ );
				System.out.print("*--------------------------------*\n\n");
				System.out.print("Número de constituições que o Brasil já teve, incluindo a atual.\n");
				System.out.print("A) 5\n");
				System.out.print("B) 3\n");
				System.out.print("C) 7\n");
				System.out.print("D) 2\n");
                                System.out.print("E) 1\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				
                                System.out.print("Qual a resposta certa?\n");
                                Scanner input3 = new Scanner(System.in);String questao1 = input3.nextLine();

                           if (null != questao1)
                               switch (questao1) {
                    case "A":
                    case "a":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"c\"\n");
                        errado_1++;
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"c\"\n");
                        errado_1++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta correta\n");
                        certo_1++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"c\"\n");
                        errado_1++;
                        break;
                //*/
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"c\"\n");
                        errado_1++;
                        break;
                    default:
                        break;
                }//*/
                                System.out.print("-------------------------------------------------------------------------------\n");
				System.in.read();
				System.out.print("Pressione \"enter\" para continuar...");
				System.in.read();				
				System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Facil  |\n",contp_1++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("1 hectare equivale a: \n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 10.000 metros quadrados\n");
				System.out.print("B) 1.000 metros quadrados\n");
				System.out.print("C) 100.000 metros quadrados\n");
				System.out.print("D) 1000 metros quadrados\n");
                                System.out.print("D) 100 metros quadrados\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input43 = new Scanner(System.in);
				String questao2 = input43.nextLine();
                if (null != questao2) 
                    switch (questao2) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_1++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    default:
                        break;
                }  
                                System.out.print("-------------------------------------------------------------------------------\n");
				System.in.read();
				System.out.print("Pressione \"enter\" para continuar...");
				System.in.read();				
				System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Facil  |\n",contp_1++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("1 hectare equivale a: \n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 10.000 metros quadrados\n");
				System.out.print("B) 1.000 metros quadrados\n");
				System.out.print("C) 100.000 metros quadrados\n");
				System.out.print("D) 1000 metros quadrados\n");
                                System.out.print("D) 100 metros quadrados\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				
                                System.out.print("Qual a resposta certa?\n");
                                Scanner input55 = new Scanner(System.in);
				String questao3 = input55.nextLine();
                if (null != questao3) 
                    switch (questao3) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_1++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    default:
                        break;
                }
                System.out.print("-------------------------------------------------------------------------------\n");
				System.in.read();
				System.out.print("Pressione \"enter\" para continuar...");
				System.in.read();				
				System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Facil  |\n",contp_1++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("1 hectare equivale a: \n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 10.000 metros quadrados\n");
				System.out.print("B) 1.000 metros quadrados\n");
				System.out.print("C) 100.000 metros quadrados\n");
				System.out.print("D) 1000 metros quadrados\n");
                                System.out.print("D) 100 metros quadrados\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input615 = new Scanner(System.in);
				String questao4 = input615.nextLine();
                if (null != questao4) 
                    switch (questao4) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_1++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    default:
                        break;
                }
                System.out.print("-------------------------------------------------------------------------------\n");
				System.in.read();
				System.out.print("Pressione \"enter\" para continuar...");
				System.in.read();				
				System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Facil  |\n",contp_1++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("1 hectare equivale a: \n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 10.000 metros quadrados\n");
				System.out.print("B) 1.000 metros quadrados\n");
				System.out.print("C) 100.000 metros quadrados\n");
				System.out.print("D) 1000 metros quadrados\n");
                                System.out.print("D) 100 metros quadrados\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input77 = new Scanner(System.in);
				String questao5 = input77.nextLine();
                if (null != questao5) 
                    switch (questao5) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_1++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    default:
                        break;
                }
                System.out.print("-------------------------------------------------------------------------------\n");
				System.in.read();
				System.out.print("Pressione \"enter\" para continuar...");
				System.in.read();				
				System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Facil  |\n",contp_1++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("1 hectare equivale a: \n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 10.000 metros quadrados\n");
				System.out.print("B) 1.000 metros quadrados\n");
				System.out.print("C) 100.000 metros quadrados\n");
				System.out.print("D) 1000 metros quadrados\n");
                                System.out.print("D) 100 metros quadrados\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input90 = new Scanner(System.in);
				String questao6 = input90.nextLine();
                if (null != questao6) 
                    switch (questao6) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_1++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    default:
                        break;
                }
                System.out.print("-------------------------------------------------------------------------------\n");
				System.in.read();
				System.out.print("Pressione \"enter\" para continuar...");
				System.in.read();				
				System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Facil  |\n",contp_1++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("1 hectare equivale a: \n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 10.000 metros quadrados\n");
				System.out.print("B) 1.000 metros quadrados\n");
				System.out.print("C) 100.000 metros quadrados\n");
				System.out.print("D) 1000 metros quadrados\n");
                                System.out.print("D) 100 metros quadrados\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input4000 = new Scanner(System.in);
				String questao7 = input4000.nextLine();
                if (null != questao7) 
                    switch (questao7) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_1++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    default:
                        break;
                }
                System.out.print("-------------------------------------------------------------------------------\n");
				System.in.read();
				System.out.print("Pressione \"enter\" para continuar...");
				System.in.read();				
				System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Facil  |\n",contp_1++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("1 hectare equivale a: \n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 10.000 metros quadrados\n");
				System.out.print("B) 1.000 metros quadrados\n");
				System.out.print("C) 100.000 metros quadrados\n");
				System.out.print("D) 1000 metros quadrados\n");
                                System.out.print("D) 100 metros quadrados\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input1000 = new Scanner(System.in);
				String questao8 = input1000.nextLine();
                if (null != questao8) 
                    switch (questao8) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_1++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    default:
                        break;
                }
                System.out.print("-------------------------------------------------------------------------------\n");
				System.in.read();
				System.out.print("Pressione \"enter\" para continuar...");
				System.in.read();				
				System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Facil  |\n",contp_1++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("1 hectare equivale a: \n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 10.000 metros quadrados\n");
				System.out.print("B) 1.000 metros quadrados\n");
				System.out.print("C) 100.000 metros quadrados\n");
				System.out.print("D) 1000 metros quadrados\n");
                                System.out.print("D) 100 metros quadrados\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input20 = new Scanner(System.in);
				String questao9 = input20.nextLine();
                if (null != questao9) 
                    switch (questao9) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_1++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    default:
                        break;
                }
                System.out.print("-------------------------------------------------------------------------------\n");
				System.in.read();
				System.out.print("Pressione \"enter\" para continuar...");
				System.in.read();				
				System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Facil  |\n",contp_1++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("1 hectare equivale a: \n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 10.000 metros quadrados\n");
				System.out.print("B) 1.000 metros quadrados\n");
				System.out.print("C) 100.000 metros quadrados\n");
				System.out.print("D) 1000 metros quadrados\n");
                                System.out.print("D) 100 metros quadrados\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input21 = new Scanner(System.in);
				String questao10 = input21.nextLine();
                if (null != questao10) 
                    switch (questao10) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_1++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_1++;
                        break;
                    default:
                        break;//*/
                }
                System.out.print("As pergunstas deste nivel terminaram.\n\n"
                        + "Reinicie o programa e escolha outro nível \n\n");
                
                System.out.print("--------------------- NIVEL FACIL -------------------\n");
                System.out.printf("Perguntas respondidas: %d\n",contp_1 - 1 + totp_1 - 1);
		System.out.printf("Acertos..: %d\n",certo_1);
		System.out.printf("Erros....: %d\n",errado_1);
		System.out.printf("Pontuacao: %d\n\n",certo_1 * 1);
                System.out.print("---------------------------------------------------\n");
                
                System.out.print("Deseja jogar em outro nivel (s/n)? ");                
		Scanner inpute = new Scanner(System.in);
		String se1 = inpute.nextLine();

                if (null != se1)
                switch (se1) {
                    case "S":
                    case "s":
                        break;
                    case "N":
                    case "n":
                        System.out.print("Você finalizou o quiz Parabéns\n\n");
                        System.exit(0);
                        break;         
                    }
                case 2:
                                System.out.print("*=============================================================================*\n");
				System.out.print("|  ___   ___  ___  ___    ___  _________  ___                                 |\n");
				System.out.print("|  XXX_  XXX  XXX  XXX    XXX  XXXXXXXXX  XXX                                 |\n");
				System.out.print("|  XXXX_ XXX  XXX  XXX    XXX  XXXXXXXXX  XXX                                 |\n");
				System.out.print("|  XXXXX_XXX  XXX  XXX_  _XXX  XXX____    XXX                                 |\n");
				System.out.print("|  XXXXXXXXX  XXX   XXX__XXX   XXXXXXX    XXX                                 |\n");
				System.out.print("|  XXX XXXXX  XXX    XXXXXX    XXX______  XXX______                           |\n");
				System.out.print("|  XXX  XXXX  XXX     XXXX     XXXXXXXXX  XXXXXXXXX                           |\n");
				System.out.print("|  XXX   XXX  XXX      XX      XXXXXXXXX  XXXXXXXXX                           |\n");
				System.out.print("|                          ___     ___  _________  ________   ___  _________  |\n");
				System.out.print("|                          XXX_   _XXX  XXXXXXXXX  XXXXXXXX   XXX  XXXXXXXXX  |\n");
				System.out.print("|                          XXXX_ _XXXX  XXXXXXXXX  XXXXXXXXX  XXX  XXXXXXXXX  |\n");
				System.out.print("|                          XXXXX_XXXXX  XXX____    XXX   XXX  XXX  XXX   XXX  |\n");
				System.out.print("|                          XXX XXX XXX  XXXXXXX    XXX    XX  XXX  XXX   XXX  |\n");
				System.out.print("|                          XXX  X  XXX  XXX______  XXX___XXX  XXX  XXX___XXX  |\n");
				System.out.print("|                          XXX     XXX  XXXXXXXXX  XXXXXXXXX  XXX  XXXXXXXXX  |\n");
				System.out.print("|                          XXX     XXX  XXXXXXXXX  XXXXXXXX   XXX  XXXXXXXXX  |\n");
				System.out.print("|                                                                             |\n");
				System.out.print("*=============================================================================*\n\n");
				System.out.print("              AS PERGUNSTAS DE NIVEL \"MEDIO\" VALEM 2 PONTOS CADA\n\n");
				System.in.read();
				System.out.print("Pressione \"enter\" para continuar...");
                                System.in.read();
                                
                                System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Medio  |\n",contp_2++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("QUANTOS ESTADOS POSSUI O BRASIL?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 20 ESTADOS\n");
				System.out.print("B) 25 ESTADOS\n");
				System.out.print("C) 27 ESTADOS\n");
				System.out.print("D) 30 ESTADOS\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input99 = new Scanner(System.in);
				String questao1N = input99.nextLine();
                    if (null != questao1N) 
                    switch (questao1N) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_2++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    default:
                        break;//*/
                    }
                                System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Medio  |\n",contp_2++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("QUANTOS ESTADOS POSSUI O BRASIL?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 20 ESTADOS\n");
				System.out.print("B) 25 ESTADOS\n");
				System.out.print("C) 27 ESTADOS\n");
				System.out.print("D) 30 ESTADOS\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input98 = new Scanner(System.in);
				String questao2N = input98.nextLine();
                    if (null != questao2N) 
                    switch (questao2N) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_2++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    default:
                        break;//*/
                    }
                              System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Medio  |\n",contp_2++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("QUANTOS ESTADOS POSSUI O BRASIL?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 20 ESTADOS\n");
				System.out.print("B) 25 ESTADOS\n");
				System.out.print("C) 27 ESTADOS\n");
				System.out.print("D) 30 ESTADOS\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input97 = new Scanner(System.in);
				String questao3N = input97.nextLine();
                    if (null != questao3N) 
                    switch (questao3N) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_2++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    default:
                        break;
                    }
                                System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Medio  |\n",contp_2++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("QUANTOS ESTADOS POSSUI O BRASIL?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 20 ESTADOS\n");
				System.out.print("B) 25 ESTADOS\n");
				System.out.print("C) 27 ESTADOS\n");
				System.out.print("D) 30 ESTADOS\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input96 = new Scanner(System.in);
				String questao4N = input96.nextLine();
                    if (null != questao4N) 
                    switch (questao4N) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_2++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    default:
                        break;
                    }
                                System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Medio  |\n",contp_2++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("QUANTOS ESTADOS POSSUI O BRASIL?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 20 ESTADOS\n");
				System.out.print("B) 25 ESTADOS\n");
				System.out.print("C) 27 ESTADOS\n");
				System.out.print("D) 30 ESTADOS\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input95 = new Scanner(System.in);
				String questao5N = input95.nextLine();
                    if (null != questao5N) 
                    switch (questao5N) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_2++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    default:
                        break;
                    }
                                System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Medio  |\n",contp_2++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("QUANTOS ESTADOS POSSUI O BRASIL?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 20 ESTADOS\n");
				System.out.print("B) 25 ESTADOS\n");
				System.out.print("C) 27 ESTADOS\n");
				System.out.print("D) 30 ESTADOS\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input94 = new Scanner(System.in);
				String questao6N = input94.nextLine();
                    if (null != questao6N) 
                    switch (questao6N) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_2++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    default:
                        break;
                    }
                                System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Medio  |\n",contp_2++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("QUANTOS ESTADOS POSSUI O BRASIL?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 20 ESTADOS\n");
				System.out.print("B) 25 ESTADOS\n");
				System.out.print("C) 27 ESTADOS\n");
				System.out.print("D) 30 ESTADOS\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input122 = new Scanner(System.in);
				String questao7N = input122.nextLine();
                    if (null != questao7N) 
                    switch (questao7N) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_2++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    default:
                        break;
                    }
                                System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Medio  |\n",contp_2++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("QUANTOS ESTADOS POSSUI O BRASIL?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 20 ESTADOS\n");
				System.out.print("B) 25 ESTADOS\n");
				System.out.print("C) 27 ESTADOS\n");
				System.out.print("D) 30 ESTADOS\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input199 = new Scanner(System.in);
				String questao8N = input199.nextLine();
                    if (null != questao8N) 
                    switch (questao8N) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_2++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    default:
                        break;
                    }
                                System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Medio  |\n",contp_2++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("QUANTOS ESTADOS POSSUI O BRASIL?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 20 ESTADOS\n");
				System.out.print("B) 25 ESTADOS\n");
				System.out.print("C) 27 ESTADOS\n");
				System.out.print("D) 30 ESTADOS\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input198 = new Scanner(System.in);
				String questao9N = input198.nextLine();
                    if (null != questao9N) 
                    switch (questao9N) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_2++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    default:
                        break;
                    }
                                System.out.print("*--------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Medio  |\n",contp_2++);
				System.out.print("*--------------------------------*\n\n");
				System.out.print("QUANTOS ESTADOS POSSUI O BRASIL?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) 20 ESTADOS\n");
				System.out.print("B) 25 ESTADOS\n");
				System.out.print("C) 27 ESTADOS\n");
				System.out.print("D) 30 ESTADOS\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input56 = new Scanner(System.in);
				String questao10N = input56.nextLine();
                    if (null != questao10N) 
                    switch (questao10N) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_2++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_2++;
                        break;
                    default:
                        break;//*/
                    }
                           System.out.print("As pergunstas deste nivel terminaram.\n\n"
                        + "Reinicie o programa e escolha outro nível \n\n");
                System.out.print("-------------------- NIVEL MEDIO --------------------\n");
		System.out.printf("Perguntas respondidas: %d\n",contp_2 - 1 + totp_2 - 1);
		System.out.printf("Acertos..: %d\n",certo_2);
		System.out.printf("Erros....: %d\n",errado_2);
		System.out.printf("Pontuacao: %d\n\n",certo_2 * 1);                  
                System.out.print("---------------------------------------------------\n");
                System.out.print("Deseja jogar em outro nivel (s/n)? ");
                Scanner input12345 = new Scanner(System.in);
		String se = input12345.nextLine();
                if (null != se) 
                    switch (se) {
                    case "S":
                    case "s":                                               
                        break;
                    case "N":
                    case "n": 
                        System.out.print("Você finalizou o quiz Parabéns\n\n");
                        System.exit(0);
                        break;             
                    }
                
                    case 3:
                    {
                                System.out.print("*=============================================================================*\n");
				System.out.print("|  ___   ___  ___  ___    ___  _________  ___                                 |\n");
				System.out.print("|  XXX_  XXX  XXX  XXX    XXX  XXXXXXXXX  XXX                                 |\n");
				System.out.print("|  XXXX_ XXX  XXX  XXX    XXX  XXXXXXXXX  XXX                                 |\n");
				System.out.print("|  XXXXX_XXX  XXX  XXX_  _XXX  XXX____    XXX                                 |\n");
				System.out.print("|  XXXXXXXXX  XXX   XXX__XXX   XXXXXXX    XXX                                 |\n");
				System.out.print("|  XXX XXXXX  XXX    XXXXXX    XXX______  XXX______                           |\n");
				System.out.print("|  XXX  XXXX  XXX     XXXX     XXXXXXXXX  XXXXXXXXX                           |\n");
				System.out.print("|  XXX   XXX  XXX      XX      XXXXXXXXX  XXXXXXXXX                           |\n");
				System.out.print("|                  ________   ___  _________  ___  _________  ___  ___        |\n");
				System.out.print("|                  XXXXXXXX   XXX  XXXXXXXXX  XXX  XXXXXXXXX  XXX  XXX        |\n");
				System.out.print("|                  XXXXXXXXX  XXX  XXXXXXXXX  XXX  XXXXXXXXX  XXX  XXX        |\n");
				System.out.print("|                  XXX   XXX  XXX  XXX___     XXX  XXX        XXX  XXX        |\n");
				System.out.print("|                  XXX    XX  XXX  XXXXXX     XXX  XXX        XXX  XXX        |\n");
				System.out.print("|                  XXX___XXX  XXX  XXXXXX     XXX  XXX______  XXX  XXX______  |\n");
				System.out.print("|                  XXXXXXXXX  XXX  XXX        XXX  XXXXXXXXX  XXX  XXXXXXXXX  |\n");
				System.out.print("|                  XXXXXXXX   XXX  XXX        XXX  XXXXXXXXX  XXX  XXXXXXXXX  |\n");
				System.out.print("|                                                                             |\n");
				System.out.print("*=============================================================================*\n\n");
				System.out.print("            AS PERGUNSTAS DE NIVEL \"DIFICIL\" VALEM 3 PONTOS CADA\n\n");
				
                                System.in.read();
				System.out.print("Pressione \"enter\" para continuar...");
				System.in.read();
                                
                                System.out.print("*----------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Dificil  |\n",contp_3++);
				System.out.print("*----------------------------------*\n\n");
				System.out.print("O QUE E UM ATOMO?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) MENOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("B) BOLHAS QUE SAEM DA AGUA QUANDO ELA ENTRA EM EBULICAO\n");
				System.out.print("C) EXPLOSIVO\n");
				System.out.print("D) MAIOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input45 = new Scanner(System.in);
				String questao1d = input45.nextLine();
                    if (null != questao1d) 
                    switch (questao1d) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_3++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    default:
                        break;
                    }
                                System.out.print("*----------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Dificil  |\n",contp_3++);
				System.out.print("*----------------------------------*\n\n");
				System.out.print("O QUE E UM ATOMO?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) MENOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("B) BOLHAS QUE SAEM DA AGUA QUANDO ELA ENTRA EM EBULICAO\n");
				System.out.print("C) EXPLOSIVO\n");
				System.out.print("D) MAIOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input455 = new Scanner(System.in);
				String questao2d = input455.nextLine();
                    if (null != questao2d) 
                    switch (questao2d) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_3++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    default:
                        break;
                    }
                                System.out.print("*----------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Dificil  |\n",contp_3++);
				System.out.print("*----------------------------------*\n\n");
				System.out.print("O QUE E UM ATOMO?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) MENOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("B) BOLHAS QUE SAEM DA AGUA QUANDO ELA ENTRA EM EBULICAO\n");
				System.out.print("C) EXPLOSIVO\n");
				System.out.print("D) MAIOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input545 = new Scanner(System.in);
				String questao3d = input545.nextLine();
                    if (null != questao3d) 
                    switch (questao3d) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_3++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    default:
                        break;
                    }
                                System.out.print("*----------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Dificil  |\n",contp_3++);
				System.out.print("*----------------------------------*\n\n");
				System.out.print("O QUE E UM ATOMO?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) MENOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("B) BOLHAS QUE SAEM DA AGUA QUANDO ELA ENTRA EM EBULICAO\n");
				System.out.print("C) EXPLOSIVO\n");
				System.out.print("D) MAIOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input1145 = new Scanner(System.in);
				String questao4d = input1145.nextLine();
                    if (null != questao4d) 
                    switch (questao4d) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_3++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    default:
                        break;
                    }
                                System.out.print("*----------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Dificil  |\n",contp_3++);
				System.out.print("*----------------------------------*\n\n");
				System.out.print("O QUE E UM ATOMO?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) MENOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("B) BOLHAS QUE SAEM DA AGUA QUANDO ELA ENTRA EM EBULICAO\n");
				System.out.print("C) EXPLOSIVO\n");
				System.out.print("D) MAIOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input425 = new Scanner(System.in);
				String questao5d = input425.nextLine();
                    if (null != questao5d) 
                    switch (questao5d) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_3++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    default:
                        break;
                    }
                                System.out.print("*----------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Dificil  |\n",contp_3++);
				System.out.print("*----------------------------------*\n\n");
				System.out.print("O QUE E UM ATOMO?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) MENOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("B) BOLHAS QUE SAEM DA AGUA QUANDO ELA ENTRA EM EBULICAO\n");
				System.out.print("C) EXPLOSIVO\n");
				System.out.print("D) MAIOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input435 = new Scanner(System.in);
				String questao6d = input435.nextLine();
                    if (null != questao6d) 
                    switch (questao6d) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_3++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    default:
                        break;
                    }
                                System.out.print("*----------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Dificil  |\n",contp_3++);
				System.out.print("*----------------------------------*\n\n");
				System.out.print("O QUE E UM ATOMO?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) MENOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("B) BOLHAS QUE SAEM DA AGUA QUANDO ELA ENTRA EM EBULICAO\n");
				System.out.print("C) EXPLOSIVO\n");
				System.out.print("D) MAIOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input454 = new Scanner(System.in);
				String questao7d = input454.nextLine();
                    if (null != questao7d) 
                    switch (questao7d) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_3++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    default:
                        break;
                    }
                                System.out.print("*----------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Dificil  |\n",contp_3++);
				System.out.print("*----------------------------------*\n\n");
				System.out.print("O QUE E UM ATOMO?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) MENOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("B) BOLHAS QUE SAEM DA AGUA QUANDO ELA ENTRA EM EBULICAO\n");
				System.out.print("C) EXPLOSIVO\n");
				System.out.print("D) MAIOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                Scanner input4454 = new Scanner(System.in);
				String questao8d = input4454.nextLine();
                    if (null != questao8d) 
                    switch (questao8d) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_3++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    default:
                        break;
                    }
                                System.out.print("*----------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Dificil  |\n",contp_3++);
				System.out.print("*----------------------------------*\n\n");
				System.out.print("O QUE E UM ATOMO?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) MENOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("B) BOLHAS QUE SAEM DA AGUA QUANDO ELA ENTRA EM EBULICAO\n");
				System.out.print("C) EXPLOSIVO\n");
				System.out.print("D) MAIOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input4655 = new Scanner(System.in);
				String questao9d = input4655.nextLine();
                    if (null != questao9d) 
                    switch (questao9d) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_3++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    default:
                        break;
                    }
                                System.out.print("*----------------------------------*\n");
				System.out.printf("|  Pergunta n. %2d - Nivel Dificil  |\n",contp_3++);
				System.out.print("*----------------------------------*\n\n");
				System.out.print("O QUE E UM ATOMO?\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("A) MENOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("B) BOLHAS QUE SAEM DA AGUA QUANDO ELA ENTRA EM EBULICAO\n");
				System.out.print("C) EXPLOSIVO\n");
				System.out.print("D) MAIOR PORCAO EM QUE PODE SER DIVIDIDO UM ELEMENTO QUIMICO\n");
				System.out.print("-------------------------------------------------------------------------------\n");
				System.out.print("Qual a resposta certa?\n");
                                Scanner input4565 = new Scanner(System.in);
				String questao10d = input4565.nextLine();
                    if (null != questao10d) 
                    switch (questao10d) {
                    case "A":
                    case "a":
                        System.out.print("Resposta correta\n");
                        certo_3++;                        
                        break;
                    case "B":
                    case "b":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "C":
                    case "c":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    case "D":
                    case "d":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                
                    case "E":
                    case "e":
                        System.out.print("Resposta errada\n");
                        System.out.print("Resposta correta: Letra \"a\"\n");
                        errado_3++;
                        break;
                    default:
                        break;
                    }
                        System.out.print("As pergunstas deste nivel terminaram.\n\n"
                        + "Reinicie o programa e escolha outro nível \n\n");
         System.out.print("------------------- NIVEL DIFICIL -------------------\n");
		System.out.printf("Perguntas respondidas: %d\n",contp_3 - 1 + totp_3 - 1);
		System.out.printf("Acertos..: %d\n",certo_3);
		System.out.printf("Erros....: %d\n",errado_3);
		System.out.printf("Pontuacao: %d\n",certo_3 * 3);
		System.in.read();
		System.in.read();
        System.out.print("------------------------------------------------------\n");
        System.out.print("---------------------------------------------------\n");
        System.out.print("Deseja verificar o resultado final (s/n)? ");
        Scanner input12346 = new Scanner(System.in);
		String se2 = input12346.nextLine();
                if (null != se2) 
                    switch (se2) {
                    case "S":
                    case "s":                                               
                        break;
                    case "N":
                    case "n": 
                        System.out.print("Você finalizou o quiz Parabéns\n\n");
                        System.exit(0);
                        break;}}
                System.out.print("================ RESULTADOS DO JOGO =================\n");
		System.out.printf("Participante: %s\n",nome);
		System.out.printf("Perguntas respondidas: %d\n",totp_1 - 1 + contp_1 - 1 + totp_2 - 1 + contp_2 - 1 + totp_3 - 1 + contp_3 - 1);
		System.out.printf("Total de acertos.....: %d\n",certo_1 + certo_2 + certo_3);
		System.out.printf("Total de erros.......: %d\n",errado_1 + errado_2 + errado_3);
		System.out.printf("Pontuacao total......: %d\n\n",(certo_1 * 1) + (certo_2 * 2) + (certo_3 * 3));		
		System.out.print("--------------------- NIVEL FACIL -------------------\n");
                System.out.printf("Perguntas respondidas: %d\n",contp_1 - 1 + totp_1 - 1);
		System.out.printf("Acertos..: %d\n",certo_1);
		System.out.printf("Erros....: %d\n",errado_1);
		System.out.printf("Pontuacao: %d\n\n",certo_1 * 1);
                System.out.print("---------------------------------------------------\n");
		System.out.print("-------------------- NIVEL MEDIO --------------------\n");
		System.out.printf("Perguntas respondidas: %d\n",contp_2 - 1 + totp_2 - 1);
		System.out.printf("Acertos..: %d\n",certo_2);
		System.out.printf("Erros....: %d\n",errado_2);
		System.out.printf("Pontuacao: %d\n\n",certo_2 * 2);
		System.out.print("------------------- NIVEL DIFICIL -------------------\n");
		System.out.printf("Perguntas respondidas: %d\n",contp_3 - 1 + totp_3 - 1);
		System.out.printf("Acertos..: %d\n",certo_3);
		System.out.printf("Erros....: %d\n",errado_3);
		System.out.printf("Pontuacao: %d\n",certo_3 * 3);
		System.in.read();
		System.in.read();
        System.out.print("------------------------------------------------------\n");
                //}//*/
                //  }
                
                            
   }
                
                
   }
                
}
