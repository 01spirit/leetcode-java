package 删除注释;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<String> removeComments(String[] source) {
        List<String> res=new ArrayList<>();
        StringBuilder newLine=new StringBuilder();
        boolean inBlock=false;
        for(String line:source){
            for(int i=0;i<line.length();i++){
                if(inBlock){
                    if(i+1<line.length()&&line.charAt(i)=='*'&&line.charAt(i+1)=='/'){
                        inBlock=false;
                        i++;
                    }
                }

                else{
                    if(i+1<line.length()&&line.charAt(i)=='/'&&line.charAt(i+1)=='*'){
                        inBlock=true;
                        i++;
                    }
                    else if(i+1<line.length()&&line.charAt(i)=='/'&&line.charAt(i+1)=='/'){
                        break;
                    }
                    else{
                        newLine.append(line.charAt(i));
                    }
                }
            }
            if(!inBlock&&newLine.length()>0){
                res.add(newLine.toString());
                newLine.setLength(0);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String[] source={"/*Test program */",
                "int main()", "{ ",
                "  // variable declaration ",
                "int a, b, c;",
                "/* This is a test",
                "   multiline  ",
                "   comment for ",
                "   testing */", "a = b + c;", "}"
        };
        System.out.println(Arrays.toString(sol.removeComments(source).toArray()));
    }
}
