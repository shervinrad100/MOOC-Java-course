# Part 1 - Printing, reading input, variables, calculating with numbers, conditional statements

# Part 2 - loops

1. Write a program that reads an integer from the user and prints the square of the given integer, i.e. the integer multiplied by itself.

2. Write a program that reads two integers from the user and prints the square root of the sum of these integers. The program does not need to work with negative values.

3. Write a program that reads an integer from the user. If the number is less than 0, the program prints the given integer multiplied by -1. In all other cases, the program prints the number itself

4. Write a program that reads two integers from the user. If the first number is greater than the second, the program prints "(first) is greater than (second)." If the first number is less than the second, the program prints "(first) is smaller than (second)." Otherwise, the program prints "(first) is equal to (second)." The (first) and (second) should always be replaced with the actual numbers that were provided by the user.

5. Write a program by using the loop example that asks "Shall we carry on?" until the user inputs the string "no".

6. Write a program, according to the preceding example, that asks the user to input values until they input the value 4.

7. Write a program that asks the user for numbers. If the number is negative (smaller than zero), the program prints for user "Unsuitable number" and asks the user for a new number. If the number is zero, the program exits the loop. If the number is positive, the program prints the number to the power of two.

8. Write a program that reads values from the user until they input a 0. After this, the program prints the total number of inputted values. The zero that's used to exit the loop should not be included in the total number count.

9. Write a program that reads values from the user until they input a 0. After this, the program prints the total number of inputted values that are negative. The zero that's used to exit the loop should not be included in the total number count.

10. Write a program that reads numbers from the user until the user inputs a number 0. After this the program outputs the sum of the numbers. The number zero does not need to be added to the sum, even if it does not change the results.

11. Write a program that asks the user for input until the user inputs 0. After this the program prints the amount of numbers inputted and the sum of the numbers. The number zero does not need to be added to the sum, but adding it does not change the results.

12. Write a program that asks the user for input until the user inputs 0. After this, the program prints the average of the numbers. The number zero does not need to be counted to the average. You may assume that the user inputs at least one number.

13. Write a program that asks the user for input until the user inputs 0. After this, the program prints the average of the positive numbers (numbers that are greater than zero). If no positive number is inputted, the program prints "Cannot calculate the average"

14. Write a program that reads an integer from the user. Next, the program prints numbers from 0 to the number given by the user. You can assume that the user always gives a positive number

15. Write a program, which reads an integer from the user. Then the program prints numbers from that number to 100. You can assume that the user always gives a number less than 100.

16. Write a program which prints the integers from 1 to a number given by the user. Ask the user for the starting point as well.

17. Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.

18. Implement a program which calculates the sum of a closed interval, and prints it. Expect the user to write the smaller number first and then the larger number. You can base your solution to this exercise to the solution of last exercise — add the functionality for the user to enter the starting point as well.

19. Implement a program which calculates the factorial of a number given by the user.

20. Implement a program that asks the user for numbers (the program first prints "Write numbers: ") until the user gives the number -1. When the user writes -1, the program prints "Thx! Bye!" and ends. Extend the program so that it prints the sum of the numbers (not including the -1) the user has written. Extend the program so that it also prints the number of numbers (not including the -1) the user has written. Extend the program so that it prints the mean of the numbers (not including the -1) the user has written. Extend the program so that it prints the number of even and odd numbers (excluding the -1). 

21. Create a method called printText which prints the phrase "In a hole in the ground there lived a method" and a newline.

22. Expand the previous program so that the main program asks the user for the number of times the phrase will be printed (i.e. how many times the method will be called).

23. Create the following method in the exercise template: public static void printUntilNumber(int number). It should print the numbers from one to the number passed as a parameter.

24. Create the following method in the exercise template: public static void printFromNumberToOne(int number). It should print the numbers from the number passed as a parameter down to one.

25. Write a method public static void division(int numerator, int denominator) that prints the result of the division of the numerator by the denominator. Keep in mind that the result of the division of the integers is an integer — in this case we want the result to be a floating point number.

26. Write a method public static void divisibleByThreeInRange(int beginning, int end) that prints all the numbers divisible by three in the given range. The numbers are to be printed in order from the smallest to the greatest.

