package cn.codetector.util.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Codetector
 */
public class FileListUtil {
    /**
     *
     * @param dirname Directory Location in String
     * @return Everything in that Directory
     */
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

    /**
     *
     * @param dirname - Directory Location in String
     * @param Suffix - Only list only files with this Extension.(dot is recommended, but not required)
     * @return Everything in that Directory
     */
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
