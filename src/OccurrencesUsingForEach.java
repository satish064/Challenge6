public class OccurrencesUsingForEach {
    public static void main(String[] args) {

        int[] arr = {1,1,1,2,3,4,2};
        int check = 2;

        int occ = occOfArray(arr,check);

        System.out.println(occ);
    }
    public static int occOfArray(int[] array, int num) {

        int occ = 0;
        for(int Number : array) {
            if(Number == num) {
                occ++;
            }
        }
        return occ;
    }
}
