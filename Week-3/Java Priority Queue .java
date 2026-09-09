import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>(
            (a, b) -> {
                if (Double.compare(b.getCGPA(), a.getCGPA()) != 0) {
                    return Double.compare(b.getCGPA(), a.getCGPA());
                }

                if (!a.getName().equals(b.getName())) {
                    return a.getName().compareTo(b.getName());
                }
                return Integer.compare(a.getID(), b.getID());
            }
        );
        for (String event : events) {

            String[] parts = event.split(" ");

            if (parts[0].equals("ENTER")) {

                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);

                pq.add(new Student(id, name, cgpa));

            } else if (parts[0].equals("SERVED")) {

                if (!pq.isEmpty()) {
                    pq.poll();
                }
            }
        }
        List<Student> result = new ArrayList<>();

        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        return result;
    }
  
}

#Input 
  12
  ENTER John 3.75 50
  ENTER Mark 3.8 24
  ENTER Shafaet 3.7 35
  SERVE
  SERVED
  ENTER Samiha 3.85 36
  SERVED
  ENTER Ashley 3.9 42
  ENTER Maria 3.6 46
  ENTER Anik 3.95 49
  ENTER Dan 3.95 50
  SERVED

  #Output
    Dan
    Ashley
    Shafaet
    Maria
