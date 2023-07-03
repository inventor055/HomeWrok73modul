// create new file
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    // new block
    public static void main(String[] args) {
        ArrayList<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("Apple", "iPhone 14", 749));
        phoneList.add(new Phone("Apple", "iPhone 6", 359));
        phoneList.add(new Phone("Apple", "iPhone 5", 279));
        phoneList.add(new Phone("Sony", "Xperia 5 III", 5));
        phoneList.add(new Phone("Sony", "CDM-J5", 7));
        phoneList.add(new Phone("Sony", "Xperia XA", 3));
        phoneList.add(new Phone("Samsung", "Galaxy S21Ultra", 199));
        phoneList.add(new Phone("Samsung", "Galaxy M 12", 99));
        phoneList.add(new Phone("Samsung", "Galaxy Z Flip", 149));
        phoneList.add(new Phone("Samsung", "Galaxy Note", 179));
        // new block
        ArrayList<Phone> result = phoneList.stream()
                .filter(о -> о.name == "Apple")
                .collect(() -> new ArrayList<Phone>(),
                        (list, item) -> list.add(item),
                        (list1, list2) -> list1.addAll(list2));
  /*    // new fun block(not for HW)
        ArrayList<Phone> result1 = phoneList.stream()
                .filter(о -> о.name == "Sony")
                .collect(() -> new ArrayList<Phone>(),
                        (list, item) -> list.add(item),
                        (list1, list2) -> list1.addAll(list2));
        // new fun block(not for HW)2
        ArrayList<Phone> result2 = phoneList.stream()
                .filter(о -> о.name == "Samsung")
                .collect(() -> new ArrayList<Phone>(),
                        (list, item) -> list.add(item),
                        (list1, list2) -> list1.addAll(list2));
  */    // new block
        phoneList.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println(result);
    /*  System.out.println(result1);
        System.out.println(result2);
   */ }
}       // final this file