package cn.edu.usts.cn.edu.usts.test;

import com.twelvemonkeys.io.FileUtil;
import org.apache.commons.codec.binary.StringUtils;

import java.io.File;
import java.io.IOException;

public class FileUtil_write {
    public static void main(String[] args) throws IOException {
        String data_str = "it is very important!";
        byte[] data = StringUtils.getBytesUtf8(data_str);
        boolean b = FileUtil.write(new File("data.bin"), data);
    }
}
