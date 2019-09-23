package cn.edu.usts.cn.edu.usts.test;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOUtil_read {
    public static void main(String[] args) throws IOException {
        byte[] data = FileUtils.readFileToByteArray(new File("data.bin"));
        OutputStream output = new FileOutputStream("data_fos.bin");
        IOUtils.write(data, output);
    }
}