27. Write a method public static int numberUno() that returns the value 1.

28. Write a method public static String word(). The method must return a string of your choice.

29. Expand the method sum in the exercise template so that it calculates and returns the sum of the numbers that are given as the parameters.

30. Define a two-parameter method smallest that returns the smaller of the two numbers passed to it as parameters.

31. Define a method called greatest that takes three numbers and returns the greatest of them. If there are multiple greatest values, returning one of them is enough. Printing will take place in the main program.

32. Create a method called average that calculates the average of the numbers passed as parameters. The previously created method sum must be used inside this method!

33. Define a method called printStars that prints the given number of stars and a line break. Define a method called printSquare(int size) that prints a suitable square with the help of the printStars method. Write a method called printRectangle(int width, int height) that prints the correct rectangle by using the printStars method. Create a method called printTriangle(int size) that prints a triangle by using the printStars method. 

34. Define a method called printSpaces(int number) that produces the number of spaces specified by number. The method does not print the line break. You will also have to either copy the printStars method your previous answer or reimplement it in this exercise template. Create a method called printTriangle(int size) that uses printSpaces and printStars to print the correct triangle. Define a method called christmasTree(int height) that prints the correct Christmas tree. The Christmas tree consists of a triangle with the specified height as well as the base. The base is two stars high and three stars wide, and is placed at the center of the triangle's bottom. The tree is to be constructed by using the methods printSpaces and printStars. 

# Part 3 - lists, arrays, strigns

1. modify the program so that instead of the first value, the third value on the list is printed. Remember that programmers start counting from zero! The program is allowed to malfunction if there are fewer than three entries on the list, so you don't need to prepare for such an event at all.

2. Modify the program so that instead of the first value, the program prints the sum of the second and third numbers. The program is allowed to malfunction if there are fewer than three entries on the list, so you don't need to prepare for such an event at all.

3. There is a program that uses a list in the exercise template. Modify it so that its execution always produces the error IndexOutOfBounds. The user should not have to give any inputs to the program (e.g. write something on the keyboard) You can also see a means for going through the values of a list — we will return to this topic a bit later.

4. In the exercise template is a program that reads input from the user. Modify its working so that when the program quits reading, the program prints the number of values on the list.

5. Your task is to modify the method to print the last read value after it stops reading. Print the value that was read last from the list. Use the method that tells the size of a list to help you.

6. Modify the program to print both the first and the last values after the reading ends. You may suppose that at least two values are read into the list.

7. Expand the functionality of the program so that after reading the numbers, it prints all the numbers received from the user. The number used to indicate stopping should not be printed.

8. Expand the program to ask for a start and end indices once it has finished asking for numbers. After this the program shall prints all the numbers in the list that fall in the specified range (between the indices given by the user, inclusive). You may assume that the user gives indices that match some numbers in the list.

9. Continue developing the program so that it finds the greatest number in the list and prints its value after reading all the numbers. The programming should work in the following manner.

10. Expand the program by adding a functionality that asks the user for a number, and reports that number's index in the list. If the number is not found, the program should not print anything.

11. Write a program that reads numbers from the user. When number 9999 is entered, the reading process stops. After this the program will print the smallest number in the list, and also the indices where that number is found. Notice: the smallest number can appear multiple times in the list.

12. Modify the program so that after reading the numbers it calculates and prints the sum of the numbers in the list.

13. The exercise template contains a base that reads numbers from the user and adds them to a list. Reading is stopped once the user enters the number -1. When reading ends, calculate the average of the numbers in it, and then print that value.

14. In the exercise template there is a program that reads inputs from the user until an empty string is entered. Add the following functionality to it: after reading the inputs one more string is requested from the user. The program then tell whether that string was found in the list or not.

15. Create the method public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) in the exercise template. The method prints the numbers in the given list whose values are in the range [lowerLimit, upperLimit]. A few examples of using the method are supplied below.

16. Create the method public static int sum(ArrayList<Integer> numbers) in the exercise template. The method is to return the sum of the numbers in the parameter list.

17. Create the method public static void removeLast(ArrayList<String> strings) in the exercise template. The method should remove the last value in the list it receives as a parameter. If the list is empty, the method does nothing.

