package edu.cnm.deepdive;

public class StringPoolAndStringEquality {

  public static void main(String[] args) {
    String name = "John";
    String anotherName = "John";
    String john = "Jo" + "hn";
    String newName = new String("John");

    System.out.println("name == anotherName -> " + (name == anotherName));//true
    System.out.println("name == john -> " + (name == john));//true
    System.out.println("name == newName -> " + (name == newName));//false
    System.out.println("anotherName == john -> " + (anotherName == john));//true
    System.out.println("anotherName == newName -> " + (anotherName == newName));//false
    System.out.println("john == newName -> " + (john == newName));//false

    System.out.println("\nname equals anotherName -> " + name.equals(anotherName));//all give true
    System.out.println("name equals john -> " + name.equals(john));
    System.out.println("name equals newName -> " + name.equals(newName));
    System.out.println("anotherName equals john -> " + anotherName.equals(john));
    System.out.println("anotherName equals newName -> " + anotherName.equals(newName));
    System.out.println("john equals newName -> " + john.equals(newName));

    System.out.println("\nname - identityHashCode -> " + System.identityHashCode(name));
    System.out.println("anotherName - identityHashCode -> " + System.identityHashCode(anotherName));
    System.out.println("john - identityHashCode -> " + System.identityHashCode(john));//first three
    //are the same, newName is a new String with a different identityHashCode.
    System.out.println("newName - identityHashCode -> " + System.identityHashCode(newName));

    //Keep in mind that when we concatenate two String literals ("jo" + "hn") this will happen at
    //compile time and the outcome will be treated as a literal.

    String str1 = "abc";
    String str2 = "ab";
    String str3 = str2 + "c";

    System.out.println();
    System.out.println(str1 == str2);//false
    System.out.println(str1 == str3);//false because str2 in the concatenation of str3 is not a constant
    //expression. If String str3 would have been = "ab" + "c", then we would have had 'true' as outcome.
  }

}
