import java.io.*;
public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String s = br.readLine();
            int l = s.length();
            bw.write(s.charAt(0)+""+s.charAt(l-1)+"\n");
        }
        bw.flush();
        bw.close();
    }
}