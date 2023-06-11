import java.io.*;
import java.util.Random;

public class write {
    public static String randomHexString(int len){
        try{
            StringBuffer result = new StringBuffer();
            for(int i = 0;i<len;i++){
                result.append(Integer.toHexString(new Random().nextInt(16)));
            }
            return result.toString().toUpperCase();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public static void writefile(int N) throws IOException {
       // File writer = new File("./plaintext.txt");
        //PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(writer),"utf-8")));
        //out.write("");
        //out.write(s);

        //out.flush();
        //out.close();
        FileWriter bw = new FileWriter("D:/hardwork/code/java/plain data/plaintext.txt");
        bw.write("");
        bw.flush();
        for(int i=0;i<N;i++){
            bw.write(randomHexString(32));
            bw.write("\r\n");
        }
        bw.close();
    }
}
