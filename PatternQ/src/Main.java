public class Main {


    public static void main(String[] args) {
//        diamondPattern(5);
        squareParallelBar(5);
        System.out.println();
        squarePlus(5);
        System.out.println();
        squareCross(5);
        System.out.println();
        hollowSquare(5);
        System.out.println();
        increasingTriangle(5);
        System.out.println();
        hollowIncreasingTriangle(5);
        System.out.println();
        hillPattern(5);
        System.out.println();
        hollowHillPattern(5);
        System.out.println();
        diamondPattern2(5);

    }

    public static void diamondPattern2(int n) {

        //its made with 6 sub triangles
        // lets first make the main 1 above triangle with 3 sub traingles

        // Main 1st outer for loop to iterate over half diamond
        for (int row = 1; row <= n; row++) {

            //print the space i.e t1
            for (int sp = 1; sp <= n - row; sp++) {
                System.out.print("  ");
            }
            //print the t2
            for (int col = 1; col < row; col++) {
                if (col == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            //print the t3
            for (int col = 1; col <= row; col++) {
                if (col == row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        //Main 2nd for loop for the lower half of diamond

        for (int row = 1; row < n; row++) {

            //print the space t4
            for (int sp = 1; sp <= row; sp++) {
                System.out.print("  ");
            }

            //print the t5
            for (int col = 1; col <= (n - 1) - row; col++) {
                if (col == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            //print the t6
            for (int col = 1; col <= n - row; col++) {
                if(col == n - row){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }

    public static void hollowHillPattern(int n) {

        // iterate over the rows i,e n rows
        for (int row = 1; row <= n; row++) {

            //print the space
            for (int j = 1; j <= n - row; j++) {
                System.out.print("  ");
            }

            // print the 1st triangle
            for (int k = 1; k < row; k++) {
                if (k == 1 || row == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            //print the 2nd triangle
            for (int l = 1; l <= row; l++) {
                if (l == row || row == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            System.out.println();
        }

    }

    public static void hillPattern(int n) {

        // iterate over the rows i,e n rows
        for (int row = 1; row <= n; row++) {

            //print the space
            for (int j = 1; j <= n - row; j++) {
                System.out.print("  ");
            }

            // print the 1st triangle
            for (int k = 1; k < row; k++) {

                System.out.print("* ");
            }

            //print the 2nd triangle
            for (int l = 1; l <= row; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void hollowIncreasingTriangle(int n) {

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                if (row == n || col == 1 || row == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    public static void increasingTriangle(int n) {

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowSquare(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == 1 || col == n || row == 1 || row == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void squareCross(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == row || col == n + 1 - row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void squarePlus(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == n / 2 + 1 || row == n / 2 + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void squareParallelBar(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == 1 || col == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }


    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    public static void diamondPattern(int n) {

        for (int row = 1; row <= 2 * n - 1; row++) {

            int spaceCount = row <= n ? n - row : row - n;
            int totalColInRow = row <= n ? row : 2 * n - row;

            // print space for the first half
            for (int i = 0; i < spaceCount; i++) {
                System.out.print(" ");
            }

            // print the stars
            for (int col = 1; col <= totalColInRow; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    //        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
    public static void pattern5(int n) {

        // Solution 2: with only 2 for loops || preferred

        for (int row = 1; row < 2 * n; row++) {

            int totalCOlRow = row <= n ? row : 2 * n - row;

            /*int totalCOlRow = 0;
            if( row <= n ){
                totalCOlRow = row;
            }else{
                totalCOlRow = 2 * n - row;
            }*/

            for (int col = 1; col <= totalCOlRow; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

/*
//       Solution 1 : make 2 triangles and join i.e 4 for loops
        // first simple triangle till n
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // reverse triangle but from n-1
        for(int i = 0 ; i< n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
*/

    }


    /*  1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5*/
    public static void pattern4(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}