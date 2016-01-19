package queue;
public class Client {

	public static void main(String[] args) {

		/* Queue Using ArrayList */
		System.out.println("Queue using ArrayList");

		QueueArrayList queueList = new QueueArrayList();
		queueList.add(1);
		queueList.add(2);
		queueList.add("Hello");
		queueList.add(3);
		System.out.println(queueList.disp());
		System.out.println(queueList.remove());
		System.out.println(queueList.disp());

		System.out.println();
		System.out.println();
		System.out.println();

		/* Queue Using Arrays */
		System.out.println("Queue using Arrays");
		QueueArrays queueArray = new QueueArrays(3);
		queueArray.disp();
		System.out.println(queueArray.add(2));
		System.out.println(queueArray.add(3));
		System.out.println(queueArray.add("hi"));
		System.out.println(queueArray.add(4));
		queueArray.disp();

		System.out.println(queueArray.remove());
		System.out.println(queueArray.remove());
		System.out.println(queueArray.remove());
		System.out.println(queueArray.remove());
		queueArray.disp();
	}

}
