package lesson5;

public class Arrays {
    public static void main(String[] args){
//        int[] grades;  //declare
//        grades = new int[9]; //initialize

        int[] grades = new int[9];
        System.out.println(grades.length);
        for (int i = 0; i < grades.length; i++) {
            grades[i] = i;
            grades[0]=78;
            System.out.println(grades[i]);
        }
        int[] newGrades = grades;


//        for (int i=0; i< newGrades.length; i++){
//            newGrades[1] =45;
//            System.out.println(newGrades[i]);
//        }
       // printElements(newGrades);


//        String[] seasons = new String[4];
//        seasons[0]="Winter";
//        seasons[1]="Spring";
//        seasons[2]="Summer";
//        seasons[3]="Autumn";
//

        String[] seasons = {"Winter","Spring", "Summer","Autumn"};
        for(int i= 0; i< seasons.length;i++){
            System.out.println(seasons[i]);
        }



    }








//    public static void printElements(int[] array){
//        for(int i = 0; i< array.length;i++){
//            System.out.println(array[i]);
//        }
//    }



}
