/**
 * * This class tests the LinkList.
 * 
 * @author Mikolaj Wieczorek
 */

import java.util.Random;

public class TestLinkedList {

	public static void main(String[] args) {
		// Random method object imported
		Random random = new Random();
		// object list for linked list creates
		LinkList lt = new LinkList();
		// for loop will generate 25 random numbers
		for (int i = 0; i <= 25; i++) {
			// random numbers are generated between 0 and 100
			int rInteger = random.nextInt(101);
			while (lt.find(rInteger) == false)// while prevents repeat values
			{
				// random integer is also inserted
				Integer num = new Integer(rInteger);
				lt.add(rInteger, num);
			}

		}
		System.out.println("Random Linked-List");
		System.out.println(lt.toString());
		lt.order();// sorts values from least to greatest
		System.out.println("LinkedList is now sorted");

		System.out.println(lt.toString());// prints sorted list
		System.out.println("");
		System.out.println("Start of Removing List");

		// for loop will remove each "key" and "payLoad"
		for (int i = 0; i < lt.size(); i++) {
			while (lt.size() >= 0)// runs until list is empty
			{
				int rInteger = random.nextInt(101);
				if (lt.find(rInteger) == true)// checks if random number is in linked list
				{
					int location = lt.FindPosition(rInteger);// finds the position of random number
					lt.remove(location);// removes number based on the index location
					System.out.println(lt.toString());// prints new linked list
					System.out.println("List Size: " + lt.size() + " number removed " + rInteger);
				}
				// breaks out of while once list is empty
				if (lt.size() == 0)
					break;
			}

		}

	}

}
