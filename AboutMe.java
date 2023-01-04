public class AboutMe {
    public static void main (String[] args) {

        String nome = args[0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo" + nome + "" + sobrenome);
        System.out.println("Tenho" + idade + "anos");
        System.out.println("Minha altura é" + altura + "cm");
    }  
}


//Localiza a pasta "bin" no Terminal (cmd), ex:
// estudos/dio-trilha/bin > java AboutMe GLEYSSOM SAMPAIO 28 1.58
//press Enter e o sistema organizará os parâmentros.