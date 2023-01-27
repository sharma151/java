import java.util.Arrays;
public class Array_length {
    public static void main(String[] args){
        int[] Marks = new int[3];//declaration of Arrays.
        Marks[0]=348;
        Marks[1]=39;
        Marks[2]=44;
        System.out.println(Marks.length);// used to find out the length of Array
        System.out.println(Marks[0]);// before sorting
        Arrays.sort(Marks);
        System.out.println(Marks[0]);// after sorting
    }
}
