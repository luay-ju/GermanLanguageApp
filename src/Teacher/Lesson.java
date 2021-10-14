package Teacher;


public class Lesson implements Launch{
    private String lessonName ;
    private int lessonNumber ;

    public Lesson(String name, int number ) {
        lessonName = name;
        lessonNumber = number;
    }
    public String getName() {
        return this.lessonName;
    }
    public String toString() {
        return  "Unterrichts " + this.lessonNumber + " : "+ this.lessonName + "\n";
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

}
