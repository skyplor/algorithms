package datastructures.stacks_queues;

import datastructures.implementations.MyStackImpl;

public class Q3_5_Queue2StacksImpl<T>
{
	MyStackImpl<T> newStack, oldStack;

	// enqueue - push into newStack, then pop everything from newStack, push into oldStack
	// dequeue - pop from oldStack

	public Q3_5_Queue2StacksImpl(T data)
	{
		newStack = new MyStackImpl<T>(data);
	}

	public void enqueue(T data)
	{
		// while we still have elements in newstack, push everything into oldstack
		newStack.push(data);
	}

	public T dequeue()
	{
		if (oldStack == null || oldStack.size() == 0)
		{
			oldStack = new MyStackImpl<T>();
		}
		// pop all element from newStack and push into old stack. then pop from oldstack
		while (newStack.size() > 0)
		{
			oldStack.push(newStack.pop());
		}
		return oldStack.pop();
	}

	public static void main(String[] args)
	{
		Q3_5_Queue2StacksImpl<Integer> queue = new Q3_5_Queue2StacksImpl<Integer>(10);
		queue.enqueue(11);
		queue.enqueue(12);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}
}
