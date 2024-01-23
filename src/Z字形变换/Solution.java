package Z字形变换;

public class Solution {
    public String convert(String s, int numRows){
        int n=s.length(),r=numRows;
        if(r==1||r>=n){
            return s;
        }
        int t = r * 2 - 2;
        int c = (n + t - 1) / t * (r - 1);
        char[][] matrix=new char[r][c];
        for(int i=0,x=0,y=0;i<n;i++){

                matrix[x][y]=s.charAt(i);
                if(i%t<r-1){
                    x++;
                }
                else{
                    x--;
                    y++;
                }


        }
        StringBuilder stringBuilder= new StringBuilder();
        for(char[] row:matrix){
            for(char col:row){
                if(col!=0){
                    stringBuilder.append(col);
                }

            }
        }

        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String s="Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers."
        ;//Aaidoeswr,haenme,rtesqecouishtabrateaeaietedrcinwtgnrlloacsoajsmnsoucutoadodiiesplnrmiaodprs,ubroohreunefnttacneedhsmwynihrieto,iheeaalwnefrdutettpntainnwrdvdr.
        int numRows= 2;
        System.out.println(sol.convert(s,numRows));
    }
}
