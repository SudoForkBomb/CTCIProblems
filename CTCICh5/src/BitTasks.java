/**
 * Created by crtaylor123 on 1/21/17.
 */
public class BitTasks {
    int num;
    int i;

    public boolean getBit(int num, int i){
        return ((num & (1 << i)) != 0);

    }

    public int setBit(int num, int i){
        return num | (1 << i);
    }

    public int clearBit(int num, int i){
        int mask = ~(1 << i);
        return num & mask;
    }

    public int clearBitsMSBthroughI(int num, int i) {
        int mask = (1 << i) - 1;
        return num & mask;
    }

    public int clearBitsIthrough0(int num, int i) {
        int mask = (-1 << (i + 1));
        return num & mask;
    }

    public int updateBit(int num, int i, boolean bitIs1) {
        int value = bitIs1 ? 1 : 0;
        int mask = ~(1 << i);
        return (num & mask) | (value << i);
    }

}
