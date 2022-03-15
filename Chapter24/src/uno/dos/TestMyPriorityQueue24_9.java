package uno.dos;

import java.util.Comparator;

public class TestMyPriorityQueue24_9 {
    public static void main(String[]args){
        Patient patient1 = new  Patient("John",2);
        Patient patient2 = new  Patient("Jim", 1);
        Patient patient3 = new  Patient("Tim", 5);
        Patient patient4 = new  Patient("Cindy",7);

        MyPriorityQueue24_8<Patient> priorityQueue = new MyPriorityQueue24_8<>();
        priorityQueue.enqueue(patient1);
        priorityQueue.enqueue(patient2);
        priorityQueue.enqueue(patient3);
        priorityQueue.enqueue(patient4);

        while (priorityQueue.getSize() > 0)
            System.out.println(priorityQueue() + " ");
    }

    static class Patient implements Comparable<Patient> {
        private String name;
        private int priority;
        public Patient (String name, int priority){
            this.name = name;
            this.priority = priority;
        }
        @Override
        public String toString (){
            return name + "(priority:" + priority + ")";
        }

        @Override
        public int compareTo(Patient patient){
            return this.priority - patient.priority;
        }
    }
}