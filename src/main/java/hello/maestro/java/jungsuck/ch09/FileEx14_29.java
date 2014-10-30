import java.io.*;
import java.util.ArrayList;


class FileEx14_29{
    static int totalFiles = 0; 
    static int totalDirs = 0; 


    public static void main(String[] args){
        if(args.length != 1) {
            System.out.println("USAGE : Java FileEx 14_29 DIRECTORY");
            System.exit(0);
        }


        File dir = new File(args[0]); 
        if(!dir.exists() || !dir.isDirectory()){
            System.out.println("유효하지 않은 디렉토리입니다.");
            System.exit(0);
        }
        printFileList(dir); 
        System.out.println();
        System.out.println("총 "+totalFiles +"개의 파일"); 
        System.out.println("총 "+totalDirs +"개의 디렉토리"); 
    }


    public static void printFileList(File dir){
        System.out.println(dir.toString()); 


        System.out.println(dir.getAbsolutePath()+" 디렉토리"); 
        File[] files = dir.listFiles();


        ArrayList<String> subDir = new ArrayList<String>();


        for(int i=0;i<files.length;i++){
            String fileName = files[i].getName(); 
            if( files[i].isDirectory() ) {
                fileName = "["+fileName+"]";
                subDir.add(i+" "); 
                System.out.println("   "+fileName);
            }
            else {
                System.out.println(fileName);
            }
        }


        int dirNum = subDir.size(); 
        int fileNum = files.length - dirNum; 


        totalFiles += fileNum; 
        totalDirs += dirNum; 


        System.out.println(fileNum+"개의 파일, "+dirNum+"개의 디렉토리");
        System.out.println(); 


        for(int i=0; i<dirNum; i++){
            int index = Integer.parseInt((String)subDir.get(i)); 
            printFileList(files[index]); 
        }


    }


}


