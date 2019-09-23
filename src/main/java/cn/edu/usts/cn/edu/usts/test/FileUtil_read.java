package cn.edu.usts.cn.edu.usts.test;

import com.twelvemonkeys.io.FileUtil;
import org.apache.commons.codec.binary.StringUtils;

import java.io.IOException;

public class FileUtil_read {
    public static void main(String[] args) throws IOException {
        byte[] data = FileUtil.read("data.bin");
        String data_str = StringUtils.newStringUtf8(data);
        System.out.println(data_str);
    }
}