18. The exercise template already contains a program, that creates an array and prints the values of the array twice. Modify the program to do following: After the first printing, the program should ask for two indices from the user. The values in these two indices should be swapped, and in the end the values of the array should be printed once again.

19. The exercise template already has an array containing numbers. Complete the program so that it asks the user for a number to search in the array. If the array contains the given number, the program tells the index containing the number. If the array doesn't contain the given number, the program will advise that the number wasn't found.

20. The class SumOfArray has a method public static int sumOfNumbersInArray(int[] array). Complete the method so that it computes and returns the sum of the numbers in the array it receives as parameter.

21. Complete the method public static void printNeatly(int[] array) in the class named 'ArrayPrinter' to make it print the numbers of the array it receives more neatly. There should be a whitespace and a comma between each number. don't put a comma after the last number. Print the numbers on one line using System.out.print.

22. Complete the method public static void printArrayInStars(int[] array) in the class named 'Printer' to make it print a row of stars for each number in the array. The amount of stars on each row is defined by the corresponding number in the array.

23. Write a program, that reads a string from the user and then prints it three times.

24. Write a program that asks the user for a string. If the user writes the string "true", the program prints "You got it right!", otherwise it prints "Try again!".

25. Write a program that recognizes the following users: (u:alex p:sunshine) (u:emma p:haskell). The program either shows a personal message or informs of an incorrect username or password.

26. Write a program that reads strings from the user. If the input is empty, the program stops reading input and halts. For each non-empty input it splits the string input by whitespaces and prints each part of the string on a new line.

27. Write a program that reads user input until an empty line. For each non-empty string, the program splits the string by spaces and then prints the pieces that contain av, each on a new line.

28. Write a program that reads user input until an empty line is entered. For each non-empty line the program splits the string by spaces and prints the first part of the string.

29. Write a program that reads user input until an empty line is entered. For each non-empty line the program splits the string by spaces and prints the last part of the string.

30. Write a program that reads names and ages from the user until an empty line is entered. The name and age are separated by a comma. After reading all user input, the program prints the age of the oldest person. You can assume that the user enters at least one person, and that one of the users is older than the others.

31. Write a program that reads names and ages from the user until an empty line is entered. The name and age are separed by a comma. After reading all user input, the program prints the name of the oldest person. You can assume that the user enters at least one person, and the that one of the users is older than the others.

32. Write a program that reads names and birth years from the user until an empty line is entered. The name and birth year are separated by a comma. After that the program prints the longest name and the average of the birth years. If multiple names are equally longest, you can print any of them. You can assume that the user enters at least one person.
  
# Part 4 - objects in lists, files and reading data

1. The exercise template comes with a ready-made class named Account. The Account object represents a bank account that has balance (i.e. one that has some amount of money in it). 

2. The Account from the previous exercise class is also available in this exercise. Write a program that: Creates an account named "Matthews account" with the balance 1000, Creates an account named "My account" with the balance 0, Withdraws 100.0 from Matthew's account, Deposits 100.0 to "my account", Prints both the accounts

3. A new class can be added in NetBeans the following way: On the left side of the screen is the Projects list. Right-click on the project's name, which for this exercise is Part04_03.DogAttributes. From the drop-down menu, select New and Java Class. NetBeans will then ask for the class name. Name the class Dog in this exercise, and press the finish button. 

4. Create a class named Room. Add the variables private String code and private int seats to the class. Then create a constructor public Room(String classCode, int numberOfSeats) through which values are assigned to the instance variables.

5. Create a class named Whistle. Add the variable private String sound to the class. After that, create the constructor public Whistle(String whistleSound), which is used to create a new whistle that's given a sound. 

6. Create a class named Door. The door does not have any variables. Create for it a constructor with no parameters (or use the default constructor). After that, create a public void knock() method for the door that prints the message "Who's there?" when called.

7. Create a class Product that represents a store product. The product should have a price (double), a quantity (int) and a name (String).

8. Implement the decrement() method in the class body in such a way that it decrements the value variable of the object it's being called on by one. Once you're done with the decrement() method, the main program of the previous example should work to produce the example output. Implement the decrement() in such a way that the counter's value never becomes negative. This means that if the value of the counter is 0, it cannot be decremented. A conditional statement is useful here. Create the method public void reset() for the counter that resets the value of the counter to 0. 

