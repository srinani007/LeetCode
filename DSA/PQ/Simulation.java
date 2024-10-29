package PQ;

import java.util.PriorityQueue;
class Event implements Comparable<Event> {
    private int priority;
    private String description;

    public Event(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }
    
    public int compareTo(Event other) {
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return "Event [priority=" + priority + ", description=" + description + "]";
    }
    
}
public class Simulation {
    public static void main(String[] args) {
        PriorityQueue<Event> eventQueue = new PriorityQueue<>();
        eventQueue.add(new Event(3, "Low priority event"));
        eventQueue.add(new Event(1, "High priority event"));
        eventQueue.add(new Event(2, "Medium priority event"));

        while (!eventQueue.isEmpty()) {
            Event event = eventQueue.poll();
            System.out.println(event); 
        }
    }

}
