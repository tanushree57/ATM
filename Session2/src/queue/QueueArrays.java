package queue;

public class QueueArrays {

	private Object[] arr;
	int front = 0;
	int rear = -1;

	public QueueArrays(int size) {
		arr = new Object[size];
	}

	public String add(Object pushedElement) {
		if (rear < arr.length - 1) {
			arr[++rear] = pushedElement;
			return "Enqueued " + pushedElement;
		} else {
			return "Overflow. Queue full.";
		}
	}

	public Object remove() {
		if (front > rear) {
			return "Underflow. Queue empty.";
		} else {
			return "Dequeued " + arr[front++];
		}
	}

	public void disp() {
		System.out.print("Queue Elements: ");
		for (int i = front; i <= rear; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

}