9. Create the class Debt that has double-typed instance variables of balance and interestRate. The balance and the interest rate are passed to the constructor as parameters public Debt(double initialBalance, double initialInterestRate). In addition, create the methods public void printBalance() and public void waitOneYear() for the class. The method printBalance prints the current balance, and the waitOneYear method grows the debt amount. The debt is increased by multiplying the balance by the interest rate.

10. Create a class called Song. The song has the instance variables name (string) and length in seconds (integer). Both are set in the public Song(String name, int length) constructor. Also, add to the object the methods public String name(), which returns the name of the song, and public int length(), which returns the length of the song.

11. Create a film class with the instance variables name (String) and ageRating (int). Write the constructor public Film(String filmName, int filmAgeRating) for the class, and also the methods public String name() and public int ageRating(). The first of these returns the film title and the second returns its rating.

12. Create the class Gauge. The gauge has the instance variable private int value, a constructor without parameters (sets the initial value of the meter variable to 0), and also the following four methods: Method public void increase() grows the value instance variable's value by one. It does not grow the value beyond five. Method public void decrease() decreases the value instance variable's value by one. It does not decrease the value to negative numbers. Method public int value() returns the value variable's value. Method public boolean full() returns true if the instance variable value has the value five. Otherwise, it returns false.

13. Remove the class' print method, and create a public String toString() method for it, which returns the string representation `My name is Bond, James Bond`.

14. Create a class Multiplier that has a: Constructor public Multiplier(int number). Method public int multiply(int number) which returns the value number passed to it multiplied by the number provided to the constructor. You also need to create an instance variable in this exercise.

15. Create a class Statistics that has the following functionality (the file for the class is provided in the exercise template): - a method addNumber adds a new number to the statistics - a method getCount tells the number of added numbers. The class does not need to store the added numbers anywhere, it is enough for it to remember their count. At this stage, the addNumber method can even neglect the numbers being added to the statistics, since the only thing being stored is the count of numbers added. Expand the class with the following functionality: - the sum method tells the sum of the numbers added (the sum of an empty number statistics object is 0) - the average method tells the average of the numbers added (the average of an empty number statistics object is 0. Write a program that asks the user for numbers until the user enters -1. The program will then provide the sum of the numbers. The program should use a Statistics object to calculate the sum. Change the previous program so that it also calculates the sum of even and odd numbers. 

16. Add a new class to the project called PaymentCard. Here's how to add a new class: On the left side of the screen is the list of projects. Right-click on the project name. Select New and Java Class from the drop-down menu. Name the class as "PaymentCard". First, create the PaymentCard object's constructor, which is passed the opening balance of the card, and which then stores that balance in the object's internal variable. Then, write the toString method, which will return the card's balance in the form "The card has a balance of X euros". Complement the PaymentCard class with the following methods: The method eatAffordably should reduce the card's balance by € 2.60, and the method eatHeartily should reduce the card's balance by € 4.60. What happens if the card runs out of money? It doesn't make sense in this case for the balance to turn negative. Change the methods eatAffordably and eatHeartily so that they don't reduce the balance should it turn negative. The second call to the method eatHeartily above did not affect the balance, since the balance would have otherwise become negative. Add the following method to the PaymentCard class: addMoney() The purpose of the method is to increase the card's balance by the amount of money given as a parameter. However, the card's balance may not exceed 150 euros. As such, if the amount to be topped up exceeds this limit, the balance should, in any case, become exactly 150 euros. Change the addMoney method further, so that if there is an attempt to top it up with a negative amount, the value on the card will not change. Write code in the main method of the MainProgram class that contains the following sequence of events: - Create Paul's card. The opening balance of the card is 20 euros - Create Matt's card. The opening balance of the card is 30 euros - Paul eats heartily - Matt eats affordably - The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it) - Paul tops up 20 euros - Matt eats heartily - The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it) - Paul eats affordably - Paul eats affordably - Matt tops up 50 euros - The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)

