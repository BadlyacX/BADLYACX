class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

class Stack:
    def __init__(self):
        self.top = None
        self.size = 0
        
    def push(self, value):
        new_node = Node(value)
        new_node.next = self.top
        self.top = new_node
        self.size += 1
    
    def pop(self):
        if self.top is None:
            raise IndexError("pop from empty stack")
        popped_value = self.top.value
        self.top = self.top.next
        self.size -= 1
        return popped_value
        
    def peek(self):
        if self.top is None:
            raise IndexError("peek from empty stack")
        return self.top.value
    
    def is_empty(self):
        return self.top is None

if __name__ == "__main__":
    s = Stack()

    print("Is empty?", s.is_empty())  # True

    s.push(10)
    s.push(20)
    s.push(30)

    print("Top value (peek):", s.peek())  # 30
    print("Is empty?", s.is_empty())     # False

    print("Pop:", s.pop())  # 30
    print("Pop:", s.pop())  # 20
    print("Pop:", s.pop())  # 10

    try:
        s.pop()
    except IndexError as e:
        print("Error caught:", e)
