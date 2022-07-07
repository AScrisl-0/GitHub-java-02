package scr;

public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE=10;
        final int NRATES=6;
        final int NYEARS=10;
        double[] intersetRate=new double[NRATES];
        for  (int j=0;j<intersetRate.length;j++){
            intersetRate[j]=(STARTRATE+j)/100.0;
        }
        double[][] balances =new double[NYEARS][NRATES];
        for (int i=0;i<balances.length;i++){
            for (int j=0;j< balances[i].length;j++){
                double oldBalance=balances[i-1][j];
                double interest=oldBalance*intersetRate[j];
                balances[i][j]=oldBalance+interest;
            }
        }
        for (int j=0;j<intersetRate.length;j++){
            System.out.printf("%9.0f%%",100*intersetRate[j]);
        }
        System.out.println();
        for (double[] row:balances){
            for (double b:row){
                System.out.printf("%10.2f",b);
            }
            System.out.println();
        }
    }
}
