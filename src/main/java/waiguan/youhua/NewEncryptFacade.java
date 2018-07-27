package waiguan.youhua;

import waiguan.biaozhun.FileReader;
import waiguan.biaozhun.FileWriter;

public class NewEncryptFacade extends AbstractEncryptFacade {
    private FileReader reader;
    private NewCipherMachine cipher;
    private FileWriter writer;

    public NewEncryptFacade()
    {
        reader = new FileReader();
        cipher = new NewCipherMachine();
        writer = new FileWriter();
    }

    public void FileEncrypt(String fileNameSrc, String fileNameDes)
    {
        String plainStr = reader.Read(fileNameSrc);
        String encryptStr = cipher.Encrypt(plainStr);
        writer.Write(encryptStr, fileNameDes);
    }
}
