package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for(int i = 1; i<=cathetusLength; i++){
            String triangle = "";
            for(int a = 1; a<=i; a++){
                triangle += 8;
            }
            System.out.println(triangle);
        }
    }
}
