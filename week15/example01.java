import java.util.*;
public class example01 {
    public static void main(String[] args){
        List list = new ArrayList();
        list.add("apple");
        list.add("banana");
        list.add("banana");
        list.add("orange");
        System.out.println("在list集合中添加4个元素："+list);
        list.add(2,"peach");
        System.out.println("在指定索引2的位置插入元素"+list);
        list.remove(3);
        System.out.println("在指定索引3的位置删除元素"+list);
        System.out.println("获取索引3的元素"+list.get(3));
        list.set(2,"grapes");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
