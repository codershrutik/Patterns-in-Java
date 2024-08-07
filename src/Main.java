public class Main{
    public static void main(String[] args) {
        
        //SOLID RECTANGLE
        // int n = 4;
        // int m = 5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //HOLLOW RECTANGLE
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(i == 1 || j == 1 || i == n || j == m){
        //             System.out.print("* ");
        //         } else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        //HALF PYRAMID
        // int n = 4;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //INVERTED HALF PYRAMID
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //INVERTED HALF PYRAMID - ROTATED BY 180DEG
        // for(int i=1;i<=n;i++){
        //     //spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     //stars
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //HALF PYRAMID WITH NUMBERS
        int n = 5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        //INVERTED HALD PYRAMID WITH NUMBERS
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
        
        //INVERTED HALF PYRAMID - ROTATED BY 180 DEG - WITH NUMBERS
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}