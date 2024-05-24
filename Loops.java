public class Loops{


public static void main(String args[]){

// do while loop 



int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 5);



//nested for loop


for (int j = 1; j <= 2; j++) {
  System.out.println("Outer: " + j); // Executes 2 times
  
  // Inner loop
  for (int k = 1; k <= 3; k++) {
    System.out.println(" Inner: " + k);
  }
} 



//for-each loop


String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String l : cars) {
  System.out.println(l);
}



// switch case ..........



int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;

default:
   System.out.println("invalid number");
}
// Outputs "Thursday" (day 4)




}



}