package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skipSum = 0;
        int countSum = 0;

        if (numberToSkip > lastInRow){
            System.out.println("number to skip is bigger then the last");
        }
        else if (lastInRow<0){
            System.out.println("last number in row is negative");
        }
        else{
            for (int i = 0; i<=lastInRow; i++){
                if (lastInRow / numberToSkip == 1) {
                    countSum =0;
                    skipSum +=i;
                }
                else {
                    if (i%numberToSkip==0){
                        skipSum += i;
                    }
                    else{
                        countSum += i;
                    }

                }
            }

            System.out.println("skipped sum is " + skipSum);
            System.out.println("counted sum is "+ countSum);

        }
    }
}
