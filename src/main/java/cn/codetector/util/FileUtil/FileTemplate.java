package cn.codetector.util.FileUtil;

import cn.codetector.util.Validator.Validator;

import java.io.File;

/**
 * Created by codetector on 16/8/10.
 */
public class FileTemplate {

    private String content;

    public FileTemplate clone(){
        return new FileTemplate(content);
    }

    public FileTemplate(File file){
        Validator.notNull(file);
        content = FileReader.readFile(file);
    }

    public FileTemplate(String content){
        this.content = content;
    }

    public void setParam(String param,String content){
        content = content.replaceAll("{{"+param+"}}",content);
    }

    @Override
    public String toString() {
        return content;
    }
}
