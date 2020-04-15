package webadv.s17201329.p01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
import org.apache.commons.codec.digest.DigestUtils;
public class App {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }
//        System.out.println(sha256hex(args[0]));
        String account=new String();
        String password=new String();
        try {
			BufferedReader bf = new BufferedReader(new FileReader("src/main/resource/static/data.txt"));
			account=bf.readLine().split(":")[1];
			password=bf.readLine().split(":")[1];
		} catch (IOException e) {
			e.printStackTrace();
		}
        if (account.equals(args[0])&&password.equals(args[1])) {
        	System.out.println(account);
        	System.out.println(sha256hex(password));
        }else {
        	System.out.println("输入错误!");
        }
        
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}

