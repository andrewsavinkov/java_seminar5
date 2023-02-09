package org.example;

// import java.security.KeyStore.Entry;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.HashMap;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Map;
// import java.util.Scanner;

//                                          1
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
// человек может иметь несколько телефонов.

// public class seminar5 {

//     public static HashMap<String, LinkedList> contacts = new HashMap<>();
//     public static int choice = 1;
//     public static void main(String[] args) {
//         int lisLength=3;
//         for (int i = 0; i < lisLength; i++) {
//             addContact();
//         }
//         System.out.println(contacts);
//     }

//     static void addContact() {

//         LinkedList<Long> numbers = new LinkedList<>();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Введите имя контакта: ");
//         String name = sc.nextLine();
//         while (contacts.containsKey(name)) {
//             System.out.println("Данное имя уже используется, введите другое имя: ");
//             name=sc.nextLine();
//         }
//         System.out.println("Введите номер телефона: ");
//         Long number = sc.nextLong();
//         numbers.add(number);
//         System.out.println("Добавить номер телефона?(1-да, 2-нет)");
//         choice = sc.nextInt();
//         while (choice != 2) {
//             System.out.println("Введите номер телефона: ");
//             number = sc.nextLong();
//             numbers.add(number);
//             System.out.println("Добавить номер телефона?(1-да, 2-нет)");
//             choice = sc.nextInt();
//         }
//         contacts.put(name, numbers);
//     }
// }

//                                  2
// 2 .
// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

// public class seminar5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner("Иван Иванов\n" +
//                 "Светлана Петрова\n" +
//                 "Кристина Белова\n" +
//                 "Анна Мусина\n" +
//                 "Анна Крутова\n" +
//                 "Иван Юрин\n" +
//                 "Петр Лыков\n" +
//                 "Павел Чернов\n" +
//                 "Петр Чернышов\n" +
//                 "Мария Федорова\n" +
//                 "Марина Светлова\n" +
//                 "Мария Савина\n" +
//                 "Мария Рыкова\n" +
//                 "Марина Лугова\n" +
//                 "Анна Владимирова\n" +
//                 "Иван Мечников\n" +
//                 "Петр Петин\n" +
//                 "Иван Ежов");
//         ArrayList<String> al = new ArrayList<>();
//         for (int i = 0; i < 18; i++) {
//             String s = sc.nextLine();
//             al.add(i, s);
//         }
//         List<String> names = new ArrayList<>();
//         for (int i = 0; i < al.size(); i++) {
//             names.add(parseName(al.get(i)));
//         }
//         System.out.println(al);
//         HashMap<String, Integer> namesFound = frequencyOfNames(names);
//         List<Map.Entry<String, Integer>> list = new LinkedList<>(namesFound.entrySet());
//         list.sort(Map.Entry.comparingByValue());
//         Collections.reverse(list);
//         System.out.println(list);
//     }

//     static String parseName(String inputLine) {
//         String[] name = inputLine.split(" ");
//         return name[0];
//     }

//     static HashMap<String, Integer> frequencyOfNames(List<String> inputList) {
//         HashMap<String, Integer> res = new HashMap<>();
//         for (String element : inputList) {
//             if (res.containsKey(element) == false) {
//                 res.put(element, Collections.frequency(inputList, element));
//             }
//         }
//         return res;
//     }
// }

//                  3
// Реализовать алгоритм пирамидальной сортировки (HeapSort)

// public class seminar5 {

// private static int LEFT(int i) {
//     return (2 * i + 1);
// }

// private static int RIGHT(int i) {
//     return (2 * i + 2);
// }

// private static void swap(int[] sortArr, int i, int j) {
//     int swap = sortArr[i];
//     sortArr[i] = sortArr[j];
//     sortArr[j] = swap;
// }

// private static void createHeap(int[] sortArr, int i, int size) {
//     int left = LEFT(i);
//     int right = RIGHT(i);
//     int largest = i;

//     if (left < size && sortArr[left] > sortArr[i]) largest = left;
//     if (right < size && sortArr[right] > sortArr[largest]) largest = right;

//     if (largest != i) {
//         swap(sortArr, i, largest);
//         createHeap(sortArr, largest, size);
//     }
// }


// public static int pop(int[] sortArr, int size) {

//     if (size <= 0) {
//         return -1;
//     }
//     int top = sortArr[0];


//     sortArr[0] = sortArr[size-1];

//     createHeap(sortArr, 0, size - 1);
//     return top;
// }

// public static void heapSort(int[] sortArr) {

//     int n = sortArr.length;
//     int i = (n - 2) / 2;
//     while (i >= 0) {
//         createHeap(sortArr, i--, n);
//     }
//     while (n > 0) {
//         sortArr[n - 1] = pop(sortArr, n);
//         n--;
//     }
// }

// public static void main(String args[]) {
//     int[] sortArr = {12, 6, 456, 45, 12, 23, 7, 4, 1, 15, 10};
//     heapSort(sortArr);
//     for(int i = 0; i < sortArr.length; i++){
//         System.out.print(sortArr[i] + "\n");
//     }
// }

// }
