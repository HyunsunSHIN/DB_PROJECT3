import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by interstellar on 02/12/2016.
 */


public class test {

    public static void main( String args[] ){



        Hashtable<String,String> alias_table = new Hashtable<String,String>();


        HashSet<HashMap<String,String>> tuple_space=new HashSet<HashMap<String,String>> ();


        HashMap<String,String> hs = new HashMap<String,String>();
        hs.put("age","14");
        hs.put("colleage","SNU");


        HashMap<String,String> hs2 = new HashMap<String,String>();
        hs2.put("age","25");
        hs2.put("colleage","HYU");
        tuple_space.add(hs);
        tuple_space.add(hs2);

        System.out.println("before: "+tuple_space+"\n");


  //      HashSet<HashMap<String,String>> st2 = new HashSet<HashMap<String,String>> ();

//
//        for(HashMap<String,String> item : tuple_space){
//            if(!item.get("colleage").equals("HYU")){
//                st2.add(item);
//            }
//        }


        Stream<HashMap<String,String>> stream
                = tuple_space.stream().filter(p -> p.get("colleage").equals("HYU"));

        HashSet<HashMap<String,String>> tuple_space_new =
        stream.collect(Collectors.toCollection(HashSet::new));

        System.out.println("?"+tuple_space_new.toString());
        System.out.println("!"+tuple_space.toString());
//        HashSet<HashMap<String,String>> tuple_space_new_1 =
//                 new HashSet<HashMap<String,String>>();

       // tuple_space_new_1.addAll(Hash)



//
//        System.out.println("after: "+tuple_space_new+"\n");

        String s1 = "1991-11-27";
        String s2 = "2001-11-27";

        System.out.println(s1.compareTo(s2));




      //  System.out.println(st2.toString());



        //System.out.println(st1.toString());

    }
}
