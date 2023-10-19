package p1;

import java.util.*;

public class Main {

    public static final int SIZE = 500000;

    public static void main(String[] args) {

        MyClass myClass = new MyClass((int) (Math.random()*SIZE), new String());

        List<MyClass> arrayList = new ArrayList<>();
        System.out.println("ArrayList: Время добавления: " + addElement(arrayList));
        System.out.println("ArrayList: Время удаления: " + removeElement(arrayList));
        System.out.println("ArrayList: Время поиска: " + findElement(arrayList, myClass));

        System.out.println("----------------------");

        List<MyClass> linkList = new LinkedList<>();
        System.out.println("LinkedList: Время добавления: " + addElement(linkList));
        System.out.println("LinkedList: Время удаления: " + removeElement(linkList));
        System.out.println("LinkedList: Время поиска: " + findElement(linkList, myClass));

        System.out.println("----------------------");

        TreeSet<MyClass> treeSet = new TreeSet<>();
        System.out.println("TreeSet: Время добавления: " + addElement(treeSet));
        System.out.println("TreeSet: Время удаления: " + removeElement(treeSet));
        System.out.println("TreeSet: Время поиска: " + findElement(treeSet, myClass));

        System.out.println("----------------------");

        HashSet<MyClass> hashSet = new HashSet<>();
        System.out.println("HashSet: Время добавления: " + addElement(hashSet));
        System.out.println("HashSet: Время удаления: " + removeElement(hashSet));
        System.out.println("HashSet: Время поиска: " + findElement(hashSet, myClass));

        System.out.println("----------------------");

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (scanner.hasNextLine()){
            System.out.printf("Вы ввели какую-то дичь!");

        }else{
            String str = scanner.nextLine();
            System.out.println(str);
        }
    }

    public static long addElement(Collection collection) {
        long result = 0;
        long startTime = System.currentTimeMillis();
        generateCollection(collection);
        result = System.currentTimeMillis() - startTime;
        return result;
    }

    public static long removeElement(Collection collection) {
        long startTime = System.currentTimeMillis();
        while (collection.iterator().hasNext()){
            collection.remove(collection.iterator().hasNext());
        }
        return System.currentTimeMillis() - startTime;
    }

    public static Collection generateCollection (Collection collection){
        for (int i = 0; i < SIZE; i++) {
            collection.add(new MyClass(i, new String()));
        }
        return collection;
    }

    public static long findElement (Collection collection, MyClass myClass){
        long startTime = System.currentTimeMillis();
        Iterator<MyClass> iterator = collection.iterator();
        int i = 0;
        while (iterator.hasNext()){
            if (iterator.next().equals(myClass)){
                System.out.println("Find " + myClass.getId());
                break;
            }
        }
        return System.currentTimeMillis() - startTime;
    }
}