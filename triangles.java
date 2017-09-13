import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class triangles {
	
	static String[] getTriangleType(String[] abc) {
		int temp = 0;
		String[] ans = new String[abc.length];
		while(temp != abc.length){
			String[] n1 = abc[temp].split(" ");
				if(Integer.parseInt(n1[0]) + Integer.parseInt(n1[1]) > Integer.parseInt(n1[2]) || Integer.parseInt(n1[1]) + Integer.parseInt(n1[2]) > Integer.parseInt(n1[0]) || Integer.parseInt(n1[0]) + Integer.parseInt(n1[2]) > Integer.parseInt(n1[1])){
					if(Integer.parseInt(n1[0]) == Integer.parseInt(n1[1]) && Integer.parseInt(n1[0]) == Integer.parseInt(n1[2]) && Integer.parseInt(n1[1]) == Integer.parseInt(n1[2])){
						ans[temp] = "Equilateral";
					}
					else if((Integer.parseInt(n1[0]) == Integer.parseInt(n1[1]) && Integer.parseInt(n1[2]) != Integer.parseInt(n1[0])) || (Integer.parseInt(n1[1]) == Integer.parseInt(n1[2]) && Integer.parseInt(n1[0]) != Integer.parseInt(n1[1])) || (Integer.parseInt(n1[0]) == Integer.parseInt(n1[2]) && Integer.parseInt(n1[1]) != Integer.parseInt(n1[0]))){
						ans[temp] = "Isosceles";
					}
					else{
						ans[temp] = "None of these";
					}
				}
				else{
					ans[temp] = "None of these";
				}
			temp++;
		}
		return ans;
    }

	public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        String[] res;
       
        String[] abc = {"30 30 30", "36 36 30", "3 4 5"};
        
        res = getTriangleType(abc);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }

	
	
}
