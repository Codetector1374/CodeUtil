package cn.codetector.util.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileListUtil {
	public static String[] ListDir (String dirname){
		if(!dirname.endsWith(File.separator)){
			dirname = dirname + File.separator;
		}
		
		File dirFile = new File(dirname);
		if(!dirFile.exists() || !dirFile.isDirectory()){
			if(!dirFile.exists()){
				dirFile.mkdir();
			}else{
				return null;
			}	
		}
		
		String[] files = dirFile.list();
		return files;
	}
	
	public static String[] ListDir(String dirname, String Suffix){
		String a[] = ListDir(dirname);
		List<String>  returnVal= new ArrayList<String>();
		
		for (String str : a){
			if(str.endsWith(Suffix)){
				returnVal.add(str);
			}
		}
		String returnv[] = new String[returnVal.size()];
		return returnVal.toArray(returnv);
	}
}
