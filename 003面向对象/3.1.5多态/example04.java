import java.util.HashSet;
import java.util.Set;
class People{
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public People(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "People's name:" + name;
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof People) {
            People p = (People) o;
            // 并且name字段相同时，返回true:
            return this.name.equals(p.name);
        }
        return false;
    }
    @Override
    public int hashCode(){
        return this.name.hashCode();
    }
}

public class example04 {
    public static void main(String[] args) {
        System.out.println("--- 1. 创建对象并测试 toString() ---");
        People p1 = new People("Alice");
        People p2 = new People("Bob");
        System.out.println(p1); // 会自动调用 p1.toString()
        System.out.println(p2); // 会自动调用 p2.toString()

        System.out.println("\n--- 2. 重点：测试 equals() 方法 ---");
        People p3 = new People("Alice");
        System.out.println("p1.equals(p2) (Alice vs Bob): " + p1.equals(p2)); // 应该为 false
        System.out.println("p1.equals(p3) (Alice vs Alice): " + p1.equals(p3)); // 应该为 true

        System.out.println("\n--- 3. 重点：测试 hashCode() 方法 ---");
        System.out.println("p1 的 hashCode: " + p1.hashCode());
        System.out.println("p2 的 hashCode: " + p2.hashCode());
        System.out.println("p3 的 hashCode: " + p3.hashCode());
        System.out.println("p1 和 p3 的 hashCode 是否相等: " + (p1.hashCode() == p3.hashCode())); // 应该为 true

        System.out.println("\n--- 4. 测试 getter 和 setter ---");
        System.out.println("p2 修改前的名字: " + p2.getName());
        p2.setName("Charlie");
        System.out.println("p2 修改后的名字: " + p2.getName());
        System.out.println(p2); // toString() 也会反映出变化

        System.out.println("\n--- 5. 进阶：在 HashSet 中测试唯一性 ---");
        Set<People> peopleSet = new HashSet<>();
        peopleSet.add(new People("David"));
        peopleSet.add(new People("Eve"));
        System.out.println("向 Set 中添加 David 和 Eve，当前大小: " + peopleSet.size());

        // 尝试添加一个名字已经存在的 People 对象
        boolean isAdded = peopleSet.add(new People("David"));
        System.out.println("再次尝试添加 David 是否成功: " + isAdded); // 应该为 false
        System.out.println("因为 David 已存在，Set 的最终大小: " + peopleSet.size()); // 大小应该不变
    }
}
