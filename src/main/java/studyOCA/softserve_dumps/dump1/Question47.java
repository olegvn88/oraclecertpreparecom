package studyOCA.softserve_dumps.dump1;

import java.util.Random;

public interface Question47 {
    String encrypt(String plaintext, int shift);

    String decrypt(String ciphertext, int shift);

    default int getRandomShift(int max) {
        return (new Random()).nextInt(max) + 1;
    }
}

interface AutoShifterCipher extends Question47 {
    public byte[] encrypt(byte[] plaintext);
    public byte[] decrypt(byte[] ciphertext);
}

abstract class CaeserCipher implements Question47 {
    public String encryptAndDecrypt(String txt) {
     return "";
    }
}

class AppQuestion47 implements AutoShifterCipher {
    public static void main(String[] args) {

    }

    @Override
    public String encrypt(String plaintext, int shift) {
        return null;
    }

    @Override
    public String decrypt(String ciphertext, int shift) {
        return null;
    }

    @Override
    public byte[] encrypt(byte[] plaintext) {
        return new byte[0];
    }

    @Override
    public byte[] decrypt(byte[] ciphertext) {
        return new byte[0];
    }
}