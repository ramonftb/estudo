import java.util.Scanner;

public class Exercicio1 {


	public static void main(String[] args) {
		
		
		int dia, mes, anoNasc, anoAtual, maxDia= 0;
		String nomeMes;
		
		System.out.println("Em numero, informe o mes de nascimento: ");
		mes = new Scanner(System.in).nextInt();
		
		while (mes > 12 || mes == 0){
			System.out.println("Mes informado invalido");
			System.out.println("Informe o mes de nascimento:");
			mes = new Scanner(System.in).nextInt();		
		}
		
		switch (mes){
		
		case 1:
			nomeMes = "Janeiro";
			maxDia = 31;
			break;
		case 2:
			nomeMes = "fevereiro";
			maxDia = 28;
			break;
		case 3:
			nomeMes = "Março";
			maxDia = 31;
			break;
		case 4:
            nomeMes = "abril";
            maxDia = 30;
            break;
        case 5:
            nomeMes = "maio";
            maxDia = 31;
            break;
        case 6:
            nomeMes = "junho";
            maxDia = 30;
            break;
        case 7:
            nomeMes = "julho";
            maxDia = 31;
            break;
        case 8:
            nomeMes = "agosto";
            maxDia = 31;
            break;
        case 9:
            nomeMes = "setembro";
            maxDia = 30;
            break;
        case 10:
            nomeMes = "outubro";
            maxDia = 31;
            break;
        case 11:
            nomeMes = "novembro";
            maxDia = 30;
            break;
        case 12:
            nomeMes = "dezembro";
            maxDia = 31;
            break;
		default:
			nomeMes = "Mes invalido";
		}
		
		System.out.println("Agora, informe o dia de nascimento: ");
		dia = new Scanner(System.in).nextInt();
		
		while(dia > maxDia || dia == 0){
			System.out.println(nomeMes+" tem "+maxDia+" dias.");
			System.out.println("dia informado invalido");
	        System.out.println("informe o dia de nascimento:");
	        dia = new Scanner(System.in).nextInt();
		}
		
		System.out.println("Favor informe o ano atual: ");
		anoAtual = new Scanner(System.in).nextInt();
		System.out.println("Favor informe o ano do seu nascimento: ");
		anoNasc = new Scanner(System.in).nextInt();
		
        System.out.println("voce nasceu em: " + dia + " de " + nomeMes);
        int idade = anoAtual - anoNasc;
        System.out.println("Você tem "+idade+" anos");
        

 
		
		
		
		
							//Exercicio 1
//	//Determine qual é a idade que o usuário faz no ano atual.
//	//Para isso solicite o ano de nascimento do usuário e o ano atual.
//	
//		int anoAtual, anoNascimento, qtaAnos;
//		
//		System.out.println("Entre com a data atual:");
//		anoAtual = new Scanner(System.in).nextInt();
//		System.out.println("Entre com a data do seu Nascimento");
//		anoNascimento = new Scanner(System.in).nextInt();
//		qtaAnos = anoAtual - anoNascimento;
//		System.out.println("A sua idade é: "+ qtaAnos + " anos");
		
		
////   A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, 		
////   ficou de recuperação ou foi reprovado. 
////   A média de aprovação é &gt;= 7.0; 
////   a média de recuperação é &gt;= 5.0 e &lt; 7.0; e 
////   a média do reprovado é &lt; 5.0
//		
//		int media, nota1, nota2, nota3;
//		
//		System.out.println("Digite sua primeira nota:");
//		nota1 = new Scanner(System.in).nextInt();
//		System.out.println("Digite sua segunda nota:");
//		nota2 = new Scanner(System.in).nextInt();
//		System.out.println("Digite sua terceira nota:");
//		nota3 = new Scanner(System.in).nextInt();
//		
//		media = (nota1 + nota2 + nota3) / 3;
//		
//		if(nota1 > 10 || nota2 > 10 || nota3 > 10){
//			System.out.println("Nota invalida!");
//		}
//		
//		if(media >= 7){
//			System.out.println("Você foi aprovado !");
//		}
//		
//		else if(media >= 5 && media < 7){
//			System.out.println("Você está de recuperação com a media: " + media);
//			
//		}
//		
//		else{
//			System.out.println("Você está reprovado");
//			
//		}
		
	
    }
}