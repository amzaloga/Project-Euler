//this improt of the java util will most likey be trash
//import java.util.Arrays;

public class Main2 {
	private int[] queueArray;
	int queueSize;
	private int front, rear, numbOfItems = 0;

	Main2(int size) {

		queueSize = size;
		queueArray = new int[size];
	}

	// this insert will most likely be trashed
	public void insert(int input) {
		if (numbOfItems + 1 == queueSize) {
			grow();
		}

		queueArray[rear] = input;
		rear++;
		numbOfItems++;
		System.out.println(input + " was added");

	}

	public void enqueue(int input) {
		if (front == (rear + 1) % queueArray.length) {
			grow();
		}
		queueArray[rear] = input;
		rear = (rear + 1) % queueArray.length;
		System.out.println(input + " was added");

	}

	public void grow() {
		int[] temp = new int[queueArray.length + 1];
		for (int i = 0; i < queueArray.length; i++) {
			temp[i] = queueArray[(i + front) % queueArray.length];
		}
		front = 0;
		rear = queueArray.length - 1;
		queueArray = temp;
	}

	public void dequeue() {
		if (queueArray.length != 0) {
			System.out.println(queueArray[front] + " was removed");
			queueArray[front]= 0;
			front--;
		}

	}

	public void printCoach() {
		System.out.print("Coach Line: ");
		for (int coach : queueArray) {
			System.out.print(coach + " ");
		}
	}

	public void lengthOfQueue() {
		System.out.println("\nThe max length: " + (queueArray.length - 1));
	}

	// not sure whether I'll need this as i can count the max amount of
	// or people in the queues by calling the length of the queue
	public void shrink() {

	}

	

	public static void main(String[] args) {
		Main2 coach = new Main2(1);
		//since the insert method is trash, these too, will be trash
		// coach.insert(1);
		// coach.insert(2);
		// coach.insert(3);
		// coach.insert(4);

		coach.enqueue(1);
		coach.enqueue(2);
		coach.enqueue(3);
		coach.enqueue(4);
		coach.enqueue(5);
		coach.enqueue(6);
		coach.enqueue(7);

		coach.printCoach();
		coach.lengthOfQueue();
		
		//coach.dequeue();
		//coach.printCoach();

	}
}