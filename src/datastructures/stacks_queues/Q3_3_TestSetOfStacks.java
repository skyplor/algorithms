package datastructures.stacks_queues;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import datastructures.implementations.MyStackImpl;

//have a pointer, this pointer knows the current stack's size and which stack.
public class Q3_3_TestSetOfStacks<T>
{
	final int threshold = 3;
	int curStackPointer = 0;
	int curSize = 0;
	Map<Integer, MyStackImpl<T>> current;

	public Q3_3_TestSetOfStacks(T data)
	{
		// create a new stack
		MyStackImpl<T> stack = new MyStackImpl<T>(data);
		curSize++;
		// using a hashmap with id and stack
		current = new HashMap<Integer, MyStackImpl<T>>();
		current.put(curStackPointer, stack);
	}

	public void push(T data)
	{
		// if current stack size exceeds threshold, we create another stack, change current stack to the new stack, push the data in and
		if (curSize < threshold)
		{
			MyStackImpl<T> currentStack = current.get(curStackPointer);
			currentStack.push(data);
			curSize++;
		}
		else
		{
			// create a new stack, increment the curStackPointer, reset curSize
			MyStackImpl<T> stack2 = new MyStackImpl<T>(data);
			curStackPointer++;
			curSize = 1;
			current.put(curStackPointer, stack2);
		}
	}

	public T pop()
	{
		if (current != null)
		{
			MyStackImpl<T> currentStack = current.get(curStackPointer);
			T popdata = currentStack.pop();
			curSize--;
			if (curSize == 0)
				curStackPointer--;
			return popdata;
		}
		else
			return null;
	}

	public Set<Map.Entry<Integer, MyStackImpl<T>>> getCurrentEntryKey()
	{
		return current.entrySet();
	}

	public int getCurStackPointer() throws AssertionError
	{
		return curStackPointer;
	}

	public int getCurSize()
	{
		return curSize;
	}

	public static void main(String[] args)
	{
		Q3_3_TestSetOfStacks<Integer> testStacks = new Q3_3_TestSetOfStacks<Integer>(10);
		testStacks.push(11);
		System.out.println("CurrentStackPointer: " + testStacks.getCurStackPointer());
		System.out.println("CurrentStackSize: " + testStacks.getCurSize());
		testStacks.push(12);
		System.out.println("CurrentStackPointer: " + testStacks.getCurStackPointer());
		System.out.println("CurrentStackSize: " + testStacks.getCurSize());
		testStacks.push(13);
		System.out.println("CurrentStackPointer: " + testStacks.getCurStackPointer());
		System.out.println("CurrentStackSize: " + testStacks.getCurSize());
		Set<Map.Entry<Integer, MyStackImpl<Integer>>> current = testStacks.getCurrentEntryKey();
		for (Map.Entry<Integer, MyStackImpl<Integer>> entry : current)
		{
			System.out.println("Entry: " + entry.getKey());
		}
		for (int i = 0; i < 4; i++)
			System.out.println("Pop: " + testStacks.pop());
	}
}
