package pet;

public class Master {
    // 使用父类Pet作为参数类型 - 多态的关键
    public void feedPet(Pet pet) {
        System.out.println("主人开始喂养" + pet.getName());

        // 根据实际传入的Pet子类对象，调用对应的eat()方法
        pet.eat();

        System.out.println("喂养完成！");
        pet.showStatus();
    }

    // 可以喂养多个宠物 - 同样使用多态
    public void feedPets(Pet[] pets) {
        System.out.println("\n主人批量喂养宠物：");
        for (Pet pet : pets) {
            feedPet(pet); // 复用上面的方法
        }
    }
}