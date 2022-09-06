package day50_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;

public class C03_Compute {
    public static void main(String[] args) {
        Map<String,Integer> harfMapi=new HashMap<>();
        harfMapi.put("A",5);
        harfMapi.put("B",1);
        harfMapi.put("C",2);
        harfMapi.put("D",4);
        harfMapi.put("E",4);
        System.out.println(harfMapi);

        harfMapi.compute("A",(k,v)->(v*2+3));//value'yu 2 ile carp 3 ekle
        System.out.println(harfMapi);
        harfMapi.compute("B",(a,b)->b*b);
        harfMapi.computeIfAbsent("C",v->30);//C yoksa degerini 30 yap oldugu icin degistirmez
        harfMapi.computeIfAbsent("F",v->30);//F yoksa degerini 30 yap olmadigi icin degistirir
        harfMapi.computeIfPresent("E",(k,v)->v+5);//E varsa degerini 5 arttir oldugu icin degistirir
        harfMapi.computeIfPresent("G",(k,v)->v+5);//G varsa degerini 5 arttir olmadigi icin degistirmez

        System.out.println(harfMapi);

    }
}
