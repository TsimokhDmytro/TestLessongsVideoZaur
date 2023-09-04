package Lesson18.HomeWork;

public class ShowArray {

    public static void showArray(String[][] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arr[i].length; j++) {
                if (j != arr[i].length - 1) {
                    System.out.print(arr[i][j] + ", ");
                } else {
                    System.out.print(arr[i][j]);
                }
            }
            if (i != arr.length - 1) {
                System.out.print("}; ");
            } else {
                System.out.print("} ");
            }
        }
        System.out.println("}\n");
    }


    public static void main(String[] args) {

        String[][] array1 = {{"apple", "arange"}, {"hello", "bye", "hi"}, {"end", "start"}};
        String[][] array2 = {{"apple", "arange", "ghh", "fgjjuy", "fgr"}, {"hello", "bye", "hi"}, {"end", "start"}};
        String[][] array3 = {{"arange"}, {"hi"}, {"start"}};
        String[][] array4 = {{"asd", "arange", "sdvgsdv", "dghfgh", "jhjjj" }, {"bydfgge"}, {}};

        showArray(array1);
        showArray(array2);
        showArray(array3);
        showArray(array4);
        showArray(new String[][]{{"456", "sdf"}, {"hkjjk", "ggg", "aaa"}, {"bn", "ghfg"}});


    }

}
