package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for(int i =1; i <=height; i++){
            String  side = "";
            for(int a = 1; a<=length; a++){
                if(i==1 || i==height){
                    side += 8;
                }else {
                    if(a==1 || a ==length) {
                        side += "8";
                    }else{side += " ";}
                }
            }
            System.out.println(side);
        }
    }
}
