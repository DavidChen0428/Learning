package Concept;

import java.util.LinkedList;

/*
 *  ArrayList和LinkedList的差別 :
 *  ArrayList是只要容量不夠，就自動新增一個新的再套入進去
 *  LinkedList是容器裝完後會自動指定到下一個容器的位置，供新資料存放
 *  #儲存和存取數據使用ArrayList；操作數據用LinkedList
 */

public class ArrayListAndLinkedList {
    public static void main(String[] args) {
        // 一般List的基本功能可以用
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Jane");
        linkedList.add("Louisa");
        linkedList.add("Helen");
        linkedList.add("Ulna");
        linkedList.add("Trasa");
        linkedList.set(4, "Peter");
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.size());
        
        // LinkedList的特有功能
        linkedList.addFirst("Nina");
        System.out.println(linkedList.getFirst());
        linkedList.removeFirst();
        linkedList.addLast("Oven");
        System.out.println(linkedList.getLast());
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
