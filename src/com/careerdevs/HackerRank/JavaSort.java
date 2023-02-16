import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        //compare by cpga
        Comparator <Student> newStudent = new Comparator<Student>() {
            public int compare(Student cGpA1, Student cGpA2){
                return Double.compare(cGpA2.getCgpa(), cGpA1.getCgpa());
            }
        };

        Collections.sort(studentList,newStudent);



        //compare by name
        Comparator<Student> compareByNComparator = new Comparator<Student>() {
            public int compare(Student o1, Student o2) {

                int comp = Double.compare(o2.getCgpa(), o1.getCgpa());

                if(comp == 0){
                    comp = o1.getFname().compareTo(o2.getFname());
                }

                return comp;
            }

        };


        Collections.sort(studentList, compareByNComparator);



        //compare by id
        Comparator<Student> compareById = new Comparator<Student>() {
            public int compare(Student id1, Student id2){


                return Integer.compare(id1.getId(), id2.getId());
            }
        };


        for(Student st: studentList){

            System.out.println(st.getFname());
        }

     //big INTEGER algorithim
        public class Solution {

            public static void main(String[] args) {
                /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                Scanner scanny = new Scanner(System.in);
                String firstInt = scanny.nextLine();
                String nextInt = scanny.nextLine();

                BigInteger inter = new BigInteger(firstInt);
                BigInteger inter2 = new BigInteger(nextInt);



                System.out.println(inter.add(inter2));
                System.out.println(inter.multiply(inter2));
            }
        }

//completing string format algorithim
        public class Solution {

            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("================================");
                for(int i=0;i<3;i++){
                    String s1=sc.next();
                    int x=sc.nextInt();
                    //Complete this line/ using system.out.print f
                    System.out.printf("%-15s%03d%n",s1,x);

                }
                System.out.println("================================");

            }
        }

    }
}


