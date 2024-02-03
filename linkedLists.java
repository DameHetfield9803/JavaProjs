public class linkedLists{
	node head;
	static class node{
		int data;
		node next;
		node(int d){ 
			data = d;
			next = null;
			}	
		}
	public static linkedLists insert(linkedLists list, int data) {
		node new_node = new node(data);
		if(list.head == null) {
			list.head = new_node;
		}
		else {
			node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		
		return list;
	}
	
	public static void printList(linkedLists list) {
		node currNode = list.head;
		System.out.println("Linked list: ");
		while(currNode != null) {
			System.out.print(currNode.data + " \n");
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		linkedLists list = new linkedLists();
		list = insert(list,2);
		list = insert(list, 420);
		list = insert(list, 69);
		printList(list);
	}
}