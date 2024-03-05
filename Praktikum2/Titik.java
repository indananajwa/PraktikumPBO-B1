// class Titik{
//     // deklarasi atribut (double=float/real)
//     double absis;
//     double ordinat;
//     static int counterTitik;

//     // deklarasi konstruktor 
//     Titik(){
//         absis = 0;
//         ordinat = 0;
//         counterTitik++;
//     }
    
//     // pemanggilan dengan overloading constructor
//     Titik(double a, double o){
//         absis = a;
//         ordinat = o;
//         counterTitik++;
//     }

//     // deklarasi metode
//     void setAbsis(double a){
//         absis = a;
//     }
    
//     void setOrdinat(double o){
//         ordinat = o;
//     }
    
//     double getAbsis(){
//         return absis;
//     }
    
//     double getOrdinat(){
//         return ordinat;
//     }

//     int getcounterTitik(){
//         return counterTitik;
//     }
// }

public class Titik{
    // deklarasi atribut (double=float/real)
    private double absis;
    private double ordinat;
    private static int counterTitik;

    // deklarasi konstruktor 
    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    
    // pemanggilan dengan overloading constructor
    public Titik(double a, double o){
        absis = a;
        ordinat = o;
        counterTitik++;
    }

    // deklarasi metode
    public void setAbsis(double a){
        absis = a;
    }
    
    public void setOrdinat(double o){
        ordinat = o;
    }
    
    public double getAbsis(){
        return absis;
    }
    
    public double getOrdinat(){
        return ordinat;
    }

    int getcounterTitik(){
        return counterTitik;
    }
}
