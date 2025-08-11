//Write a JAVA Program to make a Student class with proper attributes like roll no, name, stream, and college.

class Student{
    int roll;                                               //class variables
    String name,stream,clg;
    public Student(int r,String n,String s,String c){       //constructor to initialize the obj
        this.roll=r;        // Assign the passed roll number (r) to the instance variable 'roll'
        this.name=n;
        this.stream=s;
        this.clg=c;
    }
    int getRoll(Student details1){      //method to return int value(int getRoll), accepts parameter as Student obj
        return details1.roll;           //returns roll of passed Student obj
    }

    String getName(Student details2){
        return details2.name;
    }

    String getStream(Student details3){        //  EITHER THIS[Method_parameter.Class_variable]
        return details3.stream;               //         |
    }                                        //          |
                                            //           V
    String getClg(){                       //         OR THIS[this.Class_variable]
        return this.clg;
    }
}

public class eight {
    public static void main(String[] args) {
        Student anu= new Student(5,"Anurag","ECE","AOT");       //Student obj anu

        Student sum= new Student(1,"sumrina","CSE","AOTS");     //Student obj sum

        System.out.printf("roll=%d\nname=%s\ndept=%s\nclg=%s\n",
                anu.getRoll(anu),anu.getName(anu),anu.getStream(anu),anu.getClg());      //call getRoll(),...passing anu from anu

        System.out.println();

        System.out.printf("roll=%d\nname=%s\ndept=%s\nclg=%s\n",
                sum.getRoll(sum),sum.getName(sum),sum.getStream(sum),sum.getClg());
    }
}
