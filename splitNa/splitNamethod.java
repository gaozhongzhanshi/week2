package splitNa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class splitNamethod {
        public static int n,count=0,sum=0;
        public static ArrayList<Integer> list = new ArrayList<Integer>();
        public static Set<String> set = new HashSet<String>();
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            n = sc.nextInt();
            f(0);
            Iterator it = set.iterator();
            while(it.hasNext()){

                System.out.println(it.next());
            }
            System.out.println(count);
        }
        public static void f(int a){
            if(a==n){
                if(list.size()==1) return;
                count++;
                String s = "";
                for (int i = 0; i < list.size(); i++) {
                    s=s+list.get(i);
                }

                set.add(s);
                return;
            }

            for (int i = 1; i <=n; i++) {
                if(a+i>n) continue;
                if( list.size()==0 || list.get(list.size()-1)<=i ){
                    list.add(i);
                    a+=i;
                    f(a);
                    list.remove(list.size()-1);
                    a-=i;
                }
            }
        }
}
