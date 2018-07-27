package waiguan;

import waiguan.biaozhun.EncryptFacade;

public class Test {
    public static void main(String[] args) {
        EncryptFacade ef = new EncryptFacade();
        ef.FileEncrypt("readme.txt", "des"+System.currentTimeMillis()+".txt");
    }
}
