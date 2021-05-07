package com.company;
import java.util.Scanner;

class SingleLinkedList {
    private Node head;
    private int size = 0;

    //{
    public void insert(int data){
        //create a new Node and store a data.
        Node node = new Node();
        node.data = data;
        node.nextNode = null;

        //check the head is null or not.
        //if head is null, assign the node and exit.
        if(this.head == null){
            head = node;
            size++;
            return;
        }

        //asign a head into the temp node and loop it until find the null reference.
        Node tempNode = this.head;
        while (tempNode.nextNode != null){
            tempNode = tempNode.nextNode;
        }

        //assign new node
        tempNode.nextNode = node;
    }
    //}


    public void insertNth(int data, int position){
        //create new node.
        Node node = new Node();
        node.data = data;
        node.nextNode = null;

        if(this.head == null){
            //if head is null and position is zero then exit.
            if(position !=0){
                System.out.println("The list is empty, you can inster at 0");
                return;
            } else
            {
                //node set to the head
                this.head = node;
                size++;
            }
        }

        if (head != null && position == 0){
            node.nextNode = this.head;
            this.head = node;
            size++;
            return;
        }

        Node current = this.head;
        Node previous = null;
        int i =0;

        while(i < position){
            previous = current;
            current = current.nextNode;

            if (current == null){
                break;
            }

            i++;
        }

        node.nextNode = current;
        previous.nextNode = node;
        size++;
    }

    public int getSize(){
//        System.out.println(size);
        return size;
    }
    //print the size of the list
    public void print(){
        if (this.head == null){
            System.out.println("The List is empty");
            return;
        }

        //Print all nodes
        Node tempNode = this.head;
        while (tempNode !=null){
            System.out.println(tempNode.data + "->");
            tempNode = tempNode.nextNode;
        }
        System.out.println("The list is empty");
    }

}


