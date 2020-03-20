package com.company;

import java.io.*;

public class CovertCodeUtil {
    private static final String FILE_PATH = "E:\\coding\\java\\sinosoft\\Channel\\INT_channel"; //文件路径
    private static final String TARGET_CODE = "GBK"; //目标文件编码
    private static final String SOURCE_CODE = "UTF-8"; //源文件编码
    private static final String FILE_END_WITH = ".java"; //转换文件格式

    public static void main(String[] args) throws IOException {
        //将UTF-8编码格式改为GBK
        File srcFolder = new File(FILE_PATH);
        getAllJavaFilePaths(srcFolder);
    }

    private static void getAllJavaFilePaths(File srcFolder) throws IOException {
        File[] fileArray = srcFolder.listFiles();
        for (File file : fileArray) {
            if (file.isDirectory()) {
                getAllJavaFilePaths(file);
            } else {
                if (file.getName().endsWith(FILE_END_WITH)) {
                    FileInputStream fis = new FileInputStream(file);
                    InputStreamReader isr = new InputStreamReader(fis, SOURCE_CODE);
                    BufferedReader br = new BufferedReader(isr);
                    String OriStr;
                    StringBuilder stringBuilder = new StringBuilder();
                    String codeType = EncodingDetect.getJavaEncode(file.getPath());
                    if (!TARGET_CODE.equals(codeType) && !"GB2312".equals(codeType)) {
                        while ((OriStr = br.readLine()) != null) {
                            //手动拼接换行符
                            OriStr += "\n";
                            stringBuilder.append(OriStr);
                        }
                        String targetStr = stringBuilder.toString();
                        //false代表不追加直接覆盖,true代表追加文件
                        FileOutputStream fos = new FileOutputStream(file.getAbsolutePath(), false);
                        OutputStreamWriter osw = new OutputStreamWriter(fos, TARGET_CODE);
                        osw.write(targetStr);
                        osw.flush();
                        osw.close();
                        fos.close();
                    }
                    br.close();
                    isr.close();
                    fis.close();
                }
            }
        }
        System.out.println("success");
    }
}