17. Implement the class Items described here. NB! Don't modify the class Item. Write a program that reads names of items from the user. If the name is empty, the program stops reading. Otherwise, the given name is used to create a new item, which you will then add to the items list. Having read all the names, print all the items by using the toString method of the Item class. The implementation of the Item class keeps track of the time of creation, in addition to the name of the item. 

18. The program described here should be implemented in the class PersonalInformationCollection. NB! Do not modify the class PersonalInformation. After the user has entered the last set of details (they enter an empty first name), exit the repeat statement. Then print the collected personal information so that each entered object is printed in the following format: first and last names separated by a space (you don't print the identification number).

19. Implement a program that begins by reading television programs from the user. When the user inputs an empty string as the name of the program, the program stops reading programs.After this the user is queried for a maximum duration. Once the maximum is given, the program proceeds to list all the programs whose duration is smaller or equal to the specified maximum duration.

20. Write a program that first reads book information from the user. The details to be asked for each book include the title, the number of pages and the publication year. Entering an empty string as the name of the book ends the reading process. After this the user is asked for what is to be printed. If the user inputs "everything", all the details are printed: the book titles, the numbers of pages and the publication years. However, if the user enters the string "name", only the book titles are printed. 

21. Write a program that reads strings from the user until the user inputs the string "end". At that point, the program should print how many strings have been read. The string "end" should not be included in the number strings read. You can find some examples below of how the program works.

22. Write a program that reads strings from the user until the user inputs the string "end". As long as the input is not "end", the program should handle the input as an integer and print the cube of the number provided (i.e., number _ number _ number). Below are some sample outputs

23. Create a file called file.txt in the root folder (the folder containing the folder src and the file pom.xml) of the exercise template using the Files-tab in NetBeans. Edit the file and write the message Hello, world! on the first line of the file.

24. Write a program that prints the contents of a file called "data.txt", such that each line of the file is printed on its own line.

25. Write a program that asks the user for a string, and then prints the contents of a file with a name matching the string provided. You may assume that the user provides a file name that the program can find. The exercise template contains the files "data.txt" and "song.txt", which you may use when testing the functionality of your program. The output of the program can be seen below for when a user has entered the string "song.txt". The content that is printed comes from the file "song.txt". Naturally, the program should also work with other filenames, assuming the file can be found.

26. The exercise template comes ready with functionality for the guest list application. It checks whether names entered by the user are on the guest list. However, the program is missing the functionality needed for reading the guest list. Modify the program so that the names on the guest list are read from the file.

27. The exercise template comes with two files, names.txt and other-names.txt. Write a program that first asks the user for the name of the file to be read, after which the user is prompted for the string that they're looking for. The program then reads the file and searches for the desired string. If the string is found, the program should print "Found!". If not, the program should print "Not found.". If reading the file fails (the reading ends in an error) the program should print the message "Reading the file " + file + " failed.".

28. Write a program that prompts the user for a filename, as well as the upper and lower bounds for the accepted range of numbers. Then the program reads the numbers contained in the file (each number is on its own line) and only accounts for the numbers which are inside the given range. Finally, the program should print the number of numbers that were inside the given range. You can convert a string-type integer read from a file into a proper integer using the command Integer.valueOf (just as when handling input from a user).

29. In this exercise, we'll be working with files stored in CSV-format that contain names and ages separated by commas. Your task is to write a program that first prompts the user for the name of the file they want to read. The program then prints the content of the file. 

30. In this exercise, we'll be working with files stored in CSV format, which contain names and ages separated by commas. The exercise template already has a Person class, and the class StoringRecords has a body for the method public static ArrayList<Person> readRecordsFromFile(String file). Implement the readRecordsFromFile method such that it reads the persons from the file passed as a parameter, and finally returns them in the list returned by the method.

31. In this exercise, we'll be working with files stored in CSV format. Each line of the file contains the home team, visiting team, home team points, and visiting team points, all separated by commas. Write a program that prompts the user for a filename, after which it reads the match statistics from the file. The program then prompts the user for the name of a team, and prints the data specified in the following parts for that team. Extend the program so that it has the ability to print the number of wins and losses of a given team. The winner of a game is the team that has gained more points from it.


# Part 5 - primitive and reference variables, functions
# Part 6 - testing, backend
# Part 7 - algorithms
