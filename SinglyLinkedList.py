class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def listlength(self):
        cur_node = self.head
        length = 0
        while cur_node is not None:
            length +=1
            cur_node = cur_node.next
        return length
    def insertAtHead(self, newNode):
        new_head = self.head
        self.head = newNode
        self.head.next = new_head
        del new_head
    def insertAt(self, newNode, position):
        if position<=0 or position>self.listlength():
            print("Invalid Input")
            return
        if position is 1:
            self.insertAtHead(newNode)
            return
        current_node = self.head
        current_pos = 1
        while current_pos < position and current_node.next is not None:
            current_pos += 1
            previous_node = current_node
            current_node = current_node.next
        newNode.next = current_node
        previous_node.next = newNode
        #self.head = newNode

    def insertAtEnd(self, newNode):
        if self.head is None:
            self.head = newNode
        else:
            lastNode = self.head
            while lastNode.next is not None:
                lastNode = lastNode.next
            lastNode.next = newNode
    def deleteHead(self):
        if self.head is not None:
            self.head = self.head.next
    def deleteAt(self, position):
        if position<=0 and position>self.listlength():
            print("Invalid Input")
            return
        if position is 1:
            self.deleteHead()
            return
        current_node = self.head
        pos =1
        while pos!=position and current_node.next is not None:
            pos +=1
            prev_node = current_node
            current_node = current_node.next
        prev_node.next = current_node.next
        current_node.next = None
    def deleteEnd(self):
        last_node = self.head
        while last_node.next is not None:
            previous_node = last_node
            last_node = last_node.next
        previous_node.next = None
        del last_node
    def printlinkedList(self):
        if self.head is None:
            print("Empty LinkedList")
            return
        currentNode = self.head
        while currentNode is not None:
            print(currentNode.data)
            currentNode = currentNode.next
s_linkedlist = LinkedList()
firstNode = Node('Chaitanya')
s_linkedlist.insertAtEnd(firstNode)
secondNode = Node('Yash')
s_linkedlist.insertAtEnd(secondNode)
thirdNode = Node('Shubham')
s_linkedlist.insertAtEnd(thirdNode)
fourthNode = Node('Parvender')
s_linkedlist.insertAtEnd(fourthNode)
fifthNode = Node('Sunny')
s_linkedlist.insertAtHead(fifthNode)
sixthNode = Node('Shreyas')
s_linkedlist.insertAtHead(sixthNode)
seventhNode = Node('Mukund')
s_linkedlist.insertAt(seventhNode, 1)
s_linkedlist.deleteEnd()
s_linkedlist.deleteAt(3)
s_linkedlist.printlinkedList()
