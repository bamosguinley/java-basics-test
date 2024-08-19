public class Control {
    public static String parite(int i){
       return i%2==0?i+" est nombre pair":i+" est un nombre impair";
    }
    public static String sup(int x,int y, int z){
        if(x>y){
            if(x>z){
                return "Le plus grand nombre est "+x;
            }else{
              return "Le plus grand nombre est "+z;
            }
        }
        else if(y>z){
            return "Le plus grand nombre est "+y;
        }else{
          return "Le plus grand nombre est "+z;
        }
    }
    public static String clasAge(int age){
        if(age<0){
            return "invalide";
        }else{
            if(age<=12){
              return "Enfant" ;
            }else if(age>=13 && age<=19){
                return "Adolescent";
            }else if(age>=20 && age<=64){
              return "Adulte" ;
            }else{
                return "Sénior";
            }
        }
    }
    public static String checkNote(int note){
        return (note>=50)?"Réussi":"Échoué";
    }  
    public static String remise(int price){
        if (price<100){
            return "Pas de remise";
        }else if(price>=100 && price<=500){
             return "Le montant après remise est " +(price-price*0.1);
        }else{
             return "Le montant après remise est " +(price-price*0.2);  
        }
    }
    public static void main(String[] args){
        System.out.println(parite(2));
        System.out.println(sup(5,3,4));
        System.out.println(clasAge(15));
        System.out.println(checkNote(50));
        System.out.println(remise(300));
    }
}