package readfile;

import astract.Phone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static void writeFile(List<Phone>phones){
        File file=new File("MiniTest.txt");
        try {
            OutputStream os=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(os);
            oos.writeObject(phones);
            oos.close();
            os.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static List<Phone>readFile(){
        File file=new File("MiniTest.txt");
        List<Phone>phones=new ArrayList<>();
        try {
            InputStream is=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(is);
            phones=(List<Phone>) ois.readObject();

        }catch (Exception e){
            e.printStackTrace();
        }
        return phones;
    }

}
