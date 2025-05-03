class Node:
    def __init__(self, value):
        self.value = value
        self.next = None
class Queue:
    def __init__(self):
        self.head = None
        self.tail = None

    def push(self, value):
        new_node = Node(value)
        if self.head is None:
            self.head = new_node
            self.tail = self.head
        else:
            self.tail.next = new_node
            self.tail = new_node
            
    def pop(self):
        if self.head is None:
            raise IndexError("pop from empty queue")
        popped_value = self.head.value
        self.head = self.head.next
        if self.head is None:
            self.tail = None
        return popped_value

    def peek(self):
        if self.head is None:
            raise IndexError("peek from empty queue")
        else:
            return self.head.value 
        
    def is_empty(self):
        return self.head is None

if __name__ == "__main__":
        q = Queue()

        print("Is empty？", q.is_empty())  # True

        q.push(10)
        q.push(20)
        q.push(30)

        print("peek：", q.peek())  # 10
        print("pop：", q.pop())    # 10
        print("pop：", q.pop())    # 20
        print("Is empty?", q.is_empty())  # False
        print("peek：", q.peek())  # 30
        print("pop：", q.pop())    # 30
        print("Is empty?", q.is_empty())  # True

        try:
            q.pop()
        except IndexError as e:
            print("expected error：", e)

        try:
            q.peek()
        except IndexError as e:
            print("expected errror：", e)
