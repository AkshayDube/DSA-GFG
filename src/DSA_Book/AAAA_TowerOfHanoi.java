package DSA_Book;

public class AAAA_TowerOfHanoi {
    public static void main(String[] args) {
        int totalDisk = 4;
        char fromPeg, toPeg, auxPeg;
        fromPeg = 'A';
        toPeg = 'C';
        auxPeg = 'B';
        TowerOfHanoi(totalDisk, fromPeg, toPeg, auxPeg);
    }

    private static void TowerOfHanoi(int totalDisk, char fromPeg, char toPeg, char auxPeg) {
        //basecase
        if (totalDisk == 1) {
            System.out.printf("\nMove Disk 1 from %s to %s", fromPeg, toPeg);
            return;
        }
        //move n-1 disk from A to B using C as auxiliary
        TowerOfHanoi(totalDisk - 1, fromPeg, auxPeg, toPeg);
        //move nth disk from A to C
        System.out.printf("\nMove Disk %d from %s to %s", totalDisk, fromPeg, toPeg);
        //move n-1 disk from B to C using A as auxillary
        TowerOfHanoi(totalDisk - 1, auxPeg, toPeg, fromPeg);
    }
}
