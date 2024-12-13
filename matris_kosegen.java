public class matris_kosegen {
    public static void main(String[] args) {
        int[][] matris = new int[15][15];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris.length; j++) {
                matris[i][j] = 0;
                matris[i][i] = 1;
                matris[i][matris.length-i-1] = 1;
                System.out.print(matris[i][j]+"  ");
            }
            System.out.println();
            
        }
    }
}
