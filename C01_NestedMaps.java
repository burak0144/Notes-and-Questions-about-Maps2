package day50_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedMaps {
    public static void main(String[] args) {
        //eger bir elementle ilgili tutulacak bilgi coksa nested kullanilabilinir
        //ama ic ice mapte bilgilere ulasmak zorlasir

        //dunku mapimizi maplerden olusan bir map olarak olusturalim

        /*
         sinifList.put(no=101,isim=Ali,soyisim=Can,brans=Tester);
         sinifList.put(102,"Mehmet, Canan, Dev.");
         sinifList.put(103,"Veli, Tan, C++");
         */

        //once icteki bilgilerin oldugu map olusturduk keys=isim,soyisim,brans values=...
        Map<String,String> ogr101=new HashMap<>();
        ogr101.put("isim","Ali");
        ogr101.put("soyisim","Can");
        ogr101.put("brans","Tester");

        Map<String,String> ogr102=new HashMap<>();
        ogr102.put("isim","Mehmet");
        ogr102.put("soyisim","Canan");
        ogr102.put("brans","Dev.");


        Map<String,String> ogr103=new HashMap<>();
        ogr103.put("isim","Veli");
        ogr103.put("soyisim","Tan");
        ogr103.put("brans","C++");

        //distaki mapi olusturalim key=no values=ogr101,ogr102,ogr103
        Map<Integer,Map<String,String>> nestedOgr=new HashMap<>();
        nestedOgr.put(101,ogr101);
        nestedOgr.put(102,ogr102);
        nestedOgr.put(103,ogr103);
        System.out.println(nestedOgr);

        //alt alta yazdiralim once Entry methoduyla cevirelim
        Set<Map.Entry<Integer,Map<String,String>>> entryogr=nestedOgr.entrySet();
        for (Map.Entry<Integer,Map<String,String>> each:entryogr
             ) {
            System.out.println(each);
        }

        //102 de ki ismi yazdiralim
        System.out.println(nestedOgr.get(102).get("isim"));
    }
}
