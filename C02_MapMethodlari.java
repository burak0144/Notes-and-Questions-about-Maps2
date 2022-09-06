package day50_maps_TheEnd;

import day48_maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap=ReusableMethods.mapOlustur();

        ReusableMethods.entryYazdir(sinifListMap);

        sinifListMap.clear();
        System.out.println("clear methodundan sonra :"+sinifListMap);

        sinifListMap=ReusableMethods.mapOlustur();
        //getordefault yazdigimiz key degeri varsa onu yazdirir yoksa atadigimizi yazdirir
        System.out.println(sinifListMap.getOrDefault(104, "Aradiginiz deger yoktur"));
        System.out.println(sinifListMap.getOrDefault(107, "Aradiginiz deger yoktur"));

        sinifListMap.putIfAbsent(100,"Berk, Karanfil, QA");//100 yoksa ekledi
        System.out.println(sinifListMap);
        sinifListMap.putIfAbsent(101,"Berk, Karanfil, QA");//101 varsa eklemedi
        System.out.println(sinifListMap);


    }
}
