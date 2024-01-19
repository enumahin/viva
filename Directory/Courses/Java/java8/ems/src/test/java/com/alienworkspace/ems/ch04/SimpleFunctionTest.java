package com.alienworkspace.ems.ch04;

import com.alienworkspace.ems.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class SimpleFunctionTest {

    public static void main(String[] args) {
        List<String> strings = getData();
        System.out.println("Input : " + strings);

        // Example 1 - transform each string to length.
        List<Integer> lengthOfString = new ArrayList<>();
        // Bad because of the auto boxing of the value
        Function<String, Integer> lengthFunction = (s) -> s.length();

        for (String str : strings) {
            lengthOfString.add(lengthFunction.apply(str));
        }
        System.out.println("\nExample One : ");
        System.out.println("Output : " + lengthOfString);

        // Example 2 - ToIntFunction - primitive
        lengthOfString.clear();

        ToIntFunction<String> length = s -> s.length();
        for (String str : strings){
            lengthOfString.add(length.applyAsInt(str));
        }
        System.out.println("\nExample Two using ToIntFunction: ");
        System.out.println(lengthOfString);

        // Example 3 - Name in upper case.
        List<Customer> customers = getCustomerData();

        System.out.println("\nExample 3, Customer to Customer name in uppercase");
        List<String> namesUpperCase = new ArrayList<>();
        Function<Customer, String> nameUpperCase = (customer) -> (customer.getFirstName() + " " + customer.getLastName()).toUpperCase();
        for (Customer customer : customers) {
            namesUpperCase.add(nameUpperCase.apply(customer));
        }
        System.out.println(namesUpperCase);

        // Exercise - find average Age
        ToIntFunction<List<Customer>> customerAverageAge = SimpleFunctionTest::findAverageAge;
        int aveAge =customerAverageAge.applyAsInt(customers);
        System.out.println("\nAverage Age of Customers.");
        System.out.println(aveAge);
    }

    private static int findAverageAge(List<Customer> customers) {
        int totalAge = 0;
        for (Customer customer : customers) {
            totalAge += customer.getAge();
        }
        return totalAge / customers.size();
    }

    public static List<String> getData(){
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("am");
        strings.add("learning");
        strings.add("lambdas");
        return strings;
    }

    private static List<Customer> getCustomerData() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Rahul", "Delta", "rahul@gmail.com", 30));
        customers.add(new Customer("Bob", "Alpha", "bob@gmail.com", 35));
        customers.add(new Customer("Alice", "Gamma", "alice@gmail.com", 35));
        return customers;
    }
}
