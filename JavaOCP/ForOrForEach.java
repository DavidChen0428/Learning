import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForOrForEach{
    public static void main(String[] args) {
        // Example 1 集合為 List
        List<String> fruitsList=new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Cherry");

        // 使用 foreach 迴圈遍歷 List
        // 特色 : 簡單且直觀
        System.out.println("使用 foreach 迴圈遍歷 List");
        for(String fruit:fruitsList){
            System.out.println(fruit);
        }

        System.out.println("==========");
        // 使用 iterator 遍歷 List
        // 特色 : 更靈活，適合需要在迭代過程中修改集合的情況
        System.out.println("使用 iterator 遍歷 List");
        Iterator<String> iterator1=fruitsList.iterator();
        while(iterator1.hasNext()){
            String fruit=iterator1.next();
            System.out.println(fruit);
        }

        System.out.println("----------");

        // Example 2 集合為 Set
        Set<String> fruitsSet=new HashSet<>();
        fruitsSet.add("Apple");
        fruitsSet.add("Banana");
        fruitsSet.add("Cherry");

        // 使用 foreach 迴圈遍歷 List
        System.out.println("使用 foreach 迴圈遍歷 List");
        for(String fruit: fruitsSet){
            System.out.println(fruit);
        }

        System.out.println("==========");
        // 使用 iterator 遍歷 List
        System.out.println("使用 iterator 遍歷 List");
        Iterator<String> iterator2=fruitsSet.iterator();
        while(iterator2.hasNext()){
            String fruit=iterator2.next();
            System.out.println(fruit);
        }

        System.out.println("----------");

        // Example 3 集合為 Map
        Map<String,String> fruitColors=new HashMap<>();
        fruitColors.put("Apple", "Red");
        fruitColors.put("Banana", "Yellow");
        fruitColors.put("Cherry", "Red");

        // 使用 foreach 迴圈遍歷 keySet
        System.out.println("使用 foreach 迴圈遍歷 keySet");
        for(String fruit: fruitColors.keySet()){
            System.out.println(fruit);
        }

        System.out.println("==========");
        // 使用 foreach 迴圈遍歷 values
        System.out.println("使用 foreach 迴圈遍歷 values");
        for(String fruit: fruitColors.values()){
            System.out.println(fruit);
        }

        System.out.println("==========");
        // 使用 foreach 迴圈遍歷 entrySet
        System.out.println("使用 foreach 迴圈遍歷 entrySet");
        for(Map.Entry<String,String> entry:fruitColors.entrySet()){
            System.out.println("Fruit: "+entry.getKey()+", Color: "+entry.getValue());
        }

        System.out.println("==========");
        // 使用 iterator 遍歷 keySet
        System.out.println("使用 iterator 遍歷 keySet");
        Iterator<String> iterator3=fruitColors.keySet().iterator();
        while(iterator3.hasNext()){
            String key=iterator3.next();
            System.out.println("Key: "+key+", Value: "+fruitColors.get(key));
        }

        System.out.println("==========");
        // 使用 iterator 遍歷 values
        System.out.println("使用 iterator 遍歷 values");
        Iterator<String> iterator4=fruitColors.values().iterator();
        while(iterator4.hasNext()){
            String value=iterator4.next();
            System.out.println("Value: "+value);
        }

        System.out.println("==========");
        // 使用 iterator 遍歷 entrySet
        System.out.println("使用 iterator 遍歷 entrySet");
        Iterator<Map.Entry<String,String>> iterator5=fruitColors.entrySet().iterator();
        while(iterator5.hasNext()){
            Map.Entry<String,String> entry=iterator5.next();
            System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
        }
    }
}