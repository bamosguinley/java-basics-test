//Déclaratioin de variable 
//Assignation de valeur à un tableau
//Initialisation d'un tableau 
//parcours de tableau


public class MyArray {
    public static void main(String[] args) {
        String[] alpha;
        char[] alphabet = new char[26]; //Déclaration de la variable alphabet qui est un tableau de chaîne de caractère (26 caractères)
        //Assignation d'une variable
        int[] number = { 1, 2, 3, 5, 5 };//Initialisation d'un tableau de nombre 
        byte[] byteTab = new byte[5]; //Initialisation d'un tableau de 5 byte;
        for (int i = 0; i < number.length; i++) {
            System.out.println("L'élément à l'index " + i + " est " + number[i]);
        }
    
    }
}
