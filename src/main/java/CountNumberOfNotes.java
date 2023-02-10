//Write a program that will count number of notes from given array [1000,500,200,100,50,20,10,5,2,1]
//Input: 562
//Output: 500 1
// 50 1
// 10 1
// 2 1
public class CountNumberOfNotes {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] noteCounter = new int[notes.length];
        int input = 562;

        System.out.println("Notes for input are:");

        for (int i = 0; i < notes.length; i++) {
            if (input >= notes[i]) {
                noteCounter[i] = input / notes[i];
                input = input - notes[i] * noteCounter[i];
                System.out.println(notes[i] + " " + noteCounter[i]);
            }
        }
    }
}
